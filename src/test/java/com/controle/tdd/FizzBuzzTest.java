package com.controle.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/*
* SCENARIO 1 : 1 devrait retourner 1
* SCENARIO 2 : 3 devrait retourner Fizz
* SCENARIO 3 : 5 devrait retourner Buzz
* SCENARIO 4 : 15 devrait retourner FizzBuzz
* */
public class FizzBuzzTest {
    @Test
    void fizzBuzz_de_1_devrait_retourner_1() {
        // GIVEN
        int nbre = 1;
        // WHEN
        String resultat = FizzBuzz.de(nbre);
        // THEN
        Assertions.assertThat(resultat).isEqualTo("1");
    }
}
