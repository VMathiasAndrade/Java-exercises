import java.util.*;

/* 

Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. 

As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?" 

O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. 
Se a pessoa responder positivamente a 2 questões ela deve ser classificada 
como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". 
Caso contrário, ele será classificado como "Inocente".

*/

public class estruturaCondicional25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Do you call to victim? (Y/N): ");
        char call = sc.next().toUpperCase().charAt(0);

        System.out.printf("Do you was at the local? (Y/N): ");
        char scene = sc.next().toUpperCase().charAt(0);

        System.out.printf("Do you live near the victim? (Y/N): ");
        char live = sc.next().toUpperCase().charAt(0);

        System.out.printf("Do you owe money to the victim? (Y/N): ");
        char money = sc.next().toUpperCase().charAt(0);

        System.out.printf("Have you worked with the victim before? (Y/N): ");
        char work = sc.next().toUpperCase().charAt(0);

        int sum = 0;

        if (call == 'Y') {
            sum += 1;
        }

        if (scene == 'Y') {
            sum += 1;
        }

        if (live == 'Y') {
            sum += 1;
        }

        if (money == 'Y') {
            sum += 1;
        }

        if (work == 'Y') {
            sum += 1;
        }

        if (sum == 2) {
            System.out.println("Suspect");
        }

        else if (sum > 2 && sum < 5) {
            System.out.println("Accomplice");
        }

        else if (sum == 5) {
            System.out.println("Assassin");
        }

        else {
            System.out.println("Innocent");
        }

        sc.close();
    }
}
