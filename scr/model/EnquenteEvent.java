package scr.model;

public class EnquenteEvent {
    private String opcao;
    private EnqueteSimples enquete;

    public void EnqueteEvent(String opcao, EnqueteSimples enquete) {
        this.opcao = opcao;
        this.enquete = enquete;
    }

    public String getOpcao() {
        return opcao;
    }

    public EnqueteSimples getEnquete() {
        return enquete;
    }
}
