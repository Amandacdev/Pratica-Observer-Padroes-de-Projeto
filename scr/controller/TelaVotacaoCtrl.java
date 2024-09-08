package scr.controller;

import scr.model.EnqueteSimples;

public class TelaVotacaoCtrl {
    private EnqueteSimples enquete;

    public TelaVotacaoCtrl(EnqueteSimples enquete) {
        this.enquete = enquete;
    }

    public void contarVoto(int opcao){
        enquete.votar(opcao);
    
    }
   
}
