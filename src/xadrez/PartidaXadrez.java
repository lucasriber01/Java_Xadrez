package xadrez;

import tabuleirogame.Tabuleiro;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro ;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8 , 8);
	}
	
	public PecaXadrez[][] getPecas(){
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinha() ][tabuleiro.getColuna()];

		for(int i=0; i<tabuleiro.getLinha(); i++) {
			for(int j=0 ; j<tabuleiro.getColuna(); j++) {
			mat[i][j] = (PecaXadrez) tabuleiro.pecas(i , j);
			}
			
		}
		return mat;
	}

}
