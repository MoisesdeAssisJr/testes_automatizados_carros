package org.example;

import model.Carro;
import service.CarroService;
import service.CarroServiceImpl;

/** Código desenvolvido como um exercício proposto na aula de testes automatizados.
 * Data: 23/01/2023
 * Bootcamp: Santander Coders - Automação de Testes - Ada
 */

public class Main {

    public static void main(String[] args) {


//        Enquanto o carro estiver desligado deve ser capaz de:
//           - Ligar
//           - Mostrar estado atual -> toString()
//
//
//        Enquanto o carro estiver ligado deve ser capaz de:
//          - Desligar -> isLigado = false
//          - Acelerar -> setVelocidadeAtual(...)
//          - Frear -> setVelocidadeAtual(...)
//          - Motrar estado atual -> toString()


        CarroService carroService = new CarroServiceImpl() {
        };


//        Cenário 01 - Deve acelerar corretamente
        // Dado:
        Carro carro01 = new Carro("Marca01", "Modelo01", "Cor01", 10, 100);

        // Quando:
        carroService.ligar(carro01);
        carroService.acelerar(carro01);

        // Então
        System.out.println("Resultado do cenário 01: " + (carro01.getVelocidadeAtual() == 10));


//        Cenário 02 - Deve acelerar corretamente
        // Dado:
        Carro carro02 = new Carro("Marca02", "Modelo02", "Cor02", 10, 100);

        // Quando:
        carroService.ligar(carro02);
        carroService.acelerar(carro02);
        carroService.acelerar(carro02);
        carroService.frear(carro02);

        // Então
        System.out.println("Resultado do cenário 02: " + (carro02.getVelocidadeAtual() == 10));


//        Cenário 03 - Deve iniciar desligado
        // Dado
        Carro carro03 =
                new Carro("Marca03", "Modelo03", "Cor03", 10, 100);

        // Então
        System.out.println("Resultado do cenário 03: " + (carro03.getLigado()));


//        Cenário 04: Não deve acelerar desligado
        //Dado
        Carro carro04 = new Carro("Marca 04", "Modelo04", "Cor04", 10, 100);

        //Quando
        carroService.acelerar(carro04);

        //Então
        System.out.println("Resultado do cenário 04: "+ (carro04.getVelocidadeAtual() == 0));

//        Cenário 05: Não deve ser possível uma velocidade negativa
        //Dado
        CarroService carroService5 = new CarroServiceImpl();
        Carro carro05 = new Carro("Marca 05", "Modelo05", "Cor05", 10, 100);

        //Quando
        carroService5.ligar(carro05);
        carroService5.frear(carro05);

        //Então
        System.out.println("Resultado do cenário 05: "+ (carro05.getVelocidadeAtual() == 0));
    }

}









