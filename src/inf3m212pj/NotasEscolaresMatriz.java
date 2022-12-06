/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import static inf3m212pj.NotasEscolaresVetor.validaNota;
import java.util.Scanner;

/**
 *
 * @author 182010049
 */
public class NotasEscolaresMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Notas Escolares Matriz");

        System.out.print("\nQuantos alunos? ");
        int nAlunos = (int) leiaFloat();

        System.out.print("\nQuantas notas? ");
        int nNotas = (int) leiaFloat();

        String alunos[] = new String[nAlunos];

        float notas[][] = new float[nAlunos][nNotas + 1];//nNotas + 1 para ter uma posição para guardar a média

        for (int i = 0; i < nAlunos; i++) {//percorre os alunos
            System.out.print("\nNome do aluno: ");
            alunos[i] = leia.next();
            for (int j = 0; j < nNotas; j++) {//percorre as notas
                do {
                    System.out.print("\tDigite a " + (j + 1) + "ª nota: ");
                    notas[i][j] = leiaFloat();
                    if (validaNota(notas[i][j])) {
                        System.out.println("\nNota inválida, tente novamente!");
                    }
                } while (validaNota(notas[i][j]));
                notas[i][nNotas] += notas[i][j];//acumula as notas
            }//fim for notas
            notas[i][nNotas] = notas[i][nNotas] / nNotas;//calculo média
        }//fim for alunos
        System.out.println("\n---Resultado---");
         for (int i = 0; i < nAlunos; i++) {//impressão no console
             System.out.printf("\n" + alunos[i] + " sua média foi de %.2f",notas[i][nNotas]);
             if (notas[i][nNotas] >= 7) {
                 System.out.println(", você foi aprovado!");
             }else{
                 System.out.println(", infelizmente você reprovou!");
             }
        }//fim for saída no console
    }//fim main

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
