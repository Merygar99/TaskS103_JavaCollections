package level1.exercise2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();

        numberList.add(10);
        numberList.add(8);
        numberList.add(6);
        numberList.add(4);
        numberList.add(2);

        List<Integer> listNumber = new ArrayList<>();

        listNumber.add(1);
        listNumber.add(3);
        listNumber.add(5);
        listNumber.add(7);
        listNumber.add(9);

        ListIterator<Integer> iterator = numberList.listIterator(numberList.size());

//        Iterator<Integer> iteratorList = listNumber.iterator();

        while(iterator.hasPrevious()) {
            listNumber.add(iterator.previous());
        }

        System.out.println(listNumber);

    }
}
