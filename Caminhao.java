public class Caminhao extends Veiculo {
	// Atributos espec�ficos caminh�o
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
	
	public String toString() {
	    return (this.getMarca() + "\n" + this.getModelo() + "\n" + this.getCor() + "\n" + this.getPlaca() + "\n" + this.getPreco());
	}
}
