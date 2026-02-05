package model;

public class WeatherStation extends Observable implements Runnable{
    private int temperature;
    private int min = -50, max = 50;
    public WeatherStation(){

        this.temperature = min + (int)(Math.random() * ((max - min) + 1));
    }
    public void decrease(){
        this.temperature -= 1;
        notifyObservers();
    }
    public void increase() {
        this.temperature += 1;
        notifyObservers();
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void run() {
        try {
            while (true) {
                if (this.temperature == min) {increase();}
                else if (this.temperature == max) {decrease();}
                else if (Math.random() < 0.5) {
                    increase();
                } else {
                    decrease();
                }
                Thread.sleep((1 + (int)(Math.random() * 5 ))*1000);  // write one value/second
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
            return;
        }
    }
}
