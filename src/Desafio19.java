import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    private List<Integer> numeros = Arrays.asList(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2);

    public void verificaSeTodosNumerosSaoIguais() {

        long quantidadeNumerosDistintos = numeros.stream().distinct().count();
        if(quantidadeNumerosDistintos == 1) {
            System.out.println("Todos os elementos da lista são iguais");
        }
        else {
            System.out.println("Os elementos da lista não são todos iguais");
        }
    }

    public static void main(String[] args) {
        Desafio19 desafio19 = new Desafio19();
        desafio19.verificaSeTodosNumerosSaoIguais();
    }
}
