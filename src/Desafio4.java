import java.util.Arrays;
import java.util.List;

public class Desafio4 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void removerNumreoImpares() {
        //List<Integer> numerosPares;
        numeros.stream().filter(n->n%2==0).toList().forEach(n->System.out.print(n + " "));
        //System.out.println("Os numeros pares da lista são: "+numerosPares);
    }

    public static void main(String[] args) {
        Desafio4 desafio4 = new Desafio4();
        desafio4.removerNumreoImpares();
    }
}
