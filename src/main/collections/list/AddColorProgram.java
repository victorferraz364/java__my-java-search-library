package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Exemplo simples de uso de {@link java.util.ArrayList} com entrada de dados.
 * <p>
 * O programa lê cores digitadas pelo usuário no console e as adiciona em uma
 * lista. Quando o usuário digita o valor {@code 2}, o laço é encerrado
 * e todas as cores informadas até então são exibidas.
 */
public class AddColorProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lista dinâmica que irá armazenar as cores informadas pelo usuário
        List<String> colors = new ArrayList<>();

        // Laço infinito que só será interrompido quando o usuário digitar "2"
        while (true) {
            System.out.println("Digite uma cor (ou 2 para finalizar): ");

            String cor = sc.next();

            // Adiciona qualquer valor diferente de "2" na lista
            if (!cor.equalsIgnoreCase("2")) {
                colors.add(cor);
            }

            // Caso o usuário digite "2", encerramos o laço
            if (cor.equalsIgnoreCase("2")) {
                break;
            }
        }

        System.out.println("Cores digitadas: " + colors);
        sc.close();
    }

}
