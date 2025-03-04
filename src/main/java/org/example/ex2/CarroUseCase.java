package org.example.ex2;

public interface CarroUseCase {
    void ligarCarro();
    void desligarCarro();
    void acelerarCarro();
    void diminuirVelocidade();
    void virarCarro(DirecaoCarro direcao);
    double verificarVelocidade();
    int verificaarMarcha();
    void trocarMarcha(MarchaCarro marcha);
}
