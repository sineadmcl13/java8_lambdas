package lambdas_and_method_references.service;

import lambdas_and_method_references.pojos.Duck;

import java.util.Comparator;

public class DuckComparator implements Comparator<Duck> {

    @Override
    public int compare(Duck d1, Duck d2) {
        return d1.getWeight() - d2.getWeight();
    }

}
