import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    private List<Integer> numeros = Arrays.asList(-1, -2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void verificarNumerosPositivos() {
        long quantidadeNegativos = numeros.stream().filter(n->n < 0).count();
        if( quantidadeNegativos > 0 )
            System.out.println("Existem " + quantidadeNegativos + " numeros negativos na lista");
        else 
            System.out.println("Todos os números da lista são positivos");
    }

    public static void main(String[] args) {
        Desafio3 desafio3 = new Desafio3();

        desafio3.verificarNumerosPositivos();
    }
}
