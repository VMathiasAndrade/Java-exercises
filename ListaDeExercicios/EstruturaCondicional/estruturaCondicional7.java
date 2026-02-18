import java.util.*;

// Faça um Programa que leia três números e mostre o MAIOR E O MENOR deles.


public class estruturaCondicional7 {

    
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner (System.in);

        System.out.printf("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.printf("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.printf("Enter the third number: ");
        int number3 = scanner.nextInt();

        int greatest = number1;

        if (number2 > greatest) {
            greatest = number2;
        }

        if (number3 > greatest) {
            greatest = number3;
        }

        int smallest = number1;

        if (number2 < smallest) {
            smallest = number2;
        }

        if (number3 < smallest) {
            smallest = number3;
        }

        System.out.println("The greatest number is: " + greatest);
        System.out.println("The smallest number is: " + smallest);


        scanner.close();
    }
}
