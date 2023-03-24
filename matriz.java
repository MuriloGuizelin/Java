import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int resultado;
		int tamanho = scanner.nextInt();
		int[][] matriz = new int[tamanho][tamanho];

		for(int i=0; i < tamanho; i++){
			for(int j=0; j < tamanho; j++){
				matriz[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Diagonal:");
		for(int i=0; i < tamanho; i++){
			resultado = matriz[i][i];
			resultado = resultado * 2;
			System.out.print(matriz[i][i] + " ");
		}
		scanner.close();
	}
}