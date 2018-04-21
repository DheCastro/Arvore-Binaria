package br.com.dhecastro.aplicacaoarvore.model;

//Classe representativa de um n� da �rvore
public class No { 
	
	int valorNo;
    No filhoEsquerda;   
    No filhoDireita;
  
    /**
     * Metodo para exibicao do valor do no
     * @return
     */
    public int mostraNo(){ 
        { 
            System.out.print("{"); 
            System.out.print(valorNo); 
            System.out.print("} "); 
        }
    
        return valorNo;
    }

	public int getValorNo() {
		return valorNo;
	}

	public void setValorNo(int valorNo) {
		this.valorNo = valorNo;
	}

	public No getFilhoEsquerda() {
		return filhoEsquerda;
	}

	public void setFilhoEsquerda(No filhoEsquerda) {
		this.filhoEsquerda = filhoEsquerda;
	}

	public No getFilhoDireita() {
		return filhoDireita;
	}

	public void setFilhoDireita(No filhoDireita) {
		this.filhoDireita = filhoDireita;
	} 
}
