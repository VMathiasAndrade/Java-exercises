import java.util.*;

/* 

Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e 
depois informar quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. 

O valor mínimo é de 10 reais e o máximo de 600 reais. 
O programa não deve se preocupar com a quantidade de notas existentes na máquina.

Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.

*/

public class estruturaCondicional21 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] cedulas ={100, 50, 10, 5, 1};
            int[] qtd = new int[cedulas.length];

            System.out.printf("Enter the value you want to request: ");
            int value = sc.nextInt();

            if (value < 10 || value > 600) {
                System.out.println("Invalid value. The minimum is 10 reais and the maximum is 600 reais.");
                sc.close();
            }

            else {
                int rest = value;
                for (int i = 0; i <cedulas.length; i++) {
                    qtd[i] = rest / cedulas[i];
                    rest %= cedulas[i];
                }

                System.out.printf("Para sacar %d reais, the program fornece %d notas de 100, %d notas de 50, %d notas de 10, %d notas de 5 e %d notas de 1.\n", value, qtd[0], qtd[1], qtd[2], qtd[3], qtd[4]);

                sc.close();
            }

        }  
}


//finish