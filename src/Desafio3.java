import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    private List<Integer> numeros = Arrays.asList(-1, -2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void verificarNumerosPositivos() {
        System.out.println("Existem " + numeros.stream().filter(n->n < 0).count() + " numeros negativos na lista");
    }

    public static void main(String[] args) {
        Desafio3 desafio3 = new Desafio3();

        desafio3.verificarNumerosPositivos();
    }
}
