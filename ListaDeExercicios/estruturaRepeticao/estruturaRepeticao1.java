package ListaDeExercicios.estruturaRepeticao;

import java.util.*;

/*

Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

*/
public class estruturaRepeticao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a number between 1 a 10: ");
        int num = sc.nextInt();

        while (num > 10 || num < 1) {
            System.out.println("Invalid number. Enter a number between 1 a 10: ");
            num = sc.nextInt();
        }

        System.out.println("The number is : " + num);

        sc.close();
    }
}
