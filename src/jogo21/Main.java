/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import pds.Baralho;
import pds.Carta;

/**
 *
 * @author Bruno
 */
public class Main {

    public static void main(String[] args) {

        Jogo jogo = new Jogo();
        Baralho baralho = new Baralho();
        baralho.embaralhar();
        Jogador jogador1 = new Jogador("Bruno");
        Jogador jogador2 = new Jogador("Helison");
        jogador1.maoDoJogador.add(baralho.getPrimeiraCarta());
        jogador2.maoDoJogador.add(baralho.getPrimeiraCarta());    
        jogo.mostrarPontuacao(jogador1);
        
        
//        BufferedReader entrada;
//        entrada = new BufferedReader(new InputStreamReader(System.in));
//
//        do {
//            System.out.println("Deseja pegar mais cartas?(Digite s para sim, ou qualquer tecla para sair)");
//            while (true) {
//                try {
//                    j21.pegar = (entrada.readLine());
//                  if (j21.pegar.equals("s")){
//                        break;
//                    } else {
//                        System.out.println(j21.pegar);
//                    }
//                } catch (Exception e) {
//                    System.out.println("erro");
//                }
//            }
//            j21.embaralharjo();
//            System.out.println("    ");
//            System.out.println("Seus pontos estão em: " + j21.jpontos);
//
//        } while (if (j21.pegar.equals("s"));
//        System.out.println("FIM");
//    }
//
   }
}
