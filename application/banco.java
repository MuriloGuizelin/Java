package application;

import java.util.Scanner;

import entities.processo_banco;

public class banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        processo_banco pb = new processo_banco();
        pb.nome = sc.next();
        pb.conta = sc.nextInt();
        pb.dinheiro = sc.nextInt();
        System.out.printf(pb.nome + pb.conta + pb.dinheiro);

        sc.close();
    }
}
