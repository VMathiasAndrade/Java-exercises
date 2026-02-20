import java.util.*;

/* 

Um posto está vendendo combustíveis com a seguinte tabela de descontos:

Álcool:
até 20 litros, desconto de 3% por litro
acima de 20 litros, desconto de 5% por litro

Gasolina:
até 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro. 

Escreva um algoritmo que leia o número de litros vendidos, o tipo 
de combustível (codificado da seguinte forma: A-álcool, G-gasolina), 
calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do 
litro do álcool é R$ 1,90.

*/

public class estruturaCondicional26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the quantity do you want: ");
        int liters = sc.nextInt();

        if (liters <= 0) {
            System.out.println("The number of liters must be a positive number.");
            sc.close();
            return;
        }

        System.out.printf("How fuel do you prefer? (G - Gasoline / A - Alcool): ");
        char fuel = sc.next().toUpperCase().charAt(0);

        double discount = 0;
        double pricePerLiter = 0;

        if (fuel == 'G') {
            pricePerLiter = 2.50;
            if (liters <= 20) {
                discount = 0.04;
            } else {
                discount = 0.06;
            }
        } 
        else if (fuel == 'A') {
            pricePerLiter = 1.90;
            if (liters <= 20) {
                discount = 0.03;
            } else {
                discount = 0.05;
            }
        } 
        else {
            // Mais uma proteção: Se a letra for inválida, encerramos.
            System.out.println("Invalid fuel, try again.");
            sc.close();
            return;
        }

        double grossPrice = pricePerLiter * liters;
        double priceTotal = grossPrice - (grossPrice * discount);

        System.out.printf("The value to pay is $%.2f\n.", priceTotal);

        sc.close();
    }
}


//finish