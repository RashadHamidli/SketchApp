package az.katv1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> obj1 = new ArrayList<>();
        obj1.add(1);
        obj1.add(2);
        obj1.add(3);
        obj1.add(4);
        obj1.add(5);
        List<Integer> obj2 = new ArrayList<>();
        obj1.add(6);
        obj1.add(7);
        obj1.add(8);
        obj1.add(9);
        obj1.add(10);

        LinkedList<List<Integer>> objects = new LinkedList<>();
        objects.add(obj1);
        objects.add(obj2);
        Object[] array = objects.toArray();
        for (Object i:array){
            System.out.println(i);
        }
        List<Integer> peek = objects.peek();
        System.out.println(peek);
        List<Integer> poll = objects.poll();
        System.out.println(poll);
        System.out.println(poll);
    }
}
