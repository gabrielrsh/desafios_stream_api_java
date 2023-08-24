import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void somaNumerosPares() {
        int resultado = numeros.stream().filter(n->n%2==0).reduce(0,Integer::sum);
        System.out.println("A soma de todos os múmeros pares é: "+resultado);
    }

    public static void main(String[] args) {
        Desafio2 desafio2 = new Desafio2();
        desafio2.somaNumerosPares();
    }
}
