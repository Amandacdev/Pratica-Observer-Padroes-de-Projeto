package scr.model;

import java.util.ArrayList;
import java.util.List;

public class EnqueteSimples {
    private List<String> opcoes;
    private List<EnqueteListener> listeners;
    private List<Integer> votos = new ArrayList<>();

    public EnqueteSimples(){
        this.opcoes = new ArrayList<>();
        this.listeners = new ArrayList<>();
    }

    public List<String> getOpcoes(){
        return opcoes;
    }

    public List<Integer> getVotos() {
        return votos;
    }

    public void addEnqueteListener(EnqueteListener listener) {
        listeners.add(listener);
    }

    public void addOpcao(String opcao) {
        opcoes.add(opcao);
        votos.add(0);
        disparaNovaOpcao();
    }

    public void disparaNovoVoto() {
        for (EnqueteListener listener : listeners) {
            listener.novoVoto();
        }
    }

    public void disparaNovaOpcao() {
        for (EnqueteListener listener : listeners) {
            listener.novaOpcao();
        }
    }

    public void votar(int opcao) {
        int indice = opcao - 1;
        votos.set(indice,  votos.get(opcao)+1);
        disparaNovoVoto();
    }

}
