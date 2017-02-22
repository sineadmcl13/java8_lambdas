package built_in_functional_interfaces;


import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class ImplementingUnaryOperatorAndBinaryOperator {


    public static void main (String[] args){
       implementingUnaryOperator();
       implementingBinaryOperator();
    }

    private static void implementingUnaryOperator(){
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();

        System.out.println(u1.apply("chirp"));
        System.out.println(u2.apply("chirp"));
    }


    private static void implementingBinaryOperator(){
        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("baby", "chick"));
        System.out.println(b2.apply("baby", "chick"));

        System.out.println(b2.andThen(x -> x.charAt(5)).apply("baby", "chick"));


    }

}
