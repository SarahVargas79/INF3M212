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
public class NotasEscolaresVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Notas Escolares");
        
        System.out.print("\nQuantidade de notas a inserir? ");
        int quantNotas = (int)leiaFloat();//*Quest forçar a pegar o inteiro
        
        float notas[] = new float[quantNotas+1];//vetor de 5 posições | nNotas + 1 para ter uma posição para guardar a média

        Scanner leia = new Scanner(System.in);

        
        for (int i = 0; i < quantNotas; i++) {
            do {
                System.out.print("\nInforme a " + (i + 1) + "ª nota: ");
                notas[i] = leiaFloat();
                if (validaNota(notas[i])) {
                    System.out.println("\nNota inválida, tente novamente!");
                }
            } while (validaNota(notas[i]));//limita a nota até 10. || significa ou |Ctrl + espaço ver comentário
            notas[quantNotas] += notas[i];//acumula notas
        }//fim do for
        notas[quantNotas] = notas[quantNotas] / quantNotas;//faz a média
        System.out.printf("\nSua média foi de %.2f", notas[quantNotas]);
        if (notas[quantNotas] >= 7) {
            System.out.print(", parabéns você foi aprovado.");
        } else {
            System.out.println(", infelizmente você reprovou.");
        }//fim if
    }//fim main | /** + enter - comentário

    /**
     * Função validaNota serve para validar notas que estejam fora do intervalo
     * de 0 - 10.
     *
     * @param nota
     * @return
     */

    public static boolean validaNota(float nota) {//tipo de retorno - boolean, paramêtro - validaNota | tabela verdade - v ou v = v, v ou x = v, x ou v = v e x ou x = x o ou return
        return nota < 0 || nota > 10;
    }//fim validaNota

    public static float leiaFloat() {
        Scanner leia = new Scanner(System.in);
        try {//
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.print("\nValor não é número, tente novamente: ");
            return leiaFloat();
        }
    }//fim leiaFloat()
}
