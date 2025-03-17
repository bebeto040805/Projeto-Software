package estruturada;

public class Estruturada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double  janAlimento , janAgua , janEnergia, fevAlimento ,fevEnergia, fevAgua;
		
		janAlimento = 300;
		janAgua = 50;
		janEnergia = 200;
		
		fevAlimento = 400;
		fevEnergia = 300;
		fevAgua = 10;
		
		double Tfev =  fevAlimento + fevEnergia + fevAgua;
		double Tjan =  janAlimento + janAgua + janEnergia;
		
		
		if (Tfev > Tjan) {
			System.out.println("Fevereiro gastou mais");
		}else {
			System.out.println("Janeiro gastou mais");

		}
	}

}
