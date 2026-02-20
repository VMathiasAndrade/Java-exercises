import java.util.*;

/* 

Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. 
O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
par ou ímpar;
positivo ou negativo;
inteiro ou decimal.

*/

public class estruturaCondicional24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.printf("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.printf(
                "Select the opperation (1 - Addition, 2 - Subtraction, 3 - Multiplacation and 4 - Division): \n");
        int choose = sc.nextInt();

        double result = 0;

        switch (choose) {
            case 1:
                result = num1 + num2;
                break;

            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;

            case 4:
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation. Insert a valid number");
                break;
        }

        String type = "";

        if (result % 2 == 0) {
            type += "Par, ";
        } else {
            type += "ímpar, ";
        }

        if (result >= 0) {
            type += "Positive, ";
        } else {
            type += "Negative, ";
        }

        if (result == Math.round(result)) {
            type += "Integer.";
        } else {
            type += "Decimal. ";
        }

        System.out.println("The result of the operation is: " + result);
        System.out.printf("The resulting number is: " + type);

        sc.close();
    }

}
