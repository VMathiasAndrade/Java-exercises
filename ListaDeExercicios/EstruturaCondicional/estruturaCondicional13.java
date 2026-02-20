import java.util.*;


/* 

Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), 
se digitar outro valor deve aparecer valor inválido.

*/

public class estruturaCondicional13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a number from 1 to 7: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("1 - Domingo");
                break;
        
            case 2:
                System.out.println("2 - Segunda");
                break;
            case 3:
                System.out.println("3 - Terça");
                break;
                
            case 4:
                System.out.println("4 - Quarta");
                break;
            
            case 5:
                System.out.println("5 - Quinta");
                break;
            
            case 6:
                System.out.println("6 - Sexta");
                break;

            case 7:
                System.out.println("7 - Sabado");
                break;
            
            default:
                System.out.println("Invalid number");
                break;
        }

        sc.close();
    }

}



//finish