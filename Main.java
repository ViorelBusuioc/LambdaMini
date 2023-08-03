package dev.lpa;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        // Challenge 1;

        Consumer<String> printTheParts = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };


        Consumer<String> sentence = s -> {
            String[] words = s.split(" ");
            for (var i : words) {
                System.out.println(i);
            }
        };
        sentence.accept("Mihai are milupa mica");


        // Challenge 2


        UnaryOperator<String> oddChecker = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(oddChecker.apply("1234567890"));
        everySecondCharacter(oddChecker, "1234567890");

        Supplier<String> iLoveJava = () -> "I Love Java";
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);


    }

    public static void everySecondCharacter(UnaryOperator<String> function, String string) {
        System.out.println(function.apply(string));
    }
}
