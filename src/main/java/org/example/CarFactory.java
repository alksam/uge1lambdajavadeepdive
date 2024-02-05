package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;


public class CarFactory {



    public static void main(String[] args) {
        List<String> carNames = Arrays.asList("Mercedes","BMW","Audi","Tesla","Ford","Fiat","Peugeot","Citroen","Renault","Toyota");
        Supplier<Car> carSupplier = () -> {
            Random random = new Random();
            int randomIndex = new Random().nextInt(carNames.size());
            String randomName = carNames.get(randomIndex);
            double randomPrice = random.nextDouble() * 1000000;
            return new Car(randomName, randomPrice);
        };
        List<Car> cars = createCars(10, carSupplier);
        cars.forEach(System.out::println);
    }

    public static List<Car> createCars(int numCars, Supplier<Car> supplier) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < numCars; i++) {
            cars.add(supplier.get());
        }
        return cars;
    }
}