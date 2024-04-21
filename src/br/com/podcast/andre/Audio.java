package br.com.podcast.andre;

import java.util.Scanner;

public class Audio implements Classificacao {
    private String autor;
    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private double classificacao;

    public void curte () {
        this.curtidas++;
    }
    public void reproducoes () {
        this.totalDeReproducoes++;
    }

    public double totalClassificacao() {
        classificacao = curtidas / 100;
        return classificacao;
    }

    @Override
    public int getcontadorDeClassificacao() {
        return 0;
    }
}



