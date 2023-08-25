import java.util.Arrays;
import java.util.List;

public class Desafio13 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void somaDosQuadrados() {
        
        numeros.stream().filter(n -> n>5 && n<10).forEach(n -> System.out.print(n+" "));
    }

    public static void main(String[] args) {
        Desafio13 desafio13 = new Desafio13();
        desafio13.somaDosQuadrados();
    }
}
