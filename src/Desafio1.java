import java.util.Arrays;
import java.util.List;

public class Desafio1 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void ordenarCrescente() {
        numeros.stream().sorted().forEach(n->System.out.print(n+" "));
    }

    public static void main(String[] args) {
        Desafio1 desafio1 = new Desafio1();
        desafio1.ordenarCrescente();
    }
}