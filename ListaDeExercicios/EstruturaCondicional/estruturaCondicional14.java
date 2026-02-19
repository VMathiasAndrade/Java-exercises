import java.util.*;

/* 

Faça um programa que lê as duas notas parciais obtidas por um aluno numa 
disciplina ao longo de um semestre, e calcule a sua média. 

A atribuição de conceitos obedece à tabela abaixo:
Média de Aproveitamento  Conceito
  Entre 9.0 e 10.0        A
  Entre 7.5 e 9.0         B
  Entre 6.0 e 7.5         C
  Entre 4.0 e 6.0         D
  Entre 4.0 e zero        E

O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a 
mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.

*/

public class estruturaCondicional14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter your first grade: ");
        double grade1 = sc.nextDouble();

        System.out.printf("Enter your second grade: ");
        double grade2 = sc.nextDouble();

        double average = (grade1 + grade2) / 2;
        String concept = "";

        if (average >= 9 && average <= 10) {
            concept = "Concept - A";
        }

        else if (average >= 7.5 && average < 9.0) {
            concept = "Concept - B";
        }

        else if (average >= 6.0 && average < 7.5) {
            concept = "Concept - C";
        }

        else if (average >= 4.0 && average < 6.0) {
            concept = "Concept - D";
        }

        else if (average >= 0 && average < 4.0) {
            concept = "Concept - E";
        }

        else {
            System.out.printf("Enter only valid grades");
        }

        String situation = "";

        if (average < 6.0) {
            situation = "Repproved";
        }

        else {
            situation = "Approved";
        }

        System.out.printf("Average: %.1f - %s - %s", average, concept, situation);


        sc.close();
    }
}
