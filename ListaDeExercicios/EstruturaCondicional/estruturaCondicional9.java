import java.util.*;

// Faça um Programa que leia três números e mostre-os em ordem decrescente.

public class estruturaCondicional9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.printf("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.printf("Enter the third number: ");
        int number3 = scanner.nextInt();

        if (number1 >= number2 && number2 >= number3) {
            System.out.println("Descending order: " + number1 + ", " + number2 + ", " + number3);
        } else if (number1 >= number3 && number3 >= number2) {
            System.out.println("Descending order: " + number1 + ", " + number3 + ", " + number2);
        } else if (number2 >= number1 && number1 >= number3) {
            System.out.println("Descending order: " + number2 + ", " + number1 + ", " + number3);
        } else if (number2 >= number3 && number3 >= number1) {
            System.out.println("Descending order: " + number2 + ", " + number3 + ", " + number1);
        } else if (number3 >= number1 && number1 >= number2) {
            System.out.println("Descending order: " + number3 + ", " + number1 + ", " + number2);
        } else {
            System.out.println("Descending order: " + number3 + ", " + number2 + ", " + number1);
        }

        scanner.close();
    }

}
