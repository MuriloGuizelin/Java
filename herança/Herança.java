package herança;

import java.util.Scanner;

public class Herança {
    public static void main(String[] args) {
        Polimorfismo poli = new Polimorfismo();
        Scanner sc = new Scanner(System.in);
        poli.valor = sc.nextInt();
        poli.quantia = sc.nextInt();
        System.out.print(poli.exec());
    }
}
