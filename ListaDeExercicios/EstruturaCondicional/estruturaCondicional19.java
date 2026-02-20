import java.util.*;

/* 

Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
Observando os termos no plural a colocação do "e", da vírgula entre outros. 

Exemplo:
326 = 3 centenas, 2 dezenas e 6 unidades
12 = 1 dezena e 2 unidades 
Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16.

*/

public class estruturaCondicional19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a number less than 1000: ");
        int num = sc.nextInt();

        int hundred = (num / 100);
        int ten = (num / 10 % 10);
        int unit = (num % 10);
        System.out.printf("%d = %d centenas, %d dezenas e %d unidades\n", num, hundred, ten, unit);

        sc.close();
    }
}



//finish