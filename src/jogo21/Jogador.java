/**
 * <copyright>
 * 
 * Copyright 2012 Burno Vicelli <brunodosax@hotmail.com>
 *  * 
 * Este programa e todos os materiais que o acompanham estão disponibilizados
 * sob a licença GPL versão 3, que acompanha esta distribuição e está disponível
 * em http://www.gnu.org/licenses/gpl.html
 * </copyright>
 */
package jogo21;

import java.util.ArrayList;
import pds.Carta;

/**
 * 
 *
 * Universidade Federal do Pampa
 * Graduação: Engenharia de Software
 * Disciplina: Práticas de Desenvolvimento de Software
 * Professor: Wagner de Melo Reck
 * Semestre: 5° - 2012/01 
 * @author Bruno Vicelli
 * @Version 1.0 @Date 27/09/2012
 */
public class Jogador {

    private String nome;
    private ArrayList<Carta> maoDoJogador = new ArrayList<Carta>();

    public Jogador(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Carta> getMaoDoJogador() {
        return maoDoJogador;
    }

    public void setMaoDoJogador(ArrayList<Carta> maoDoJogador) {
        this.maoDoJogador = maoDoJogador;
    }

    
}