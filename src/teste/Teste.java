/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Teste {
    
    /**
     *  Método Fibonacci
     */
    public static long fibo(int i) {
        if (i < 2) {
            return i;
        } else {
            return fibo(i - 1) + fibo(i - 2);
        }
    }
    
    public static int Joke(int jog1, int jog2){
        if(jog1 == jog2 ){
            return 0;
        }else if(jog1 == 1 && jog2 ==2){
            return 2;
        }else if(jog1 == 1 && jog2 ==3){
            return 1;
        }else if (jog2 ==1 && jog1 ==2){
            return 1;
        }else if(jog2 ==1 && jog1 ==3){
            return 2;
        }else{
            return 0;
        }
    }
    
    
 
    public static void main(String[] args) {   
	
	// teste do programa. Imprime a quantidade de temos escolhida na variavel valor
        
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite o valor Fibonacci");
        int valor = tecla.nextInt();
	for (int i = 0; i < valor; i++) {
            System.out.print(Teste.fibo(i)+",");
        }
        System.out.println();
        System.out.println("Jokenpô");
        
        System.out.println("Digite a jogada do jogador 1 (1= papel, 2= tesoura, 3= pedra");
        int jogador1 = tecla.nextInt();
        System.out.println("Digite a jogada do jogador 2 (1= papel, 2= tesoura, 3= pedra");
        int jogador2 = tecla.nextInt();
        int ganhador = Teste.Joke(jogador1, jogador2);
        if (ganhador == 0){
            System.out.println("Empate");
        }else if(ganhador == 1){
            System.out.println("Jogador 1");
        }else{
            System.out.println("Jogador 2");
        }
    }
    
}
