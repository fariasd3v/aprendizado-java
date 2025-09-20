import java.util.Scanner; // BIBLIOTECA DE INPUT (

public class exe1 {

	public static void main(String[] args) {
		int num1, num2, resultado;

		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o primeiro numero");
		num1 = sc.nextInt();
		System.out.println("Insira o segundo numero");
		num2 = sc.nextInt();
		resultado = num1 + num2;
		System.out.println(resultado);
		sc.close();
	}

}
