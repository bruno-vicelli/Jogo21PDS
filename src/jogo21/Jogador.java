/**
 * <copyright>
 *
 * Copyright 2012 Burno Vicelli <brunodosax@hotmail.com> * Este programa e todos
 * os materiais que o acompanham estão disponibilizados sob a licença GPL versão
 * 3, que acompanha esta distribuição e está disponível em
 * http://www.gnu.org/licenses/gpl.html </copyright>
 */
package jogo21;

import java.util.ArrayList;
import pds.Carta;

/**
 * Classe Jogador que implementa as caracteristicas de um jogador dentro do jogo
 *
 * Universidade Federal do Pampa Graduação: Engenharia de Software Disciplina:
 * Práticas de Desenvolvimento de Software Professor: Wagner de Melo Reck
 * Semestre: 5° - 2012/01
 *
 * @author Bruno Vicelli
 * @Version 1.0 @Date 27/09/2012
 */
public class Jogador {

    private String nome;
    private ArrayList<Carta> maoDoJogador;

    /**
     * Método construtor da classe Jogador
     *
     * @param nome
     */
    public Jogador(String nome) {
        this.nome = nome;
        this.maoDoJogador = new ArrayList<Carta>();
    }

    /**
     * Método que retorna o nome do jogador
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método set para inserir o nome do jogador
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método que retorna um arraylist contendo as cartas que estão na mão do
     * jogador
     *
     * @return
     */
    public ArrayList<Carta> getMaoDoJogador() {
        return maoDoJogador;
    }

    /**
     * Método para setar a mão do jogador
     *
     * @param maoDoJogador
     */
    public void setMaoDoJogador(ArrayList<Carta> maoDoJogador) {
        this.maoDoJogador = maoDoJogador;
    }

    public boolean addCarta(Carta carta) {
        return this.maoDoJogador.add(carta);
    }
}