package model;

// Tesla

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int potencia;
    private Boolean isLigado = false;
    private int velocidadeAtual = 0;
    private int velocidadeMaxima = 0;

    public Carro(String marca, String modelo, String cor, int potencia, Boolean isLigado, int velocidadeAtual, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.potencia = potencia;
        this.isLigado = isLigado;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro(String marca, String modelo, String cor, int potencia, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.potencia = potencia;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Boolean getLigado() {
        return isLigado;
    }

    public void setLigado(Boolean ligado) {
        isLigado = ligado;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }



    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", potencia=" + potencia +
                ", isLigado=" + isLigado +
                ", velocidadeAtual=" + velocidadeAtual +
                '}';
    }
}
