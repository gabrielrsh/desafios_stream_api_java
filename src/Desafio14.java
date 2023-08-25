import java.util.Arrays;
import java.util.List;

public class Desafio14 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void maiorNumeroPrimo() {


        int maiorPrimo = numeros.stream().distinct().mapToInt(n->n).filter(n -> {
            boolean isPrimo = true;
            if(n==1)
                return !isPrimo;   
            for(int i = 2; i < n; i++) {
                if(n % i == 0) {
                    isPrimo = false;
                }
            }
            return isPrimo;
        })
        .max().orElse(-1);
        System.out.println("Maior Primo " + maiorPrimo);
    }

    public static void main(String[] args) {
        Desafio14 desafio14 = new Desafio14();
        desafio14.maiorNumeroPrimo();
    }
}
