package scr.view;
import java.util.Scanner;

import scr.controller.TelaVotacaoCtrl;
import scr.model.EnqueteSimples;


public class TelaVotacao {
    private EnqueteSimples enquete;
    private TelaVotacaoCtrl votacaoCtrl;

    public TelaVotacao(EnqueteSimples enquete) {
        this.enquete = enquete;
        this.votacaoCtrl = new TelaVotacaoCtrl(enquete);
    }

    public void exibirTela() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à votação!");
        System.out.println("Escolha uma das opções abaixo:");

        for (int i = 0; i < enquete.getOpcoes().size(); i++) {
            System.out.println((i + 1) + ". " + enquete.getOpcoes().get(i));
        }

        System.out.print("Digite o número da sua opção: ");
        
        int escolha = scanner.nextInt();
        votacaoCtrl.contarVoto(escolha);     
    }
    
}
