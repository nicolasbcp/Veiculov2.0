public class Principal {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.setMarca("Volkswagen");
		c1.setModelo("Virtus");
		c1.setCor("Preto");
		c1.setPlaca("APZ-2321");
		c1.setPreco(100000.00);
		c1.setLigado(false);
		
		c1.acelerar();
		
		System.out.println(c1);
		System.out.println("----------------------------------------");
		
		Aviao t1 = new Aviao();
		t1.setCompanhia("American Airlines");
		t1.setModelo("BOEING 747");
		t1.setCor("Prata");
		t1.setPreco(1500000.00);
		t1.setLigado(true);
		
		t1.abastecer(101);
		t1.acelerar();
		
		System.out.println(t1);
		System.out.println("----------------------------------------");
		
		Caminhao a1 = new Caminhao();
		a1.setMarca("Mercedez");
		a1.setModelo("Scannia 1000");
		a1.setCor("Rosa");
		a1.setPlaca("TTT-1111");
		a1.setPreco(200000);
		a1.setLigado(true);
		
		a1.abastecer(50);
		a1.acelerar();
		a1.acelerar();
		
		System.out.println(a1);
		System.out.println("----------------------------------------");
	}
}
