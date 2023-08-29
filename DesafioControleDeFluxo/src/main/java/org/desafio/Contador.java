package org.desafio;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            int resultado = contar(parametroUm, parametroDois);
            System.out.println("Contagem realizada com sucesso: " + resultado + " números impressos.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static int contar(int parametroUm, int parametroDois) throws Exception {
        if (parametroUm > parametroDois) {
            try {
                throw new Exception("O segundo parâmetro deve ser maior que o primeiro");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        int contagem = parametroDois - parametroUm + 1;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + (parametroUm + i - 1));
        }

        return contagem;
    }
    }
