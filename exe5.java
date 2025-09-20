import java.util.Scanner;

public class exe5 {

	public static void main(String[] args) {
		int numero, verif1, verif2;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Digite um numero de quatro digitos:");
			numero = sc.nextInt();
		}

		while (numero < 1000);
		{
		}

		verif1 = numero / 100;
		verif2 = numero % 100;

		if ((verif1 + verif2) * (verif1 + verif2) == numero) {

			System.out.println("Possui ");

		} else
			System.out.println("Não possui");
		sc.close();
	}

}
