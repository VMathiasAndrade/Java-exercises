import java.util.*;

/* Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a dez. */

public class estruturaCondicional5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter the first grade: ");
        double grade1 = scanner.nextDouble();

        System.out.printf("Enter the second grade: ");
        double grade2 = scanner.nextDouble();

        double average = (grade1 + grade2) / 2;

        if (average >= 7 && average < 10) {
            System.out.println("Approved");
        }
        else if (average < 7) {
            System.out.println("Repproved");
        }

        else if (average == 10) {
            System.out.println("Approved with Distinction");
        }
    scanner.close();
    }
    
}



//finish