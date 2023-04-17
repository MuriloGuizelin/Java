import java.lang.invoke.LambdaConversionException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testes {
    public static void main(String[] args) {

    List<Integer> lista = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    int qnt = sc.nextInt();
    for(int i = 0; i<qnt;i++){
        int valor = sc.nextInt();
        lista.add(valor);
        
        }

    System.out.println(lista);
    sc.close();
    }
   }
