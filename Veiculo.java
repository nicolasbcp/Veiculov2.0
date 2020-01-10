public class Veiculo {
	    // Atributos
	    private String modelo, cor;
	    private float km;
	    private boolean isLigado;
	    private int litrosCombustivel, velocidade;
	    private double preco;
	    
	    // Métodos Personalizados
	    public void abastecer(int qtdLitros) {
	        if (litrosCombustivel + qtdLitros < 100) {
	            qtdLitros = litrosCombustivel + qtdLitros; 
	            System.out.println("Tanque está com " + qtdLitros + "L");
	        } else { 
	            System.out.println("Seu veículo está com o tanque cheio!");
	        }	
	    }
	    public void acelerar() {
	        if (isLigado == true) {
	            velocidade += 20;
	            litrosCombustivel -= 1;
	            System.out.println("Velocidade atual: " + velocidade + " KM/H.");
	            System.out.println("Litros de combustível: " + litrosCombustivel +
	                    "L.");
	        } else {
	            System.out.println("Primeiro ligue o veículo.");
	        }
	    	
	    }
	    
	    // Métodos Especiais
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public float getKm() {
			return km;
		}
		public void setKm(float km) {
			this.km = km;
		}
		public boolean isLigado() {
			return isLigado;
		}
		public void setLigado(boolean isLigado) {
			this.isLigado = isLigado;
		}
		public int getLitrosCombustivel() {
			return litrosCombustivel;
		}
		public void setLitrosCombustivel(int litrosCombustivel) {
			this.litrosCombustivel = litrosCombustivel;
		}
		public int getVelocidade() {
			return velocidade;
		}
		public void setVelocidade(int velocidade) {
			this.velocidade = velocidade;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
}

