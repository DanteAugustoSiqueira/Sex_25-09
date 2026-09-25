
package lista;

public class ListaEncadeada<Tipo> {
    private No<Tipo> inicio;
    private No<Tipo> fim;
    private int tamanho;

    // Metodo construtor.
    public ListaEncadeada() {
        this.tamanho = 0;
    }

    public void adiciona(Tipo elemento) {
        No<Tipo> celula = new No<Tipo>(elemento);
        if(this.inicio == null && this.fim == null) {
            this.inicio = celula;
            this.fim = celula;
        }
        else {
            this.fim.setProximo(celula);
            this.fim = celula;
        }
        this.tamanho++;
    }
    public No busca(int posicao) {
        No atual = this.inicio;

        for(int i = 0; i < posicao; i++) {
            if(atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }

        return atual;
    }
    public boolean remover(Tipo elemento) {
        No<Tipo> anterior = null;
        No<Tipo> atual = this.inicio;

        for(int i = 0; i < this.getTamanho(); i++) {
            if(atual.getElemento().equals(elemento)) {
                if(this.tamanho == 1){
                    this.inicio = null;
                    this.fim = null;
                }
                else if(atual == inicio) {
                    this.inicio = atual.getProximo();
                    atual.setProximo(null);
                }
                else if(atual == fim) {
                    this.fim = anterior;
                    anterior.setProximo(null);
                }
                else anterior.setProximo(atual.getProximo());

                atual = null;
                this.tamanho--;
                return true;
            }

            // Avança os ponteiros a cada passada do loop.
            anterior = atual;
            atual = atual.getProximo();
        }

        return false;
    }

    public No<Tipo> getInicio() {
        if(this.inicio == null) {
            throw new IllegalStateException("A lista esta vazia! Nao ha elementos no inicio.");
        }
        return inicio;
    }
    public void setInicio(No<Tipo> inicio) {
        this.inicio = inicio;
    }
    public No<Tipo> getFim() {
        if(this.fim == null) {
            throw new IllegalStateException("A lista esta vazia! Nao ha elementos no fim.");
        }
        return fim;
    }
    public void setFim(No<Tipo> fim) {
        this.fim = fim;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" + "inicio=" + inicio + '}';
    }
}
