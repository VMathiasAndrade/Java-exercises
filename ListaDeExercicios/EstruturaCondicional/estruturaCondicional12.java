import java.util.*;

/*Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, 
que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o 
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). 

O Salário Líquido corresponde ao Salário Bruto menos os descontos. 
O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20% 

Imprima na tela as informações, dispostas conforme o exemplo abaixo. 
No exemplo o valor da hora é 5 e a quantidade de hora é 220.

Salário Bruto: (5 * 220)        : R$ 1100,00
        (-) IR (5%)                     : R$   55,00  
        (-) INSS ( 10%)                 : R$  110,00
        FGTS (11%)                      : R$  121,00
        Total de descontos              : R$  165,00
        Salário Liquido                 : R$  935,00

*/

public class estruturaCondicional12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter your hours wage: ");
        int value = sc.nextInt();

        System.out.printf("Enter how many hours you worked in the month: ");
        int hours = sc.nextInt();

        double salaryTotal = value * hours;

        double tax = 0.0;
        String ir = "";

        double liquidSal;

        if (salaryTotal <= 900) {
            tax = 0.0;
            ir = "EXEMPT";
        }

        else if (salaryTotal > 900 && salaryTotal <= 1500) {
            tax = salaryTotal * 0.05;
            ir = "5%";
        }

        else if (salaryTotal > 1500 && salaryTotal <= 2500) {
            tax = salaryTotal * 0.1;
            ir = "10%";
        }

        else {
            tax = salaryTotal * 0.2;
            ir = "20%";
        }

        double inss = salaryTotal * 0.1;
        double sindicato = salaryTotal * 0.03;
        double fgts = salaryTotal * 0.11;

        liquidSal = salaryTotal - tax - inss - sindicato;

        System.out.printf("Gross salary: %.2f %n", salaryTotal);
        System.out.printf("Income tax %s: %.2f %n", ir, tax);
        System.out.printf("INSS (10%%): %.2f%n", inss);
        System.out.printf("Union fee (3%%): %.2f %n", sindicato);
        System.out.printf("FGTS (11%%): %.2f %n", fgts);
        System.out.printf("Net salary: %.2f", liquidSal);

        sc.close();

    }
}
