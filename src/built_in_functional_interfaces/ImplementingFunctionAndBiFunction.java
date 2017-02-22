package built_in_functional_interfaces;


import java.util.function.BiFunction;
import java.util.function.Function;

public class ImplementingFunctionAndBiFunction {


    public static void main (String[] args){
        implementingFunction();
        implementingBiFunction();
    }


    private static void implementingFunction(){
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();

        System.out.println(f1.apply("cluck"));
        System.out.println(f2.apply("cluck"));

    }


    private static void implementingBiFunction(){
        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("baby", "chick"));
        System.out.println(b2.apply("baby", "chick"));

        System.out.println(b2.andThen(x -> x.charAt(5)).apply("baby", "chick"));
    }



}
