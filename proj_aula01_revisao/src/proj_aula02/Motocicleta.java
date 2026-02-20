package proj_aula02;

public class Motocicleta extends Veiculo{
	
	private Integer cilindradas;
	
	public Integer getCilindradas() {
		return cilindradas;
	}
	
	public void setCilindradas(Integer cilindradas) {
		this.cilindradas = cilindradas;
	}
	
		@Override
		public void calcIpva() {
			if(cilindradas <= 160)
				setIpva(0.0);
			else if(cilindradas <= 400)
				setIpva(getValor()*3/100);
			else
				setIpva(getValor()*5/100);
		}

}
