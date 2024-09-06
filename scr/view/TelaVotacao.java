package scr.view;
import java.util.Scanner;

import scr.model.EnqueteSimples;


public class TelaVotacao {
    private EnqueteSimples enquete;

    public TelaVotacao(EnqueteSimples enquete) {
        this.enquete = enquete;
        inicializarEnquete();
    }

    private void inicializarEnquete() {
        // Adiciona as 4 opções para a votação
        enquete.addOpcao("Opção 1 - Iterator:");
        enquete.addOpcao("Opção 2 - Observer:");
        enquete.addOpcao("Opção 3 - Abstract Factory:");
        enquete.addOpcao("Opção 4 - Template Method:");
    }

    public void exibirTela() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à votação!");
        System.out.println("Escolha uma das opções abaixo:");

        // Exibe as opções de votação
        String[] opcoes = enquete.getOpcoes();
        for (int i = 0; i < opcoes.length; i++) {
            System.out.println((i + 1) + ". " + opcoes[i]);
        }

        System.out.print("Digite o número da sua opção: ");
        int escolha = scanner.nextInt();

        // Valida a escolha e registra o voto
        if (escolha >= 1 && escolha <= opcoes.length) {
            String opcaoEscolhida = opcoes[escolha - 1];
            enquete.votar(opcaoEscolhida);
            System.out.println("Você votou na " + opcaoEscolhida);
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
    
}
