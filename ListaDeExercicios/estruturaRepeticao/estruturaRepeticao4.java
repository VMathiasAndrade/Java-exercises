package ListaDeExercicios.estruturaRepeticao;

/*

Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e
que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.

Faça um programa que calcule e escreva o número de anos necessários para
que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.

 */

import java.util.*;

public class estruturaRepeticao4 {

    public static void main(String[] args) {

        int countryA = 80000;
        int countryB = 200000;

        double crescA = 0.015;
        double crescB = 0.03;

        int count = 0;

        while (countryA < countryB) {
            countryA += countryA * crescA;
            countryB += countryB * crescB;
            count++;
        }

        System.out.printf(
                "Number of years needed for the population of country A to surpass or equal the population of country B: "
                        + count);

    }

}
