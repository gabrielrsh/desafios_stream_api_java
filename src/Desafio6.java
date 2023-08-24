import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 13);

    public void verificarNumerosMaiorDez() {
        System.out.println("Existem " + numeros.stream().filter(n->n > 10).count() + " numeros maiores que 10");
    }

    public static void main(String[] args) {
        Desafio6 desafio6 = new Desafio6();
        desafio6.verificarNumerosMaiorDez();
    }
}
