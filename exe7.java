import java.util.Scanner;

public class exe7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float velocidade;

		System.out.println("Insira a velocidade!");
		velocidade = sc.nextFloat();
		double mtSeg = velocidade / 3.6;
		System.out.printf("%.2f km/h equivalem á %.2f metros por segundo!", velocidade, mtSeg);

		sc.close();
	}

}
