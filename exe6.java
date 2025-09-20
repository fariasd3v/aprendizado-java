import java.util.Scanner;

public class exe6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alga;
		System.out.println("Digite um algarismo de tres numeros:");
		alga = sc.nextInt();

		int centenas = alga / 100;
		int dezena = (alga / 10) % 10;
		int unidade = alga % 10;

		int Inverter = unidade * 100 + dezena * 10 + centenas;

		System.out.println("Numero invertido:" + Inverter);
		sc.close();
	}

}
