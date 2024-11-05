package construtores;

import java.util.Random;

public class Aleatorio {
	int numero;
	
	Aleatorio(int maximo) {
		Random rand = new Random();
		numero = rand.nextInt(maximo);
	}
	
	public Aleatorio(String maximo) {
		this(Integer.parseInt(maximo));
	}
	
	public Aleatorio() {
		this("20");
	}
}
