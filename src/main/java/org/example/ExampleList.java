package org.example;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Locale;

public class ExampleList {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Nissan");
        al.add("Porsche");
        al.add("Audi");
        al.add("Hyundai");
        al.add("Ford");
        al.add("Volkswagen");
        al.add("Honda");
        al.add("BMW");
        al.add("Mercedes-Benz");
        al.add("Toyota");

        ListIterator<String> ListIterator = al.listIterator();

        while (ListIterator.hasNext()) {
            String temp = ListIterator.next();

            System.out.println(temp);
        }
    }
}



