package org.example.ex1;

public class Application {
    public static void main(String[] args){
        ContaBancariaUseCaseImpl contaBancariaUseCase = new ContaBancariaUseCaseImpl(new ContaBancariaRequest(1000));
        System.out.println("Saldo: " + contaBancariaUseCase.consultarSaldo());
        System.out.println("Cheque especial: " + contaBancariaUseCase.consultarChequeEspecial());
        System.out.println("Situação cheque: " + (contaBancariaUseCase.verificarUsoChequeEspecial() ? "Usado" : "Não usado"));
        contaBancariaUseCase.pagarUmBoleto(11000);
        System.out.println("Saldo: " + contaBancariaUseCase.consultarSaldo());
        System.out.println("Situação cheque: " + (contaBancariaUseCase.verificarUsoChequeEspecial() ? "Usado" : "Não usado"));
        contaBancariaUseCase.depositar(2000);
        System.out.println("Saldo: " + contaBancariaUseCase.consultarSaldo());
        contaBancariaUseCase.sacar(1000);
        System.out.println("Saldo: " + contaBancariaUseCase.consultarSaldo());
        System.out.println("Saldo: " + contaBancariaUseCase.consultarChequeEspecial());

    }
}
