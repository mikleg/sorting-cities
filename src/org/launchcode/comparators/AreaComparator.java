package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;



public class AreaComparator implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        return (int) Math.round(-o1.getArea()*100 + o2.getArea()*100);
    }
}