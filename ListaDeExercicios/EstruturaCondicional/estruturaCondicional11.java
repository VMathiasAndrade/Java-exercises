import java.util.*;


/* As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e 
lhe contrataram para desenvolver o programa que calculará os reajustes.


Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, 
baseado no salário atual:

salários até R$ 280,00 (incluindo): aumento de 20%
salários entre R$ 280,00 e R$ 700,00: aumento de 15%
salários entre R$ 700,00 e R$ 1500,00: aumento de 10%
salários de R$ 1500,00 em diante: aumento de 5% 

Após o aumento ser realizado, informe na tela:
- o salário antes do reajuste;
- o percentual de aumento aplicado;
- o valor do aumento;
- e o novo salário, após o aumento. */

public class estruturaCondicional11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the current salary: ");
        double sal = sc.nextDouble();

        double newSal;
        String percentage;
        double increase;

        if (sal <= 280) {
           newSal = sal * 1.2;
           percentage = "20%";
        }

        else if (sal >= 280 && sal <=700) {
            newSal = sal * 1.15;
            percentage = "15%";
        }

        else if (sal >= 700 && sal <= 1500) {
            newSal = sal * 1.1;
            percentage = "10%";
        }

        else {
            newSal = sal * 1.05;
            percentage = "5%";        
        }

        increase = newSal - sal;

        System.out.printf("The salary before the increase is $%.2f%n", sal);
        System.out.printf("The percentage increase is %s", percentage);
        System.out.printf("The value increase is $%.2f%n", increase);
        System.out.printf("The new salary is $%.2f%n", newSal);


        sc.close();
    }

    
}


//finish
