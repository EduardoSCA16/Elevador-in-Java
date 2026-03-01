package view;

import model.Elevador;

public class VisaoElevador {

	public static void main(String[] args) {
		
		Elevador e1 = new Elevador("Eduardo, O Elevador.", 20, -1, 12);
		
		e1.subir();
		e1.subir();
		e1.descer();
		e1.descer();
		e1.descer();
		e1.descer();
		
		System.out.println("\nO elevador está no andar " + e1.getAndarAtual() + "\n");
		
		e1.receberPessoa();
		e1.receberPessoas(4);
		e1.receberPessoa();
		e1.despacharPessoa();
		e1.despacharPessoas(3);
		e1.receberPessoas(15);  
		
		System.out.println("\n" + e1.toString());
	}
}
