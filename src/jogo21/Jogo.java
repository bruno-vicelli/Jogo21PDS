package jogo21;

import pds.Baralho;

/**
 *
 * @author Bruno
 */
public class Jogo {

    Jogador jogador = new Jogador("Teste");

    public Jogo() {
        System.out.println("JOGO INICIADO");

    }

    public void mostrarCartaInicialJogador(Jogador jogador) {
        System.out.println(jogador.getNome() + " Voce esta com: " + jogador.maoDoJogador.get(0).getNumero() + " pontos");
    }

    public void mostrarPontuacao(Jogador jogador) {
        int pontuacao = 0;
        for (int i = 0; i < jogador.maoDoJogador.size(); i++) {
            switch (jogador.maoDoJogador.get(i).getNumero()) {
                case ("A"):
                    pontuacao = pontuacao + 1;
                    break;

                case ("J"):
                    pontuacao = pontuacao + 10;
                    break;

                case ("Q"):
                    pontuacao = pontuacao + 10;
                    break;
                    
                case ("K"):
                    pontuacao = pontuacao + 10;
                    break;
                    
                default:
                    int aInt = Integer.parseInt(jogador.maoDoJogador.get(i).getNumero());
                    pontuacao = pontuacao + aInt;
                    break;
                            
                    
            }
        }
        System.out.println(jogador.getNome() + " Voce esta com: " + pontuacao + " pontos");
    }
}
