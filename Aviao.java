public class Aviao extends Veiculo {
	// Atributos específicos avião
	private String companhia;
	
	// Métodos Especiais
	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	
	public String toString() {
	    return (this.getCompanhia() + "\n" + this.getModelo() + "\n" + this.getCor() + "\n" + this.getPreco());
	}
}
