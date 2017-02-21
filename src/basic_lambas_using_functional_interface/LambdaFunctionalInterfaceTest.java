package basic_lambas_using_functional_interface;

import basic_lambas_using_functional_interface.pojos.Animal;
import basic_lambas_using_functional_interface.service.CheckTrait;

import java.util.function.Predicate;


public class LambdaFunctionalInterfaceTest {


    public static void main(String [] args){

        Animal animal = new Animal("fish", false, true);

        functionalInterfaceCheck(animal, a -> a.canHop());
        checkWithPredicate(animal, a -> a.canSwim());
    }


    /**
     * This method takes an implementation of the CheckTrait interface and uses the implementation
     * to test the animal that is provided to the method
     */
    private static void functionalInterfaceCheck(Animal animal, CheckTrait trait){
        if(trait.test(animal)){
            System.out.println("print : "+animal);
        }
    }

    /**
     * This method takes an implementation of the the java.util.function Predicate<T> interface
     * to test the animal that is provided to the method
     * Predicate<T> has an abstract method called test
     */
    private static void checkWithPredicate(Animal animal, Predicate<Animal> trait){
        if(trait.test(animal)){
            System.out.println("print with Predicate : "+animal);
        }
    }

}
