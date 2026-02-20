package proj_aula02;

public class Testeaula2 {

	public static void main(String[] args) {
		
		Marca m1 = new Marca();
		Marca m2 = new Marca();
		
		m1.setId(1);
		m1.setNome("BYD");
		
		m2.setId(2);
		m2.setNome("HONDA");
			
		Motocicleta moto = new Motocicleta();
			moto.setId(10);
			moto.setModelo("Titan CG50");
			moto.setAno(2000);
			moto.setValor(15000.0);
			moto.setMarca(m2); // Marca do Veículo.
			moto.setCilindradas(230);
			moto.calcIpva();
		
		Veiculo vei = new Veiculo();
			vei.setId(10);
			vei.setModelo("Dolfin");
			vei.setAno(1980);
			vei.setValor(90000.0);
			vei.setMarca(m2); // Marca do Veículo.
			vei.calcIpva();
		
		// Processamento
		System.out.println("A marca: "+m1.getNome());
		System.out.println("A marca: "+m2.getNome());
		System.out.println("————————————————————————");
		System.out.println("O veiculo: "+vei.getModelo());
		System.out.println("O valor: R$"+vei.getValor());
		System.out.println("O ano: "+vei.getAno());
		System.out.println("A marca: "+vei.getMarca().getNome());
		System.out.println("O valor do IPVA: R$"+vei.getIpva());
		System.out.println("————————————————————————");
		System.out.println("A moto: "+moto.getModelo());
		System.out.println("O valor: R$"+moto.getValor()); 
		System.out.println("O ano: "+vei.getAno());
		System.out.println("A marca: "+moto.getMarca().getNome());
		System.out.println("As cilindradas: "+moto.getCilindradas());
		System.out.println("O valor do IPVA: R$"+moto.getIpva());
	
		

	}

}
