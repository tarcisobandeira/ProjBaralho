package br.bandeira.fatec.entities;

public enum Valor {

    AS(1), DOIS(2), TRES(3), QUATRO(4), CINCO(5), SEIS(6), SETE(7), OITO(8), NOVE(9), DEZ(10), DAMA(11), VALETE(12), REIS(13);

    private int valor;

    private Valor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
