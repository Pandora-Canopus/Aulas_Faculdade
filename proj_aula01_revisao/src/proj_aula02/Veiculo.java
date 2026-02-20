package proj_aula02;

public class Veiculo {
	
	private Integer id;
	private String modelo;
	private Integer ano;
	private Double valor;
	private Double ipva;
	private Marca marca;
	
		public void calcIpva() {
			if(marca.getNome().equals("BYD"))
				ipva = valor*2/100;
			else if(marca.getNome().equals("HONDA"))
				ipva = valor*3/100;
			else if(marca.getNome().equals("TOYOTA"))
				ipva = valor*4/100;
			else
				ipva = valor*5/100;
		}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getIpva() {
		return ipva;
	}
	public void setIpva(Double ipva) {
		this.ipva = ipva;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	

}
