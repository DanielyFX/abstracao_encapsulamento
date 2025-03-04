package org.example.ex2;

public enum EstadoCarro {
    LIGADO("Ligado"),
    DESLIGADO("Desligado");

    private final String estadoCarro;

    EstadoCarro(String estadoCarro) {
        this.estadoCarro = estadoCarro;
    }

    public String getDescricao() {
        return estadoCarro;
    }
}
