import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    private List<Integer> numeros = Arrays.asList(-1, 2, 3, 4, 5, 6, 7, 8, 9, -10, 5, 4, 3);

    public void contemNegativo() {
        
        if(numeros.stream().filter(n -> n < 0).count() > 0) {
            numeros.stream().filter(n -> n < 0).forEach(System.out::print);
        }
        else
            System.out.println("Não há numeros negativos");
    }

    public static void main(String[] args) {
        Desafio15 desafio15 = new Desafio15();
        desafio15.contemNegativo();
    }
}
