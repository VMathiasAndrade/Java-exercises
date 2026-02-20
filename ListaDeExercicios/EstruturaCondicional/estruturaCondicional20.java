import java.util.*;

/*Faça um Programa para leitura de três notas parciais de um aluno. 

O programa deve calcular a média alcançada por aluno e presentar:

A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
A mensagem "Aprovado com Distinção", se a média for igual a 10.

*/

public class estruturaCondicional20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a first grade: ");
        double grade1 = sc.nextDouble();

        System.out.printf("Enter a second grade: ");
        double grade2 = sc.nextDouble();

        System.out.printf("Enter a thirst grade: ");
        double grade3 = sc.nextDouble();

        double average = (grade1 + grade2 + grade3) / 3.0;

        if (average >= 7.0 && average < 10.0) {
            System.out.printf("Approved");
        }

        else if (average >= 10.0) {
            System.out.printf("Approved with distinction: %.2f\n", average);
        } else if (average >= 0 && average < 7.0) {
            System.out.printf("Repproved: %.2f\n", average);
        } 
        else if (average >= 7.0) {
        System.out.printf("Approved:%.2f\n", average);
        }
        else {
            System.out.printf("Invalid. Please, enter a correct value");
        }
        sc.close();
    }
}



//finish