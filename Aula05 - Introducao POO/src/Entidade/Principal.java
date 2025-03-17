package Entidade;

public class Principal {

	public static void main(String[] args) {
		Carro civic = new Carro();
		
		civic.fabricante = ", Honda ";
		civic.modelo = ", Civic ";
		civic.placa = ", EUB -6673 ";
		civic.ano = 2022 ; 
		civic.cor = ", Preta ";
		civic.acelera();
		System.out.println(civic);
		civic.exibirInfo();
		
		
		Carro kicks = new Carro();
		kicks.fabricante = ", Nissan ";
		kicks.modelo = ", kicks - sv ";
		kicks.placa = ", KLF - 9902 ";
		kicks.ano = 2023 ;
		kicks.cor = ", prata ";
		kicks.acelera();
		System.out.println(kicks);
		kicks.exibirInfo();
		
		
		
		Carro opala = new Carro();
		opala.fabricante = ", chevrolet ";
		opala.modelo = ", Opala Ss ";
		opala.placa = ", BBG - 9543 ";
		opala.ano = 1969 ;
		opala.cor = ", Preto ";
		opala.acelera();
		System.out.println(opala);
		opala.exibirInfo();
	}

}
