import java.util.*;


/* Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido. */

public class estruturaCondicional3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Type a caracter referee a you gender, M - Male or F -Female");
        char gender = scanner.next().toUpperCase().charAt(0);

        if (gender == 'M') {
            System.out.printf("M - Male", gender);
        }

        else if (gender == 'F') {
            System.out.printf("F - Female", gender);
        }

        else {
            System.out.printf("Invalid gender");
        }
    
    scanner.close();
    }
}
