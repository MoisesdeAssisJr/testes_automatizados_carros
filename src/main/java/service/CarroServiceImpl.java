package service;

import model.Carro;

public class CarroServiceImpl implements CarroService {

    @Override
    public void desligar(Carro carro) {
        carro.setLigado(false);
    }

    @Override
    public void ligar(Carro carro) {
        carro.setLigado(true);
    }

    @Override
    public void acelerar(Carro carro) {
            if (carro.getLigado()) {
                carro.setVelocidadeAtual(carro.getVelocidadeAtual() + carro.getPotencia());
            }
        }


    @Override
    public void acelerar(Carro carro, int velocidadeAMais) {
        if (carro.getLigado()) {
            carro.setVelocidadeAtual(carro.getVelocidadeAtual() + velocidadeAMais);
        }
    }

    @Override
    public void frear(Carro carro) {
        if (carro.getLigado()) {
            if (carro.getVelocidadeAtual() - carro.getPotencia() <= 0) {
                carro.setVelocidadeAtual(0);
            } else {
                carro.setVelocidadeAtual(carro.getVelocidadeAtual() - carro.getPotencia());
            }
        }
    }


    @Override
    public void frear(Carro carro, int velocidadeAMenos) {
        if (carro.getLigado()) {
            if (carro.getVelocidadeAtual() - velocidadeAMenos <= 0) {
                carro.setVelocidadeAtual(0);
            } else {
                carro.setVelocidadeAtual(carro.getVelocidadeAtual() - velocidadeAMenos);
            }
        }
    }


    @Override
    public void mostrarEstadoAtual(Carro carro) {
        System.out.println(carro.toString());

    }
}
