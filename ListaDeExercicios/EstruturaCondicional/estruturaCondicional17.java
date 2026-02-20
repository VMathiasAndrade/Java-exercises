import java.util.*;

/* 

Faça um Programa que peça um número correspondente a um 
determinado ano e em seguida informe se este ano é ou não bissexto.

*/

public class estruturaCondicional17 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);


            System.out.printf("Enter a year: ");
            int year = sc.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.printf("Yes, it is a leap year\n");
            } 
            else {
                System.out.println("No, it is not a leap year\n");
            }
        sc.close();            
        }    
}



//finish