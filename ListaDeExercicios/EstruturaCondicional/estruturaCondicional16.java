/* 

Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. 
O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:

1 - Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau 
e o programa não deve fazer pedir os demais valores, sendo encerrado;
2 - Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
3 - Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
4 - Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
Δ = b² – 4ac e x= 
2a
−b± 
b 
2
 −4ac
​
 
​

*/

import java.util.Scanner;

public class estruturaCondicional16 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.printf("Enter the  first value: ");
            int a = sc.nextInt();
            
            if (a == 0) { 
                System.out.printf("The equation is not quadratic\n");
                System.exit(0);
            }

            System.out.printf("Enter the second value: ");
            int b = sc.nextInt();

            System.out.printf("Enter the third value: ");
            int c = sc.nextInt();

            double delta = Math.pow(b, 2) - (4*a*c);

            if (delta < 0) {
                System.out.printf("The equation has no real root");
                System.exit(0);

            }
            else if (delta == 0) {
                int x = -b / (2 * a);
                System.out.printf("The equation has only one real root: %d", x);
            }
            else {

                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("The equation has two real root: %f and %f", x1, x2);
            }
            sc.close(); 
        }
}


//finish