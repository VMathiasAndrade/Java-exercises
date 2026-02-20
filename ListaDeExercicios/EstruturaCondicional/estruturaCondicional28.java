import java.util.*;

/* 

O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. 

Confira:
                      Até 5 Kg           Acima de 5 Kg
File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg

Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos 
de carne da promoção, porém não há limites para a quantidade de carne por cliente. 
Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total da compra. 

Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.

*/

public class estruturaCondicional28 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the type of meet do you want (A - ALCATRA / F - FILÉ / P - PICANHA): ");
        char meet = sc.next().toUpperCase().charAt(0);

        System.out.printf("Enter the quantity in kg: ");
        double kg = sc.nextDouble();

        if (kg <= 0) {
            System.out.println("The minimum to buy is 1");
            return;
        }

        double priceMeet = 0;

        if (meet == 'A') {
            if (kg <= 5) {
                priceMeet = 5.90;
            } else {
                priceMeet = 6.80;
            }
        }

        else if (meet == 'F') {
            if (kg <= 5) {
                priceMeet = 4.90;
            } else {
                priceMeet = 5.80;
            }
        }

        else if (meet == 'P') {
            if (kg <= 5) {
                priceMeet = 6.90;
            } else {
                priceMeet = 7.80;
            }
        }

        else {
            System.out.println("Invalid type. Try again!");
        }

        double priceBuy = priceMeet * kg;

        System.out.printf("How method to pay? (C - Card Tabajara / O - Other): ");
        char method = sc.next().toUpperCase().charAt(0);

        double discount = 0;

        if (method == 'C') {
            discount = 0.05 * priceBuy;
        }



        priceBuy = priceBuy - (priceBuy * discount);

        System.out.println("--------------------------------------------");
        System.out.println("Type: " + meet);
        System.out.println("Quantity (kg): " + kg);
        System.out.println("Total price: $" + priceBuy);
        System.out.println("Type of pay: " + method);
        System.out.println("Discount: $" + discount);
        System.out.println("-------------------------------------------");
    
    sc.close();
    }
}



//finish