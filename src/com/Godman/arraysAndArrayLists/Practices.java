package com.Godman.arraysAndArrayLists;

import java.util.ArrayList;

public class Practices {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        String[] items = new String[5];

        items[0] = "Asa";
        items[1] = "Ada";
        items[2] = "Ama";
        items[3] = "Ata";
        items[4] = "Ala";

        for (String x : items)
            System.out.println(x);

        names.add("home");
        names.add("hole");
        names.add("hoe");
        names.add("hue");
        names.add("jug");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + "=" + names.get(i));
        }
        System.out.println(names.size());
        names.remove(2);
        System.out.println(names.size());
        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + "=" + names.get(i));
        }
        names.add(1, "Juno");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));

        }
    }
}