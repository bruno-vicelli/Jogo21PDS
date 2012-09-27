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

        Jogador jogador1 = new Jogador("Bruno");
        Jogador jogador2 = new Jogador("Helison");

        Jogo jogo = new Jogo(jogador1, jogador2);
        Baralho baralho = new Baralho();
        baralho.embaralhar();

        jogador1.getMaoDoJogador().add(baralho.getPrimeiraCarta());
        jogador2.getMaoDoJogador().add(baralho.getPrimeiraCarta());
        System.out.println(jogador1.getNome() + " esta com: " + jogo.mostrarPontuacao(jogador1) + " pontos");
        System.out.println(jogador2.getNome() + " esta com: " + jogo.mostrarPontuacao(jogador2) + " pontos");



        BufferedReader entrada;
        entrada = new BufferedReader(new InputStreamReader(System.in));


        Jogador jogador = null;
        String resposta = "";
        while (jogo.verificarVencedor(jogador1, jogador2) == null) {
            try {
                jogador = jogo.trocaJogador();
            } catch (Exception e) {
                System.out.println("erro ao trocar jogador");
                e.printStackTrace();
            }
            System.out.println("Deseja pegar mais cartas " + jogador.getNome() + " ?(Digite s para sim, ou qualquer tecla para sair)");

            try {
                resposta = entrada.readLine();
            } catch (Exception e) {
                System.out.println("erro ao ler");
                e.printStackTrace();
            }
            if (resposta.equals("s")) {
                jogador.getMaoDoJogador().add(baralho.getPrimeiraCarta());
            }

            System.out.println(jogador1.getNome() + " esta com: " + jogo.mostrarPontuacao(jogador1) + " pontos");
            System.out.println(jogador2.getNome() + " esta com: " + jogo.mostrarPontuacao(jogador2) + " pontos");


        }
    }
}
