import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {
		int fitasTotais, FitasPituba, FitasItapua;
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o valor total de fitas:");
		fitasTotais = sc.nextInt();
		FitasItapua = fitasTotais / 2;
		FitasPituba = fitasTotais / 2;
		System.out.println("Quantidade disponível na Pituba: " + FitasPituba);
		System.out.println("Quantidade disponível em Itapuã: " + FitasItapua);

		sc.close();
	}

}
