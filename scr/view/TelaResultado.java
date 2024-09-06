package scr.view;
import scr.controller.TelaVotacaoCtrl;
import scr.model.EnqueteSimples;


public class TelaResultado {

    public static void main(String[] args) {
        EnqueteSimples enquete = new EnqueteSimples();
        TelaVotacaoCtrl telaVotacaoCtrl = new TelaVotacaoCtrl(enquete);

        // Exibe a tela de votação
        telaVotacaoCtrl.exibirTela();

        // Após a votação, exibe o resultado
        System.out.println("Resultado da votação:");
        String[] opcoes = enquete.getOpcoes();
        for (String opcao : opcoes) {
            System.out.println(opcao + ": " + enquete.getVotos(opcao) + " votos");
        }
    }
    
}
