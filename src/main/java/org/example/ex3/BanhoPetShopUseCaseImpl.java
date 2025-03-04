package org.example.ex3;

public class BanhoPetShopUseCaseImpl implements BanhoPetShopUseCase{

    RequestBanhoPetShop requestBanhoPetShop;

    public BanhoPetShopUseCaseImpl(RequestBanhoPetShop requestBanhoPetShop){
        this.requestBanhoPetShop = requestBanhoPetShop;
    }

    @Override
    public void darBanhoPet() {
        RequestBanhoPetShop requestBanhoPetShop2 = new RequestBanhoPetShop(requestBanhoPetShop.banhoAndamento(),
                requestBanhoPetShop.shampooDisponivel(), requestBanhoPetShop.nivelAgua() - 10,
                requestBanhoPetShop.nivelShampoo() - 2, requestBanhoPetShop.banheriaLimpa());
        requestBanhoPetShop = requestBanhoPetShop2;
    }

    @Override
    public void abastecerAguaBanheira(double nivelAgua) {
        RequestBanhoPetShop requestBanhoPetShop2 = new RequestBanhoPetShop(requestBanhoPetShop.banhoAndamento(),
                requestBanhoPetShop.shampooDisponivel(), requestBanhoPetShop.nivelAgua() + nivelAgua,
                requestBanhoPetShop.nivelShampoo(), requestBanhoPetShop.banheriaLimpa());
        requestBanhoPetShop = requestBanhoPetShop2;

    }

    @Override
    public void abastecerShampoo(double nivelShampoo) {
        RequestBanhoPetShop requestBanhoPetShop2 = new RequestBanhoPetShop(requestBanhoPetShop.banhoAndamento(),
                requestBanhoPetShop.shampooDisponivel(), requestBanhoPetShop.nivelAgua(),
                requestBanhoPetShop.nivelShampoo() + nivelShampoo, requestBanhoPetShop.banheriaLimpa());
        requestBanhoPetShop = requestBanhoPetShop2;

    }

    @Override
    public double verificarNivelAgua() {
        return requestBanhoPetShop.nivelAgua();
    }

    @Override
    public double verificarNivelShampoo() {
        return requestBanhoPetShop.nivelShampoo();
    }

    @Override
    public boolean verificarBanhoAndamento() {
        return requestBanhoPetShop.banhoAndamento();
    }

    @Override
    public void colocarPetNaBanheira() {
        RequestBanhoPetShop requestBanhoPetShop2 = new RequestBanhoPetShop(true,
                requestBanhoPetShop.shampooDisponivel(), requestBanhoPetShop.nivelAgua(),
                requestBanhoPetShop.nivelShampoo(), requestBanhoPetShop.banheriaLimpa());
        requestBanhoPetShop = requestBanhoPetShop2;

    }

    @Override
    public void retirarPetDaBanheira() {
        RequestBanhoPetShop requestBanhoPetShop2 = new RequestBanhoPetShop(false,
                requestBanhoPetShop.shampooDisponivel(), requestBanhoPetShop.nivelAgua(),
                requestBanhoPetShop.nivelShampoo(), false);
        requestBanhoPetShop = requestBanhoPetShop2;

    }

    @Override
    public void limparBanheira() {
        RequestBanhoPetShop requestBanhoPetShop2 = new RequestBanhoPetShop(requestBanhoPetShop.banhoAndamento(),
                requestBanhoPetShop.shampooDisponivel(), requestBanhoPetShop.nivelAgua(),
                requestBanhoPetShop.nivelShampoo(), true);
        requestBanhoPetShop = requestBanhoPetShop2;

    }
}
