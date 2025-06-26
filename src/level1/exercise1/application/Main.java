package level1.exercise1.application;

import level1.exercise1.model.Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Month one = new Month("January");
        Month two = new Month("February");
        Month three = new Month("March");
        Month four = new Month("April");
        Month five = new Month("May");
        Month six = new Month("June");
        Month seven = new Month("July");
        Month eight = new Month("August");
        Month nine = new Month("September");
        Month ten = new Month("October");
        Month eleven = new Month("November");
        Month twelve = new Month("December");

        ArrayList<Month> listOfMonths = new ArrayList<>();

        listOfMonths.add(one);
        listOfMonths.add(two);
        listOfMonths.add(three);
        listOfMonths.add(four);
        listOfMonths.add(five);
        listOfMonths.add(six);
        listOfMonths.add(seven);
        listOfMonths.add(nine);
        listOfMonths.add(ten);
        listOfMonths.add(eleven);
        listOfMonths.add(twelve);

        System.out.println("Incomplete list:");
        for(Month month : listOfMonths) {
            System.out.println("- " + month.getName());
        }

        listOfMonths.add(7, eight);

        System.out.println("--------------------------------");

        System.out.println("Complete and ordered list:");
        for(Month month : listOfMonths) {
            System.out.println("- " + month.getName());
        }

        System.out.println("----------------");

        HashSet<Month> monthSet = new HashSet<>(listOfMonths);

        if (addMonthToTheList("January", listOfMonths)) {
            monthSet.add(new Month("January"));
        }

        for(Month month : monthSet) {
            System.out.println(month);
        }

        System.out.println("--------------------------");

        Iterator<Month> iterator = monthSet.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static boolean addMonthToTheList(String month, ArrayList<Month> monthArrayList) {
        Iterator<Month> iterator = monthArrayList.iterator();
        boolean aux = true;
        while(iterator.hasNext()) {
            if (month.equalsIgnoreCase(iterator.next().getName())) {
                aux = false;
            }
        }
        return aux;
    }
}
