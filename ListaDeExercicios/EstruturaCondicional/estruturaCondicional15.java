import java.util.*;


/* 

Faça um Programa que peça os 3 lados de um triângulo. 
O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, 
se o mesmo é: equilátero, isósceles ou escaleno.

Dicas:
Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
Triângulo Equilátero: três lados iguais;
Triângulo Isósceles: quaisquer dois lados iguais;
Triângulo Escaleno: três lados diferentes;

*/


public class estruturaCondicional15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("Enter the lenghts of triangle sides");
        System.out.println("-------------------------------------");

        System.out.printf("Enter the first value: ");
        int a = sc.nextInt();

        System.out.printf("Enter the second value: ");
        int b = sc.nextInt();

        System.out.printf("Enter the third value: ");
        int c = sc.nextInt();
    
        boolean isValid = false;
        if (a + b > c && a + c > b && b + c > a) {
            isValid = true;
        }

        if (isValid) {
            if (a == b && a == c) { 
                System.out.printf("Triangle equilater: three equal sides\n");
            }
                else if ( a == b || a == c || b == c){
                    System.out.printf("Isosceles triangle: two equal sides\n");
                }
            else {
                System.out.printf("Scalen triangle: three diferent sides\n");
            }
        }
        else { 
            System.out.println("Invalid Triangle");
        }
         sc.close();   
        }
 }


 
//finish