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
    private Carta carta;
    ArrayList<Carta> maoDoJogador = new ArrayList<Carta>();

    public Jogador(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }
}