package day2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bookmain {


        public static void main(String[] args) {

            // Opret en liste til at holde bogobjekterne
            List<Book> bookCollection = new ArrayList<>();

            // Tilføj bogobjekter til listen
            bookCollection.add(new Book("Dracula", "Bram Stoker", "Gyser", 1897, 5));
            bookCollection.add(new Book("1984", "George Orwell", "Dystopi", 1949, 4));
            bookCollection.add(new Book("To Kill a Mockingbird", "Harper Lee", "Fiktion", 1960, 3));

            // Udskriv oplysningerne om hver bog i listen
            for (Book book : bookCollection) {
                System.out.println(book);
            }


            double averageRating = bookCollection.stream()
                    .mapToInt( b -> b.getRating())
                    .average().getAsDouble();
                    //.toString();
            System.out.println("Average Rating of All Books: " + averageRating);

// filter bokk med year

            int specificYear = 1950;
            List<Book> booksAfterSpecificYear = bookCollection.stream()
                    .filter(book -> book.getYear() > specificYear)
                    .collect(Collectors.toList());
            System.out.println("Books published after " + specificYear + ":");
            booksAfterSpecificYear.forEach(System.out::println);

            for(Book b :bookCollection){
                if(b.getYear() > 1950){
                    System.out.println("bøjer adler en "+ b);
                }
            }



            List<Book > sortbookbyRating = bookCollection.stream()
                    .sorted(Comparator.comparingDouble(Book::getRating).reversed())
                    .collect(Collectors.toList());
            sortbookbyRating.forEach(System.out::println);

            List<Book> sortbookbyYear = bookCollection.stream()
                    .sorted(Comparator.comparingInt(Book::getYear))
                    .collect(Collectors.toList());

            int totalRating = bookCollection.stream()
                    .map(Book::getRating)
                    .reduce(0, Integer::sum);
            System.out.println("Total number of retaning for all books: " + totalRating);







        }



        }


