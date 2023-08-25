import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void produtoDosNumeros() {
        
        int produtoTotal = numeros.stream().reduce(1, (n, m) -> n * m);
        System.out.println(produtoTotal);
    }

    public static void main(String[] args) {
        Desafio12 desafio12 = new Desafio12();
        desafio12.produtoDosNumeros();
    }
}
