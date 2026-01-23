
public class ButtonA extends Element{


    @Override
    public void display() {
        String fringe = "";
        for (int i=0; i<text.length(); i++){
            fringe += "-";
        }
        System.out.println("*-" + fringe + "-*");
        System.out.println("* " + text + " *");
        System.out.println("*-" + fringe + "-*");
    }
}
