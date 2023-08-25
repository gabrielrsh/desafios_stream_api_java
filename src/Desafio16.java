import java.util.Arrays;
import java.util.List;

public class Desafio16 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


    public int calculaFatorial(int n) {
        if(n==1)
            return 1;
        return n* calculaFatorial(n-1);
    }

    public void calculaFatorial() {

        numeros.stream().distinct().mapToInt(n -> {return calculaFatorial(n);}).forEach(n->System.out.println(n+" "));
        
    }

    public static void main(String[] args) {
        Desafio16 desafio16 = new Desafio16();
        desafio16.calculaFatorial();
    }
}
