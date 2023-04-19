import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lambda {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> pares = numeros.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    System.out.println(pares);
    }

}
