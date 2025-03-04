package org.example.ex2;

public class CarroUseCaseImpl implements CarroUseCase{
    CarroRequest carroRequest;

    public CarroUseCaseImpl(CarroRequest carroRequest) {
        this.carroRequest = carroRequest;
    }

    @Override
    public void ligarCarro() {
        CarroRequest carroRequest2 = new CarroRequest(EstadoCarro.LIGADO.getDescricao(), carroRequest.estadoMotor(), carroRequest.velocidade(), carroRequest.direcao(), carroRequest.marcha());
        this.carroRequest = carroRequest2;
    }

    @Override
    public void desligarCarro() {
        CarroRequest carroRequest2 = new CarroRequest();
        this.carroRequest = carroRequest2;

    }

    @Override
    public void acelerarCarro() {
        CarroRequest carroRequest2 = new CarroRequest(carroRequest.estadoCarro(), EstadoMotor.ACELERADO.getDescricao(), carroRequest.velocidade() + 1, carroRequest.direcao(), carroRequest.marcha());
        this.carroRequest = carroRequest2;
    }

    @Override
    public void diminuirVelocidade() {
        CarroRequest carroRequest2 = new CarroRequest(carroRequest.estadoCarro(), EstadoMotor.DESACELERADO.getDescricao(), carroRequest.velocidade() - 1, carroRequest.direcao(), carroRequest.marcha());
        this.carroRequest = carroRequest2;
    }

    @Override
    public void virarCarro(DirecaoCarro direcao) {
        CarroRequest carroRequest2 = new CarroRequest(carroRequest.estadoCarro(), carroRequest.estadoMotor(), carroRequest.velocidade(), direcao.getDescricao(), carroRequest.marcha());
        this.carroRequest = carroRequest2;

    }

    @Override
    public double verificarVelocidade() {
        return carroRequest.velocidade();
    }

    @Override
    public int verificaarMarcha() {
        return carroRequest.marcha();
    }

    @Override
    public void trocarMarcha(MarchaCarro marcha) {
        CarroRequest carroRequest2 = new CarroRequest(carroRequest.estadoCarro(), carroRequest.estadoMotor(), carroRequest.velocidade(), carroRequest.direcao(), marcha.getDescricao());
        this.carroRequest = carroRequest2;

    }
}
