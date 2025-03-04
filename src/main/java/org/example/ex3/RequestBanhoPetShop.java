package org.example.ex3;

public record RequestBanhoPetShop(boolean banhoAndamento, boolean shampooDisponivel, double nivelAgua,
                                  double nivelShampoo, boolean banheriaLimpa) {
    public RequestBanhoPetShop{
        validAbastecimentoShampoo(nivelShampoo);
        validShampoo(nivelShampoo);
        validAguaBanheira(nivelAgua);
        validPetBanheira(banhoAndamento);
        validCapacidadeMaquina(nivelAgua, nivelShampoo);
    }

    public RequestBanhoPetShop(){
        this(false, false, 0, 0, true);
    }

    public static void validPetBanheira(boolean banhoAndamento){
        if (banhoAndamento){
            throw new IllegalArgumentException("Banho em andamento, aguarde o término para iniciar um novo banho.");
        }
    }


    public static void validAguaBanheira(double nivelAgua){
        if (nivelAgua <= 0){
            throw new IllegalArgumentException("Banheira sem água, favor abastecer.");
        }
    }

    public static void validShampoo(double nivelShampoo){
        if (nivelShampoo <= 0){
            throw new IllegalArgumentException("Shampoo insuficiente, favor abastecer.");
        }
    }

    public static void validAbastecimentoShampoo(double nivelShampoo){
        if (nivelShampoo > nivelShampoo + 2){
            throw new IllegalArgumentException("Abastecimento de Shampoo de apenas 2 litros por vez.");
        }
    }

    public static void validCapacidadeMaquina(double volumeAgua, double volumeShampoo){
        if(volumeAgua > 30 || volumeShampoo > 10){
            throw new IllegalArgumentException("Capacidade máxima da máquina atingida.");
        }
    }
}
