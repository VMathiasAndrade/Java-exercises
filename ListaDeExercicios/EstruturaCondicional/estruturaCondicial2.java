import java.util.*;

// Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.


public class estruturaCondicial2 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Type a value: ");
            int value1 = scanner.nextInt();
    
            if (value1 > 0) {
                System.out.println("The number " + value1 + " is positive");
            }

            else if (value1 == 0) {
                System.out.println("The value is zero");
            }
            
            else {
                System.out.println("The number " + value1 + "is negative");
            }
            scanner.close();
        }
    
}
