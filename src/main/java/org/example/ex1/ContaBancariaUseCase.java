package org.example.ex1;

public interface ContaBancariaUseCase {
    double consultarSaldo();
    double consultarChequeEspecial();
    void depositar(double valor);
    void sacar(double valor);
    void pagarUmBoleto(double valor);
    boolean verificarUsoChequeEspecial();
}
