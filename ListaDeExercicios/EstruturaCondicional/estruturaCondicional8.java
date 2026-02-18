import java.util.*;

/* Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, 
sabendo que a decisão é sempre pelo mais barato. */

public class estruturaCondicional8 {

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner (System.in);

        System.out.printf("Enter the price of the first product: ");
        double price1 = scanner.nextDouble();

        System.out.printf("Enter the price of the second product: ");
        double price2 = scanner.nextDouble();

        System.out.printf("Enter the price of the third product: ");
        double price3 = scanner.nextDouble();

        if (price1 < price2 && price1 < price3) {
            System.out.println("Buy the first product, which costs: " + price1);
        }

        else if (price2 < price1 && price2 < price3) {
            System.out.println("Buy the second product, which costs: " + price2);
        }

        else if (price3 < price1 && price3 < price2) {
            System.out.println("Buy the third product, which costs: " + price3);
        }

        else {
            System.out.println("Two or more products have the same value, which is: " + price1);
        }
        scanner.close();
    
    }
    
}
