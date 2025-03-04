package org.example.ex1;

public class ContaBancariaUseCaseImpl implements ContaBancariaUseCase {

    private ContaBancariaRequest contaBancariaRequest;

    public ContaBancariaUseCaseImpl(ContaBancariaRequest contaBancariaRequest){
        this.contaBancariaRequest = contaBancariaRequest;
    }

    @Override
    public double consultarSaldo() {
        return contaBancariaRequest.saldo();
    }

    @Override
    public double consultarChequeEspecial() {
        return contaBancariaRequest.chequeEspecial();
    }

    @Override
    public void depositar(double valor) {
        ContaBancariaRequest contaBancariaRequest1 = new ContaBancariaRequest(contaBancariaRequest.saldo() + valor, contaBancariaRequest.chequeEspecial(), contaBancariaRequest.usoChequeEspecial());
        this.contaBancariaRequest = contaBancariaRequest1;

    }

    @Override
    public void sacar(double valor) {
        if (valor > contaBancariaRequest.saldo()){
            double novoChequeEspecial = contaBancariaRequest.chequeEspecial() - (valor - contaBancariaRequest.saldo());
            ContaBancariaRequest contaBancariaRequest1 = new ContaBancariaRequest(0, novoChequeEspecial, true);
            this.contaBancariaRequest = contaBancariaRequest1;
        }
        else{
            ContaBancariaRequest contaBancariaRequest1 = new ContaBancariaRequest(contaBancariaRequest.saldo() - valor, contaBancariaRequest.chequeEspecial(), contaBancariaRequest.usoChequeEspecial());
            this.contaBancariaRequest = contaBancariaRequest1;

        }

    }

    @Override
    public void pagarUmBoleto(double valor) {
        if (valor > contaBancariaRequest.saldo()){
            double novoChequeEspecial = contaBancariaRequest.chequeEspecial() - (valor - contaBancariaRequest.saldo());
            ContaBancariaRequest contaBancariaRequest1 = new ContaBancariaRequest(0, novoChequeEspecial, true);
            this.contaBancariaRequest = contaBancariaRequest1;
        }
        else{
            System.out.println("Boleto pago");
            ContaBancariaRequest contaBancariaRequest1 = new ContaBancariaRequest(contaBancariaRequest.saldo() - valor, contaBancariaRequest.chequeEspecial(), contaBancariaRequest.usoChequeEspecial());
            this.contaBancariaRequest = contaBancariaRequest1;

        }

    }

    @Override
    public boolean verificarUsoChequeEspecial() {
        return contaBancariaRequest.usoChequeEspecial();
    }
}
