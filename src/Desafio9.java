import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    private List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    

    public void verificaNumerosDistintos() {
        
        long tamanhoTotalLista = numeros.stream().count();
        long tamanhoListaSemRepeticao = numeros.stream().distinct().count();
        if (tamanhoTotalLista != tamanhoListaSemRepeticao)
            System.out.println("Existem números repetidos na lista");
    }

    public static void main(String[] args) {
        Desafio9 desafio9 = new Desafio9();
        desafio9.verificaNumerosDistintos();
    }
}
