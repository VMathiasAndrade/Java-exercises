import java.util.*;

/* 

Faça um Programa que peça um número inteiro e determine se ele é par ou impar. 
Dica: utilize o operador módulo (resto da divisão).

*/

public class estruturaCondicional22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is par");
        }

        else {
            System.out.println("The number is ímpar");
        }

        sc.close();
    }
}