package scr.view;
import scr.model.EnqueteListener;
import scr.model.EnqueteSimples;

public class TelaResultado implements EnqueteListener {

    private EnqueteSimples enquete;

    public TelaResultado(EnqueteSimples enquete) {
        this.enquete = enquete;
    }

    public void resultado(){
        for (int i = 0; i < enquete.getOpcoes().size(); i++) {
            System.out.println(enquete.getOpcoes().get(i) + ": " + enquete.getVotos().get(i) + " votos");
        }
    }

    @Override
    public void novoVoto() {
    }

    @Override
    public void novaOpcao() {
    }
  
}
