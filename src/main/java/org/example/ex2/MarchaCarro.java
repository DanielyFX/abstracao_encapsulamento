package org.example.ex2;

public enum MarchaCarro {
    PONTO_MORTO(0),
    PRIMEIRA(1),
    SEGUNDA(2),
    TERCEIRA(3),
    QUARTA(4),
    QUINTA(5),
    SEXTA(6);

    private final int marcha;

    MarchaCarro(int marcha) {
        this.marcha = marcha;
    }

    public int getDescricao() {
        return marcha;
    }
}
