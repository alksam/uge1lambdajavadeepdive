package Collectors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Transactionmain {


    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();


        transactions.add(new Transaction(1, 1000, "USD"));
        transactions.add(new Transaction(2, 1600, "EUR"));
        transactions.add(new Transaction(3, 2000, "USD"));
        transactions.add(new Transaction(4, 3000, "EUR"));
        transactions.add(new Transaction(5, 4000, "USD"));
        transactions.add(new Transaction(6, 5000, "Dkr"));
        transactions.add(new Transaction(7, 6000, "SKr"));
        transactions.add(new Transaction(8, 7000, "Dkr"));




        // Calculate the total sum of all transaction amounts
        double totalSum = transactions.stream()
                .mapToDouble(Transaction::getAmount)
                .sum();
        System.out.println("Total sum of all transactions: " + totalSum);

        //currency on usd and sum

        double sum = transactions.stream()
                .filter(transaction -> transaction.getCurrency().equals("USD"))
                .mapToDouble(Transaction::getAmount)
                .sum();
        System.out.println("Total sum of all transactions in USD: " + sum);


        List<Transaction> transactiononUSD = transactions.stream()
                .filter(transaction -> transaction.getCurrency().equals("USD"))
                .collect(Collectors.toList());
        System.out.println("Transactions in USD: " + transactiononUSD);

        // Find the highest transaction amount
        double highestAmount = transactions.stream()
                .mapToDouble(Transaction::getAmount)
                .max().getAsDouble();
        System.out.println("Highest transaction amount: " + highestAmount);


        // Find the average transaction amount
        double averageAmount = transactions.stream()
                .mapToDouble(Transaction::getAmount)
                .average().getAsDouble();
        System.out.println("Average transaction amount: " + averageAmount);



    }
}
