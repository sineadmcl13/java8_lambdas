package lambdas_and_method_references;

import lambdas_and_method_references.pojos.Duck;
import lambdas_and_method_references.service.DuckComparator;
import lambdas_and_method_references.service.DuckHelper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class LambdaMethodReference {


    public static void main(String [] args){

        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("mr duck", 12));
        ducks.add(new Duck("mrs quack", 10));

        compareDucksUsingComparator(ducks);
        compareDucksUsingLambdaComparator(ducks);
        compareDucksUsingMethodReferenceComparator(ducks);

    }

    /**
     * This demonstrates a implementation of a the comparator interface and
     * using that implementation to sort a list of ducks
     */
    private static void compareDucksUsingComparator(List<Duck> ducks){

        ducks.sort(new DuckComparator());

        System.out.println("by weight");
        for(Duck d: ducks){
            System.out.println(d.getName() + ":" + d.getWeight());
        }

    }


    /**
     * This demonstrates a implementation of a the comparator interface using a lambda and
     * using that implementation to sort a list of ducks
     */
    private static void compareDucksUsingLambdaComparator(List<Duck> ducks){
        Comparator<Duck> byWeight = (d1, d2) -> DuckHelper.compareByWeight(d1, d2);
        ducks.sort(byWeight);

        System.out.println("by weight with lambda");
        for(Duck d: ducks){
            System.out.println(d.getName() + ":" + d.getWeight());
        }

    }


    /**
     * This demonstrates an implementation of a comparator using method reference and
     * using that implementation to sort a list of ducks
     */
    private static void compareDucksUsingMethodReferenceComparator(List<Duck> ducks){
        Comparator<Duck> byWeight = DuckHelper::compareByWeight;
        ducks.sort(byWeight);

        System.out.println("by weight with method reference");
        for(Duck d: ducks){
            System.out.println(d.getName() + ":" + d.getWeight());
        }

    }



}
