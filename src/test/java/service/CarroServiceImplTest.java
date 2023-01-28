package service;

import model.Carro;
import org.junit.Assert;
import org.junit.Test;

public class CarroServiceImplTest {

    @Test
    public void deveAcelerarCorretamente() {
        CarroService carroService = new CarroServiceImpl();

        // Dado:
        Carro carro01 = new Carro("Marca01", "Modelo01", "Cor01", 10, 100);

        // Quando:
        carroService.ligar(carro01);
        carroService.acelerar(carro01);

        // Então
        Assert.assertTrue(carro01.getVelocidadeAtual() == 10);

        // System.out.println("Resultado do cenário 01: " + (carro01.getVelocidadeAtual() == 10));
    }

    @Test
    public void deveLigarCorretamente() {
        CarroService carroService = new CarroServiceImpl();

        // Dado
        Carro carro =
                new Carro("Marca02", "Modelo02", "Cor02", 10, 100);

        // Quando

        carroService.ligar(carro);

        // Então
        Assert.assertTrue(carro.getLigado());

    }

    @Test
    public void velicidadeNaoDeveSerMenorQueZero() {
        CarroService carroService = new CarroServiceImpl();

        // Dado
        Carro carro =
                new Carro("Marca02", "Modelo02", "Cor02", 10, 100);
        carroService.ligar(carro);
        carroService.acelerar(carro, 20);
        carroService.acelerar(carro);

        // Quando
        carroService.frear(carro, 50);

        // Então

        Assert.assertEquals(0, carro.getVelocidadeAtual());
    }

    @Test
    public void deveLigarCorretamenteEAcelerarCorretamente() {

        CarroService carroService = new CarroServiceImpl();

        // Dado
        Carro celtinha =
                new Carro("Chevrolet", "Celta", "Prata", 10, 100);

        // Quando
        carroService.ligar(celtinha);
        carroService.acelerar(celtinha, 10);

        // Então:

        Assert.assertTrue(celtinha.getLigado());
        Assert.assertEquals(10, celtinha.getVelocidadeAtual());
    }
}
