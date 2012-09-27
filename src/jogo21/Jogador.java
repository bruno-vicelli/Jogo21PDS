/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo21;

import java.util.ArrayList;
import pds.Carta;

/**
 *
 * @author Bruno
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