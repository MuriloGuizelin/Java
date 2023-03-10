package application;

import entities.Medidas;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Medidas temperatura = new Medidas();
        temperatura.nome = scanner.nextInt();
        temperatura.Calcular();
        System.out.println(temperatura.fh);
        System.out.println(temperatura.grau);
        System.out.println(temperatura.kelvin);
        scanner.close();
    }

}
