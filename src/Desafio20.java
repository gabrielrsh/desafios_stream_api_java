import java.util.Arrays;
import java.util.List;

public class Desafio20 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void somaDosNumerosDivisiveisPor3e5() {

        int soma = numeros.stream().filter(n-> n % 3 == 0 || n % 5 == 0).reduce(0, Integer::sum);
        System.out.println(soma);
    }

    public static void main(String[] args) {
        Desafio20 desafio20 = new Desafio20();
        desafio20.somaDosNumerosDivisiveisPor3e5();
    }
}
