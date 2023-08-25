import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void somaDosQuadrados() {
        
        Double somaDosQuadrados = numeros.stream().map(n -> Math.pow(n, 2)).reduce(Double::sum).get();
        System.out.println(somaDosQuadrados);
    }

    public static void main(String[] args) {
        Desafio11 desafio11 = new Desafio11();
        desafio11.somaDosQuadrados();
    }
}
