package scr;

import scr.model.EnqueteSimples;
import scr.view.TelaResultado;
import scr.view.TelaVotacao;

public class Main {
    public static void main(String[] args) {
        EnqueteSimples enquete = new EnqueteSimples();
        
        TelaResultado telaResultado = new TelaResultado(enquete);
      
        System.out.println("Enquete: Em que você vai votar?");
        enquete.addOpcao("Opção 1 - Iterator:");
        enquete.addOpcao("Opção 2 - Observer:");
        enquete.addOpcao("Opção 3 - Abstract Factory:");
        enquete.addOpcao("Opção 4 - Template Method:");
        


        TelaVotacao telaVotacao = new TelaVotacao(enquete);

        telaVotacao.exibirTela();
        telaResultado.resultado();

    }
    
}
