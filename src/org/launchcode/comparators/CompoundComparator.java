package org.launchcode.comparators;

import org.launchcode.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompoundComparator implements Comparator<City> {
private List<Comparator<City>> comparators = new ArrayList<>();

    public void add(Comparator<City> comp){
        comparators.add(comp);
    }

    public List<Comparator<City>> getComparators(){
        return comparators;
    }

    @Override
    public int compare(City o1, City o2) {
        for (Comparator<City> compr: comparators)
              {
                if (compr.compare(o1, o2) != 0) {
                    return compr.compare(o1, o2);
                }

        }


        return 0;
    }
}