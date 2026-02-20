import java.util.*;


// Faça um Programa que leia três números e mostre o maior deles. 

public class estruturaCondicional6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter the third number: "); 
        int number3 = scanner.nextInt();

        if (number1 >= number2 && number1 >= number3) {
            System.out.println("The first number is the greatest");
        }

        else if (number2 >= number1 && number2 >= number3) {
            System.out.println("The second number is the greatest");
        }

        else if (number3 >= number1 && number3 >= number2) {
            System.out.println("The third number is the greatest");
        }

        else {
            System.out.println("All numbers are the same value");
        }

        scanner.close();
        
    }
}


//finish