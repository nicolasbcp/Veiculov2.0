public class Aviao extends Veiculo {
	// Atributos espec�ficos avi�o
	private String companhia;
	
	// M�todos Especiais
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
