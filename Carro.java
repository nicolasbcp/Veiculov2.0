public class Carro extends Veiculo {
	// Atributos espec�ficos carro
	private String marca, placa;
	
	// M�todos Especiais
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
	    return (this.getMarca() + "\n" + this.getModelo() + "\n" + this.getCor() + "\n" + this.getPlaca() + "\n" + this.getPreco());
	}
	
	
}
