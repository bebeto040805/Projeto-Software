package poo;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta janeiro = new Conta();
		Conta fevereiro = new Conta();
		
		janeiro.agua = 200;
		janeiro.luz = 300;
		janeiro.alimentacao = 1000;
		
		fevereiro.agua = 200;
		fevereiro.luz = 500;
		fevereiro.alimentacao = 650;
		
	
		
		double Tfevereiro = fevereiro.somaConta();
		
		double Tjaneiro = janeiro.somaConta();
		
		
		if (Tjaneiro>Tfevereiro) {
			System.out.println("Janeiro Gastou mais");
		}else if (Tfevereiro>Tjaneiro){
			System.out.println("fevereiro Gastou mais");
		}else {
			System.out.println("Ambos gastaram a mesma quantidade");
		}
		
	}

}
