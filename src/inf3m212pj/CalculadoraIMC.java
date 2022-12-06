/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import java.util.Scanner;

/**
 *
 * @author 182010049
 */
public class CalculadoraIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome, classificacao;
        float altura, peso, imc;

        Scanner leia = new Scanner(System.in);

        System.out.println("Calculadora de Índice de Massa Corpórea");

        System.out.print("\nInforme seu nome: ");
        nome = leia.next();

        System.out.print("\nDigite sua altura: ");
        altura = leia.nextFloat();

        System.out.print("\nDigite seu peso: ");
        peso = leia.nextFloat();

        imc = peso / (altura * altura);

        if (imc <= 18.5) {
            classificacao = "Abaixo do Peso";
        } else if (imc <= 24.9) {
            classificacao = "Peso Ideal";
        } else if (imc <= 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc <= 34.9) {
            classificacao = "Obesidade Grau I";
        } else if (imc <= 39.9) {
            classificacao = "Obesidade Grau II";
        } else {
            classificacao = "Obesidade Grau III";
        }
        System.out.printf("\nCom os dados coletados " + nome + " seu imc é: %.2f",imc);
        System.out.println(" kg/m² " + classificacao + "\n");
    }//Run - Stop Build/Run parar todos os projetos que estão rodando consome a máquina
}
