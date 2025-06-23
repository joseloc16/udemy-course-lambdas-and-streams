package com.debuggeando_ideas.lambdas;

import java.util.List;

public class CodeChallenge {

    public static void main(String[] args) {
        List<String> countries = List.of("Colombia", "Peru", "Mexico", "Argentina", "Chile");

        // Tradicional
        for (String country : countries) {
            System.out.println(country);
        }

        // Usando una expresión lambda
        countries.forEach(country -> System.out.println(country.toUpperCase()));
    }
}
