package scr.model;

import java.util.ArrayList;
import java.util.List;

public class EnqueteSimples {
    private List<String> opcoes;
    private List<EnqueteListener> listeners;

    public EnqueteSimples(){
        this.opcoes = new ArrayList<>();
        this.listeners = new ArrayList<>();
    }

    public String[] getOpcoes(){
        return opcoes.toArray(new String[0]);
    }

    public int getTotalVotos() {
        int totalVotos = 0;
        for (EnqueteListener listener : listeners) {
            totalVotos += listener.getVotos();
        }
        return totalVotos;
    }

    public int getVotos(String opcao) {
        int votos = 0;
        for (EnqueteListener listener : listeners) {
            votos += listener.getVotos(opcao);
        }
        return votos;
    }
    public void addEnqueteListener(EnqueteListener listener) {
        listeners.add(listener);
        listener.estadoModificado(); 
    }

    public void addOpcao(String opcao) {
        opcoes.add(opcao);
        disparaNovaOpcao(opcao);
    }

    public void disparaNovoVoto(String opcao) {
        for (EnqueteListener listener : listeners) {
            listener.novoVoto(opcao);
        }
    }

    public void disparaNovaOpcao(String opcao) {
        for (EnqueteListener listener : listeners) {
            listener.novaOpcao(opcao);
            listener.estadoModificado(); 
        }
    }

    public void votar(String opcao) {
        disparaNovoVoto(opcao);
    }

}

interface EnqueteListener {
    void novoVoto(String opcao);
    void novaOpcao(String opcao);
    void estadoModificado();
    int getVotos();
    int getVotos(String opcao);
}