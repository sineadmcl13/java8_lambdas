package lambdas_and_method_references.service;

import lambdas_and_method_references.pojos.Duck;

public class DuckHelper {

    public static int compareByWeight(Duck d1, Duck d2) {
        return d1.getWeight() - d2.getWeight();
    }

}
