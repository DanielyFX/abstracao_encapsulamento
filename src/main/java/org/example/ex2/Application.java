package org.example.ex2;

public class Application {
    public static void main(String[] args){
        CarroRequest carroRequest = new CarroRequest();
        CarroUseCase carro = new CarroUseCaseImpl(carroRequest);
        carro.ligarCarro();
        carro.trocarMarcha(MarchaCarro.PRIMEIRA);
        System.out.println(carro.verificaarMarcha());
        System.out.println(carro.verificarVelocidade());
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        System.out.println(carro.verificarVelocidade());
        carro.diminuirVelocidade();
        carro.diminuirVelocidade();
        carro.diminuirVelocidade();
        carro.desligarCarro();
        carro.ligarCarro();
        carro.trocarMarcha(MarchaCarro.PRIMEIRA);
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.acelerarCarro();
        carro.trocarMarcha(MarchaCarro.SEGUNDA);
        System.out.println(carro.verificaarMarcha());
        System.out.println(carro.verificarVelocidade());
    }
}
