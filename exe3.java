
public class exe3 {

	public static void main(String[] args) {
		int fitasTotais = 4000;
		int ftPituba = 1620, ftItapua = 1710;
		int fitasClientesPituba = (fitasTotais / 2) - ftPituba;
		int fitasClientesItapua = (fitasTotais / 2) - ftItapua;
		int FitasDisponiveis = ftPituba + ftItapua;
		int fitasComClientes = fitasClientesPituba + fitasClientesItapua;
		double percentualFitas1 = (double) fitasComClientes / fitasTotais * 100;

		System.out.println("Fitas totais > " + fitasTotais);
		System.out.println("Fitas disponíveis nas lojas somadas:" + FitasDisponiveis);
		System.out.println("Fitas com os clientes da pituba:" + fitasClientesPituba);
		System.out.println("Fitas com os clientes da itapua:" + fitasClientesItapua);
		System.out.println("Percentual de fitas com clientes: " + percentualFitas1 + "%");

	}

}
