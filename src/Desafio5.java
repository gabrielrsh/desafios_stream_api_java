import java.util.Arrays;
import java.util.List;

public class Desafio5 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void calculaMediaDeNumerosMaioresCinco() {
        double media = numeros.stream().filter(n->n>5).mapToInt(n->n).average().orElse(0);
        System.out.println("A média dos numeros maiores que Cinco é: " + media);
    }

    public static void main(String[] args) {
        Desafio5 desafio5 = new Desafio5();
        desafio5.calculaMediaDeNumerosMaioresCinco();
    }
}
