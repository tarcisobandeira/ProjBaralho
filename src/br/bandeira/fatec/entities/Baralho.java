package br.bandeira.fatec.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartaList;

    public Baralho(){
        montar();
        embaralhar();
        exibir();
    }

    private void montar(){
        cartaList = new ArrayList<>();
        for (Naipe n : Naipe.values()){
            for (Valor v : Valor.values()){
                Carta c = new Carta();
                c.setNaipe(n);
                c.setValor(v);
                cartaList.add(c);
            }
        }
    }

    private void embaralhar(){
        Collections.shuffle(cartaList);
    }

    private void exibir(){
        for (Carta c : cartaList){
            System.out.println(c.getNaipe().toString() +"-"+ c.getValor().toString());
        }
    }
}
