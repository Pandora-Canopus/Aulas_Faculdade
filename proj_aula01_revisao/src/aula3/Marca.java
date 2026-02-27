package aula3;

public class Marca {
	private Integer marcod;
	private String marnome;

	public Marca() {
	}
	
	public Marca(String nome) {
		this.marnome = nome;
	}

	public Integer getMarcod() {
		return marcod;
	}

	public void setMarcod(Integer marcod) {
		this.marcod = marcod;
	}

	public String getMarnome() {
		return marnome;
	}

	public void setMarnome(String marnome) {
		this.marnome = marnome;
	}
	
	
}
