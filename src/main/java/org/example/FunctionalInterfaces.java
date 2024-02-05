package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FunctionalInterfaces {

interface Predicate {
    boolean SS (int a );
}
    public static void main(String[] args) {
                // Predicate til at tjekke om et tal er deleligt med 7
                Predicate SS = (a) -> a % 7 == 0;

                List <Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14);


                // Filterer listen med tal, så kun de tal der er delelige med 7 bliver vist
                List <Integer> filtered = numbers.stream()
                .filter(SS::SS)
                .collect(Collectors.toList());

                System.out.println("result "+filtered);
            }
        }

































