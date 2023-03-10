package entities;

import java.util.Scanner;

public class Medidas {
    public int nome;
    public double grau;
    public double fh;
    public double kelvin;
    public Scanner scanner = new Scanner(System.in);

    public void Calcular() {
        if (nome == 1) {
            grau = scanner.nextInt();
            fh = (grau * 1.8) + 32;
            kelvin = grau + 273.15;
            
        } else if (nome == 2) {
            fh = scanner.nextInt();
            grau = (fh - 32) / 1.8;
            kelvin = (fh + 459.67) / 1.8;

        } else if (nome == 3) {
            kelvin = scanner.nextInt();
            grau = kelvin - 273.15;
            fh = (kelvin * 1.8) - 459.67;

        } else {
            System.out.println("suck");
        }
    }
}