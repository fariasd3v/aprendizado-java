import java.util.Scanner; // BIBLIOTECA DE INPUT (SCANF EM C)

public class exe2 {

	public static void main(String[] args) {
		float posto, posto2, posto3, media;
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o valor do primeiro posto");
		posto = sc.nextFloat();
		System.out.println("Insira o valor do segundo posto");
		posto2 = sc.nextFloat();
		System.out.println("Insira o valor do terceiro posto");
		posto3 = sc.nextFloat();

		media = (posto + posto2 + posto3) / 3;
		System.out.println("O valor medio e" + media);

		sc.close();
	}

}
