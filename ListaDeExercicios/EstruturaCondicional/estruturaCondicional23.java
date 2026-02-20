import java.util.*;


/* 

Faça um Programa que peça um número e informe se o número é inteiro ou decimal. 
Dica: utilize uma função de arredondamento.

*/


public class estruturaCondicional23 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.printf("Enter a number : ");
        double num = sc.nextDouble();

        if (num == Math.round(num)) {
            System.out.println("Integer number");
        }
        else {
            System.out.println("Decimal number");
        }
     
        sc.close();
    }
    
}
