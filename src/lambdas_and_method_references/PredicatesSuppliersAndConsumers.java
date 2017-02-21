package lambdas_and_method_references;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicatesSuppliersAndConsumers {


    /**
     * Predicate is a functional interface that takes a single parameter of any type and returns a boolean.
     * Consumer takes a single parameter of any type and has a void return type.
     * Supplier doesn't take any parameters and returns any type.
     */
    public static void main(String [] args){

        //static method example
        Consumer<List<Integer>> methodRef1 = Collections::sort;
        Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);

        //calling an instance method on a specific instance example
        String str = "abc";
        Predicate<String> methodRef2 = str::startsWith;
        Predicate<String> lambda2 = s -> str.startsWith(s);

        //call an instance method without knowing the instance in advance
        Predicate<String> methodRef3 = String::isEmpty;
        Predicate<String> lambda3 = s -> s.isEmpty();

        // a constructor reference example
        Supplier<ArrayList> methodRef4 = ArrayList::new;
        Supplier<ArrayList> lambda4 = () -> new ArrayList();

    }

}
