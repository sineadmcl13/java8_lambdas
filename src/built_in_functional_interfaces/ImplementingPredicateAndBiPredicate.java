package built_in_functional_interfaces;


import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ImplementingPredicateAndBiPredicate {

    public static void main(String[] args){
        implementingPredicate();
        implementingBiPredicate();
    }


    private static void implementingPredicate(){
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test(""));
        System.out.println(p2.test(""));

    }

    private static void implementingBiPredicate(){
        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);

        System.out.println(b1.test("chicken", "chick"));
        System.out.println(b2.test("chicken", "chick"));

        System.out.println(b1.negate().test("chicken", "chick"));
    }
}
