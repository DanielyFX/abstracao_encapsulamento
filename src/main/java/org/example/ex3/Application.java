package org.example.ex3;

public class Application {
    public static void main(String[] args){
        RequestBanhoPetShop requestBanhoPetShop = new RequestBanhoPetShop();
        BanhoPetShopUseCase banhoPetShopUseCase = new BanhoPetShopUseCaseImpl(requestBanhoPetShop);
        banhoPetShopUseCase.abastecerAguaBanheira(10);
        banhoPetShopUseCase.abastecerShampoo(2);
        banhoPetShopUseCase.colocarPetNaBanheira();
        banhoPetShopUseCase.darBanhoPet();
        System.out.println("Nível de água: " + banhoPetShopUseCase.verificarNivelAgua());
        System.out.println("Nível de shampoo: " + banhoPetShopUseCase.verificarNivelShampoo());
        System.out.println("Banho em andamento: " + banhoPetShopUseCase.verificarBanhoAndamento());
    }
}
