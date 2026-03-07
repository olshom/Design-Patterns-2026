import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        startSorting(createRandomList(30), createRandomList(10000), new HeapSorting());
        startSorting(createRandomList(30), createRandomList(10000), new Insertion());
        startSorting(createRandomList(30), createRandomList(10000), new BubbleSort());
    }

    private static void startSorting(List<Integer> smallList, List<Integer> largeList, SortingStrategy sortingStrategy) {
        System.out.println("---");
        System.out.println("Starting small list sorting: " + smallList);
        long startTime = System.currentTimeMillis();
        sortingStrategy.toSort(smallList);
        long endTime = System.currentTimeMillis();
        System.out.println("Sorted list: " + smallList);
        System.out.println("Small list sorting took " + (endTime - startTime) + " ms");
        System.out.println();
        System.out.println("Starting large list sorting");
        System.out.println("First and last elements: " + largeList.get(0) + ", " + largeList.get(largeList.size() - 1));
        startTime = System.currentTimeMillis();
        sortingStrategy.toSort(largeList);
        endTime = System.currentTimeMillis();
        System.out.println("First and last elements after sorting: " + largeList.get(0) + ", " + largeList.get(largeList.size() - 1));
        System.out.println("Large list sorting took " + (endTime - startTime) + " ms");
    }

    private static List<Integer> createRandomList(int size) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(1000)); // Random integers from 0 to 999
        }
        return list;
    }
}
