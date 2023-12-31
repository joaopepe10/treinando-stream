package com.github.joaopepe10;

import java.util.Objects;

public class Produto {
    private long id;
    private String descricao;
    private int posicao;
    static int posicaoEstatica = 0;

    public Produto() {
    }

    public Produto(String descricao, long id) {
        this.descricao = descricao;
        this.id = id;
        this.posicao = posicaoEstatica;
        posicaoEstatica++;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "\nProduto{" +
                "\nid=" + id +
                ", descricao='" + descricao + '\'' +
                ", posicao=" + posicao +
                '}';
    }
}
