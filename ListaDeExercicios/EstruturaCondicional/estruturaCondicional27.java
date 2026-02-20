import java.util.*;

/* 

Uma fruteira está vendendo frutas com a seguinte tabela de preços:

                      Até 5 Kg           Acima de 5 Kg
Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra 
ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. 

Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e 
escreva o valor a ser pago pelo cliente.

*/

public class estruturaCondicional27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the quantity of apple purchased in kg: ");
        double apple = sc.nextDouble();

        if (apple < 0) {
            System.out.println("The minimum value possible is 0.");
            return;
        }

        System.out.printf("Enter the quantity of strawberry purchased in kg: ");
        double strawberry = sc.nextDouble();

        if (strawberry < 0) {
            System.out.println("The minimum value possible is 0.");
            return;
        }

        double priceApp = 0;
        double priceStr = 0;

        if (apple <= 5) {
            priceApp = 1.80;
        } else {
            priceApp = 1.50;
        }

        if (strawberry <= 5) {
            priceStr = 2.50;
        } else {
            priceStr = 2.20;
        }

        double strTotal = (priceStr * strawberry);
        double appTotal = (priceApp * apple);

        // somatorio para averiguar se passou ou não dos 8kg
        double sum = apple + strawberry;

        double priceTotal = strTotal + appTotal;

        boolean discount = (sum > 8 || priceTotal > 25);
        if (discount) {
            priceTotal = priceTotal - (priceTotal * 0.1);
        }

        System.out.println("Apples (kg): " + apple);
        System.out.println("Strawberries (kg): " + strawberry);
        System.out.printf("Value to pay: $%.2f\n", priceTotal);

        sc.close();
    }
}
