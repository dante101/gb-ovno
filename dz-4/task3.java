package dz-4;


import java.util.LinkedList;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = createList();
        
        System.out.println(ll);
        System.out.println(sumList(ll));
    }


    static LinkedList<Integer> createList() {
        Random rnd = new Random();
        int size = rnd.nextInt(20);
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            int item = rnd.nextInt(20);
            ll.add(item);
        }
        return ll;
    }


    static int sumList(LinkedList<Integer> ll) {
        int sum = 0;
        for (int item : ll) {
            sum += item;
        }
        return sum;
    }

}