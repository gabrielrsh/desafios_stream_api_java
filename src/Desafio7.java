import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Desafio7 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void segundoMaiorNumero() {
        //colocar em um set para retirar valores duplicados
        Set<Integer> conjunto = new TreeSet<>(numeros.stream().sorted().toList());
        //converter para um array e acessar a penultima posicao
        System.out.println(conjunto.toArray()[conjunto.size()-2]);
    }

    public static void main(String[] args) {
        Desafio7 desafio7 = new Desafio7();
        desafio7.segundoMaiorNumero();
    }
}
