import java.util.*;

// Faça um Programa que verifique se uma letra digitada é vogal ou consoante. 

public class estruturaCondicional4 {

    public static void main(String[] args) {

        List<Character> lowercaseConsonants = Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n',
                'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z');
        List<Character> lowercaseVogals = Arrays.asList('a', 'e', 'i', 'o', 'u');

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char letter = scanner.next().toUpperCase().charAt(0);

        if (lowercaseConsonants.contains(letter)) {
            System.out.println("The letter entered is a consonant");
        }

        else if (lowercaseVogals.contains(letter)) {
            System.out.println("The letter entered is a vogal");
        }

        else {
            System.out.println("Enter only letters of the alphabet");
        }

        scanner.close();
    }
}



//finish