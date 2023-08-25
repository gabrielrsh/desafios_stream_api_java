import java.util.Arrays;
import java.util.List;

public class Desafio17 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void separaParesImpares() {

        List<Integer> listaPares = numeros.stream().filter(n -> n%2 == 0).toList();
        System.out.println(listaPares);
        List<Integer> listaImpares = numeros.stream().filter(n -> n%2 != 0).toList();
        System.out.println(listaImpares);
    }

    public static void main(String[] args) {
        Desafio17 desafio17 = new Desafio17();
        desafio17.separaParesImpares();
    }
}
