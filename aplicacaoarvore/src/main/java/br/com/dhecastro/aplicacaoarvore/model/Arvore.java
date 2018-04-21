package br.com.dhecastro.aplicacaoarvore.model;

//Classe representativa de uma arvore
public class Arvore {
	private No raiz;
	public int soma = 0;

	// Construtor
	public Arvore() {
		// Arvore vazia
		raiz = null;
	}

	/**
	 * Metodo que busca um no baseado no seu valor como chave
	 * 
	 * @param chave
	 * @return
	 */
	public No buscarNo(int chaveBusca) {

		// Parte da raiz e continua no a no
		No atual = raiz; //10
		
		while (atual.valorNo != chaveBusca) {
			
			// Filho da esquerda ou direita
			if (chaveBusca < atual.valorNo) {
				atual = atual.filhoEsquerda;
			} else {
				atual = atual.filhoDireita;
			}

			// Nao existe no filho
			if (atual == null) {
				System.out.println("Nao existe no alem da raiz.");
				return null;
			}
		}

		return atual;
	}

	/**
	 * Metodo que insere um no na arvore
	 * @param valor
	 */
	public void insere(int valor) {
		No novoNo = new No();
		novoNo.valorNo = valor;

		if (raiz == null) {
			raiz = novoNo;

		} else {
			No atual = raiz;
			No parente;

			while (true) {
				parente = atual;

				if (valor < atual.valorNo) {
					atual = atual.filhoEsquerda;
					if (atual == null) {

						parente.filhoEsquerda = novoNo;
						return;
					} 
				} else {
					atual = atual.filhoDireita;
					if (atual == null) {

						parente.filhoDireita = novoNo;
						return;
					} 
				}
			}
		}
	}

	/**
	 * Metodo que recupera os nos indo da raiz para o ultimo
	 * 
	 * @param no raiz/subraiz
	 */
	public void preOrdem(No raiz) {
		if (raiz != null) {
			soma = soma + raiz.mostraNo();
			preOrdem(raiz.filhoEsquerda);
			preOrdem(raiz.filhoDireita);
		}
	}

	/**
	 * Metodo que recupera os nos vindo do ultimo para a raiz
	 * 
	 * @param no raiz/subraiz
	 */
	public void posOrdem(No raiz) {
		if (raiz != null) {
			posOrdem(raiz.filhoEsquerda);
			posOrdem(raiz.filhoDireita);
			soma = soma + raiz.mostraNo();
		}
	}

	public No getRaiz() {
		return raiz;
	}

	public void setRaiz(No raiz) {
		this.raiz = raiz;
	}

	public int getSoma() {
		return soma;
	}

	public void setSoma(int soma) {
		this.soma = soma;
	}
}
