import java.util.*;

/* Faça um Programa que pergunte em que turno você estuda. 
Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso */

public class estruturaCondicional10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the caracter that represents your shift (M-matutino, V-vespertino, N-noturno): ");
        char shift = scanner.next().toUpperCase().charAt(0);

        if (shift == 'M') {
            System.out.println("Bom Dia!");
        }
        
        else if (shift == 'V') {
            System.out.println("Boa Tarde!");
        }

        else if (shift == 'N') {
            System.out.println("Boa Noite!");
        }

        else {
            System.out.println("Valor Inválido!");
        }
        scanner.close();
    }
}


//finish