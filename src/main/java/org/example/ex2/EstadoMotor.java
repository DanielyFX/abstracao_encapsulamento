package org.example.ex2;

public enum EstadoMotor {
    ACELERADO("Acelerado"),
    DESACELERADO("Desacelerado");

    private final String estadoMotor;

    EstadoMotor(String estadoMotor) {
        this.estadoMotor = estadoMotor;
    }

    public String getDescricao() {
        return estadoMotor;
    }
}
