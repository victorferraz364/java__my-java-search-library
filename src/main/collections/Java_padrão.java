package collections;

/**
 * Demonstra a declaração de arrays no Java "padrão".
 * <p>
 * Mostra duas formas comuns de declarar e inicializar vetores de inteiros.
 */
public class Java_padrão {

    public static void main(String[] args) {

        // Declaração de um array de inteiros sem inicialização
        int[] numeros;

        // Declaração e inicialização de um array de inteiros
        int[] numeros2 = {1, 3};

        // Apenas para evitar warning de variável não utilizada
        numeros = numeros2;
        System.out.println("Tamanho do array numeros2: " + numeros.length);
    }

}
