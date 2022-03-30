package br.bandeira.fatec.enums;

public enum Naipe {
    COPAS(1), ESPADA(2), OURO(3), PAUS(4);

    private int valor;

    private Naipe(int valor) {
        this.valor = valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
