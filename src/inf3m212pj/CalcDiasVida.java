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
public class CalcDiasVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        int idade, diasVida;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Calculo Dias de Vida\n");
        
        System.out.print("\nInforme seu nome: ");
        nome = leia.next();
        
        System.out.print("\nDigite sua idade: ");
        idade = leia.nextInt();
        //diasVida = idade*365
        diasVida = calcDiasVida(idade);//usando função para calcular os dias de vida
        
        System.out.print("\n"+nome + " você tem " + idade + " anos e já viveu aproximadamente " + diasVida + " dias de vida.\n");
    }
    public static int calcDiasVida(int old){
        return old*365;
    }
}
