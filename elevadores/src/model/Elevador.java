package model;

public class Elevador {
	private String nome;
	private int andarAtual;
	private int andarMax;
	private int andarMin;
	private int capPessoas;
	private int qntPessoas;
	private int numPessoas;
	private boolean portaAberta;
	
	// Constructor
	public Elevador() {
	}
	public Elevador(String nome, int andarMax, int andarMin, int capPessoas) {
		this.nome = nome;
		this.andarMax = andarMax;
		this.andarMin = andarMin;
		this.capPessoas = capPessoas;
	}
	
//***********************************************//
	
	//Get vai ser usado para o main pegar uma informação da instância, descobrir o valor 
	public int getAndarAtual() {
		return this.andarAtual;
	}
	public int getCapPessoas() {
		return this.capPessoas;
	}
	public int getQntPessoas() {
		return this.qntPessoas;
	}
	public int getNumPessoas() {
		return this.numPessoas;
	}
	public boolean getPortaAberta() {
		return this.portaAberta;
	}
	
	//Set vai ser usado para definir uma quantidade da instância lá no main
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setAndarMax(int andarMax) {
		this.andarMax = andarMax;
	}
	public void setAndarMin(int andarMin) {
		this.andarMin = andarMin;
	}
	public void setCapPessoas(int capPessoas) {
		this.capPessoas = capPessoas;
	}
	
//***********************************************//
	
	public void subir() {
		if(this.andarAtual < this.andarMax) { 
			this.andarAtual++;
			System.out.println("Subi pro andar " + this.andarAtual);
		} else {
			System.out.println("Já estou no topo!");
		}
	}
	
	public void descer() {
		if(this.andarAtual > this.andarMin) {
			this.andarAtual--;
			System.out.println("Desci pro andar " + this.andarAtual);
		} else {
			System.out.println("Já estou no mínimo!");
		}
	}
	
	public void receberPessoa() {
		if(this.qntPessoas < this.capPessoas) {
			this.qntPessoas++;
			System.out.println("Estou com " + this.qntPessoas + " pessoas.");
		} else {
			System.out.println("Já estou lotado!");
		}
	}
	
	public int receberPessoas(int numPessoas) {
		if(this.qntPessoas + numPessoas <= this.capPessoas) {
			this.qntPessoas += numPessoas;
			System.out.println("Entraram " + numPessoas + ", agora estou com " + qntPessoas + ".");
			return qntPessoas;
		} else {
			int cabem = this.capPessoas - this.qntPessoas;
			this.qntPessoas += cabem;
			System.out.println(numPessoas + " querem entrar, entraram só " + cabem + " e agora estou lotado com " + this.qntPessoas);
			return cabem;
		}
	}
	
	public void despacharPessoa() {
		if(this.qntPessoas > 0) {
			this.qntPessoas--;
			System.out.println("Estou com " + this.qntPessoas + " pessoas.");
		} else {
			System.out.println("Já estou vazio!");
		}
	}
	
	public int despacharPessoas(int numPessoas) {
		this.qntPessoas -= numPessoas;
		System.out.println(numPessoas + " saíram, agora estou com " + qntPessoas + ".");
		return qntPessoas;
	}
	
	public void abrirPorta() {
		this.portaAberta = true;
		System.out.println("A porta abriu!");
	}
	
	public void fecharPorta() {
		this.portaAberta = false;
		System.out.println("A porta fechou!");
	}
	
	public String toString() {
		return "*************************\n" +
			   "Nome: " + this.nome + "\n" +
			   "Cap de Pessoas: " + this.capPessoas + "\n" +
			   "Qnt de Pessoas: " + this.qntPessoas + "\n" +
			   "*************************\n";
	}
}
