package ListaDeExercicios.estruturaRepeticao;

import java.util.Scanner;

// Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
// Valide a entrada e permita repetir a operação.


public class estruturaRepeticao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the population of country A: ");
        double countryA = sc.nextDouble();
        System.out.printf("Enter the growth rate of country A: ");
        double rateA = sc.nextDouble();
        System.out.printf("Enter the population of country B: ");
        double countryB = sc.nextDouble();
        System.out.printf("Enter the growth rate of country B: ");
        double rateB = sc.nextDouble();

        int count = 0;

        if (countryA < 0 || countryB < 0 || rateA < 0 || rateB < 0) {
            System.out.println("Invalid values.");
            System.exit(0);
        }

        if (countryA < countryB && rateA > rateB) {
            while (countryA < countryB) {

            countryA += countryA * (rateA/100);
            countryB += countryB * (rateB/100);

            count ++;
        }
        System.out.println("It took " + count + "years for the population of country A to surpass country B.");
        } else if ( countryA > countryB && rateA < rateB) {
            while (countryB < countryA) {

            countryA += countryA * (rateA/100);
            countryB += countryB * (rateB/100);

            count ++;
        }   
           System.out.println("It took " + count + "years for the population of country B to surpass country A.");
     
        } else {
            System.out.println("The countries have the same population, the same growth rate or the smaller population has a lower growth rate.");
        }
        sc.close();
    }    
}
