import java.util.Arrays;
import java.util.List;

public class Desafio10 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public void agruparMultiplos3e5() {
        
        numeros.stream().filter(n-> n % 3 == 0 || n % 5 == 0).toList().forEach(n-> System.out.print(n + " "));;
    }

    public static void main(String[] args) {
        Desafio10 desafio10 = new Desafio10();
        desafio10.agruparMultiplos3e5();
    }
}
