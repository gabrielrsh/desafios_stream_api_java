import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void somaNumerosLista() {
        int resultado = numeros.stream().reduce(0,Integer::sum);
        System.out.println("A soma de todos os múmeros é: "+resultado);
    }

    public static void main(String[] args) {
        Desafio8 desafio8 = new Desafio8();
        desafio8.somaNumerosLista();
    }
}
