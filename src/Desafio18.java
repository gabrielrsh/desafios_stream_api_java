import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void filtraNumerosPrimos() {

    System.out.println("Numeros primos ");
        numeros.stream().distinct().mapToInt(n->n).filter(n -> {
            boolean isPrimo = true;
            if(n==1)
                return !isPrimo;   
            for(int i = 2; i < n; i++) {
                if(n % i == 0) {
                    isPrimo = false;
                }
            }
            return isPrimo;
        }).forEach(n-> { System.out.print(n+" "); });
    }

    public static void main(String[] args) {
        Desafio18 desafio18 = new Desafio18();
        desafio18.filtraNumerosPrimos();
    }
}
