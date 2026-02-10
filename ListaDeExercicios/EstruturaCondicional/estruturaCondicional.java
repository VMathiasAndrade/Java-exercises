

import java.util.*;

//faça um programa que peça dois numeros e imprima o maior deles

public class estruturaCondicional {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Type the first integer: ");
     int valor1 = scanner.nextInt();
     System.out.println("Type the second integer: ");
     int valor2 = scanner.nextInt();

        if (valor1 > valor2)
        {
            System.out.println("The greatest value is: " + valor1);
        }            
        else if (valor2 == valor1) {
            System.out.println("Ambos os valores são iguais");
        }
        else { 
            System.out.println("The greatest value is: "+ valor2);
        }

    scanner.close();
}
}