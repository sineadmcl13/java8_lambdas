package variables_in_lambdas;


public class GorillaFamily {

    String walk = "walk";

    void everyonePlay(boolean baby){
        String approach = "amble";
//        approach = "run";

        play(() -> walk);
        play(() -> baby ? "hitch a ride" : "run");

        /**
         * Lambda expressions can access static variables,
         * instance variables, effectively  nal method parameters,
         * and effectively  nal local variables.
         * This line will fail to compile if line 10 is uncommented
         */
        play(() -> approach);

    }

    void play(Gorilla g){
        System.out.println(g.move());
    }
}
