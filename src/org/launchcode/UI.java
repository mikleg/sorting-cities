package org.launchcode;

import org.launchcode.comparators.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//public class UI extends CompoundComparator{
    public class UI{
    //It promts user about comparators and returns a list of comparators
    private CompoundComparator compr = new CompoundComparator();
    private HashMap<Integer, String> choosenComps = new HashMap<>();

    public CompoundComparator getComparator() {
        Scanner in = new Scanner(System.in);
        Integer choiceIdx = 10;
        choosenComps.put(1, "Name");
        choosenComps.put(2, "Area");
        choosenComps.put(3, "Population");
        choosenComps.put(4, "State");
        while (!choosenComps.isEmpty()) {
            System.out.println("Please, choose comparators: ");
            printHash(choosenComps);
            choiceIdx = in.nextInt();
            if (choiceIdx == 4) {
                compr.add(new StateComparator());
                choosenComps.remove(4);
            } else if (choiceIdx == 3) {
                compr.add(new PopulationComparator());
                choosenComps.remove(3);
            } else if (choiceIdx == 2) {
                compr.add(new AreaComparator());
                choosenComps.remove(2);
            } else if (choiceIdx == 1) {
                compr.add(new NameComparator());
                choosenComps.remove(1);
            } else break;
        }
        return compr;
    }
    private static void printHash(HashMap<Integer, String> myhash)
    {
        for (Map.Entry<Integer, String> myEntry : myhash.entrySet())
        {
            System.out.println(myEntry.getKey() + ": " + myEntry.getValue());
        }
    }
}
