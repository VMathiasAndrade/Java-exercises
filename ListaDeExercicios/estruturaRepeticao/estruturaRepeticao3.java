package ListaDeExercicios.estruturaRepeticao;

import java.util.*;

/*

Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';

 */

public class estruturaRepeticao3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        while (true) {
            System.out.printf("Enter your name (more than 3 characters): ");
            name = sc.nextLine();

            if (name.length() > 3) {
                break;
            } else {
                System.out.printf("Name must have more than 3 characters.");
            }
        }

        System.out.printf("Enter your age (between 0 and 150 ");

        int age;
        while (true) {
            System.out.printf("Enter you age (between 0 and 150): ");
            age = sc.nextInt();

            if (age <= 150 && age >= 0) {
                break;
            } else {
                System.out.printf("Age must be between 0 and 150");
            }
        }

        Double salary = 0.0;

        while (true) {
            System.out.printf("Enter your salary (greater than zero): ");
            salary = sc.nextDouble();

            if (salary > 0) {
                break;
            } else {
                System.out.printf("The value of salary must be greater than 0: ");
            }
        }

        char sex;
        while (true) {
            System.out.printf("Enter your gender: (F - Female or M - male): ");
            sex = sc.next().toUpperCase().charAt(0);
            if (sex == 'M' || sex == 'F') { 
                break;
            } else {
                System.out.printf("Gender must be 'f' or 'm' ");
            }
        }

        char maritalStatus;
        while (true) {
            System.out.printf("Enter your actual type (s, c, v, d): ");
            maritalStatus = sc.next().toUpperCase().charAt(0);
            
            if (maritalStatus == 'S' || maritalStatus == 'C' || maritalStatus == 'V' || maritalStatus == 'D') {
                break;
            } else {
                System.out.printf("Marital Status must be 'S', 'C', 'V' or 'D' ");
            }

        }

            System.out.println("Validated information: ");
            System.out.println("Name: " + name);
            System.out.println("Age: "+ age);
            System.out.println("Salary: " + salary);
            System.out.println("Gender: " + sex);
            System.out.println("Marital Status: " + maritalStatus);

            sc.close();
    }
}