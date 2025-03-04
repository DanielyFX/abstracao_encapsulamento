package org.example.ex3;

public interface BanhoPetShopUseCase {
    void darBanhoPet();
    void abastecerAguaBanheira(double nivelAgua);
    void abastecerShampoo(double nivelShampoo);
    double verificarNivelAgua();
    double verificarNivelShampoo();
    boolean verificarBanhoAndamento();
    void colocarPetNaBanheira();
    void retirarPetDaBanheira();
    void limparBanheira();
}
