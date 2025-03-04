package org.example.ex2;

public enum DirecaoCarro {
    DIREITA("Direita"),
    ESQUERDA("Esquerda");

    private final String direcao;

    DirecaoCarro(String direcao) {
        this.direcao = direcao;
    }

    public String getDescricao() {
        return direcao;
    }
}
