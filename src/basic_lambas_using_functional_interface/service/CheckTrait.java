package basic_lambas_using_functional_interface.service;

import basic_lambas_using_functional_interface.pojos.Animal;

/**
 * A functional interface is an interface that contains a single abstract method
 */
@FunctionalInterface
public interface CheckTrait {

    boolean test(Animal a);
}
