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
public class NotasEscolaresMatrizMenu {
    //declaração global
    static String alunos[];
    static float notas[][];
    static int nAlunos, nNotas,contAlunos;//para saber quantos alunos já foi inserido
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opM;

        System.out.println("Notas Escolares Matriz");

        System.out.print("\nQuantos alunos? ");
        nAlunos = (int) leiaFloat();

        System.out.print("\nQuantas notas? ");
        nNotas = (int) leiaFloat();

        alunos = new String[nAlunos];

        notas = new float[nAlunos][nNotas + 1];//nNotas + 1 para ter uma posição para guardar a média
        
        do{
            menu();
            opM = (int) leiaFloat();
            switch (opM){
                case 1:
                    inserirAlunoNotas();
                     break;
               case 2:
                   imprimirAlunosNotas();
                    break;     
              case 0:
                  System.out.println("\nAplicação encerrada pelo usuário!");
                    break;
              default:
                  System.out.println("\nOpção inválida, tente novamente!");
                    break;
            }
        }while(opM != 0);
        
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
    public static void menu(){
        System.out.println("\nNotas Escolares Matriz");
        System.out.println("\n1 - Inserir notas do aluno");
        System.out.println("\n2 - Imprimir notas");
        System.out.println("\n0 - Sair");
        System.out.print("\nDigite sua escolha: ");
    }//fim menu
    
    public static void inserirAlunoNotas(){
        Scanner leia = new Scanner(System.in);
        
        if (contAlunos < nAlunos){
            System.out.print("\nNome do aluno: ");
            alunos[contAlunos] = leia.next();
            for (int j = 0; j < nNotas; j++) {//percorre as notas
                do {
                    System.out.print("\tDigite a " + (j + 1) + "ª nota: ");
                    notas[contAlunos][j] = leiaFloat();
                    if (validaNota(notas[contAlunos][j])) {
                        System.out.println("\nNota inválida, tente novamente!");
                    }
                } while (validaNota(notas[contAlunos][j]));
                notas[contAlunos][nNotas] += notas[contAlunos][j];//acumula as notas
            }//fim for notas
            notas[contAlunos][nNotas] = notas[contAlunos][nNotas] / nNotas;//calculo média
            contAlunos++;
        }else{
            System.out.println("\nNão é mais possível lançar notas.\nTodas as posições ocupadas.");
        }//fim if alunos
    }//fim inserirAlunoNotas
    
    public static void imprimirAlunosNotas() {
        System.out.println("\n---Resultado---");
         for (int i = 0; i < contAlunos; i++) {//impressão no console
             System.out.printf("\n" + alunos[i] + " sua média foi de %.2f",notas[i][nNotas]);
             if (notas[i][nNotas] >= 7) {
                 System.out.println(", você foi aprovado!");
             }else{
                 System.out.println(", infelizmente você reprovou!");
             }
        }//fim for saída no console
    }//fim imprimiAlunosNotas
}
