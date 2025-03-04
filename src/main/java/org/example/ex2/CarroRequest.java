package org.example.ex2;

public record CarroRequest(String estadoCarro, String estadoMotor, double velocidade, String direcao, int marcha) {


    public CarroRequest{
        verificarVelocidade(velocidade, marcha);
        verificarDesligarCarro(estadoCarro, marcha, velocidade);

    }
    public CarroRequest(){
        this(EstadoCarro.DESLIGADO.getDescricao(), EstadoMotor.DESACELERADO.getDescricao(), 0, null, 0);
    }

    public static void verificarVelocidade(double velocidade, int marcha){
        if (velocidade < 0){
            throw new IllegalArgumentException("Velocidade não pode ser negativa");
        }
        else if(velocidade > 120){
            throw new IllegalArgumentException("Velocidade não pode ser maior que 120");
        }

        else if(marcha == 0 && velocidade > 0){
            throw new IllegalArgumentException("Marcha não pode ser neutra com velocidade maior que 0");
        }

        else if(marcha == 1 && (velocidade > 21)){
            throw new IllegalArgumentException("Na marcha 1 não pode passar de 20km/h");
        }

        else if(marcha == 2 && (velocidade < 21 || velocidade > 41)){
            throw new IllegalArgumentException("Na marcha 2 não pode ser menor que 21 e maior que 40");
        }

        else if(marcha == 3 && (velocidade < 41 || velocidade > 61)){
            throw new IllegalArgumentException("Na marcha 3 não pode ser menor que 41 e maior que 60");
        }

        else if(marcha == 4 && (velocidade < 61 || velocidade > 81)){
            throw new IllegalArgumentException("Na marcha 4 não pode ser menor que 61 e maior que 80");
        }

        else if(marcha == 5 && (velocidade < 81 || velocidade > 101)){
            throw new IllegalArgumentException("Na marcha 5 não pode ser menor que 81 e maior que 100");
        }

        else if(marcha == 6 && (velocidade < 101 )){
            throw new IllegalArgumentException("Na marcha 6 não pode ser menor que 101 e maior que 120");
        }

    }

    public static void verificarDesligarCarro(String estadoCarro, int marcha, double velocidade){
        if (EstadoCarro.DESLIGADO.getDescricao().equals(estadoCarro)  && marcha != 0 && velocidade != 0){
            throw new IllegalArgumentException("Carro não pode ser desligado com marcha diferente de neutro e velocidade diferente de 0");
        }
    }

    public static void virarCarro(String direcao, double velocidade){
        if (direcao == null){
            throw new IllegalArgumentException("Direção não pode ser nula");
        }
        else if(velocidade < 1 || velocidade > 40){
            throw new IllegalArgumentException("Carro não pode virar com velocidade menor que 1 e maior do que 40");
        }
    }

}
