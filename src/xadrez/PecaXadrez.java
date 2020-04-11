package xadrez;

import tabuleirogame.Pecas;
import tabuleirogame.Tabuleiro;

public class PecaXadrez extends Pecas {
	
	private Cor cor;

	public PecaXadrez(Tabuleiro tabuleiro ,Cor cor) {
		super();
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	
	
	
	

}
