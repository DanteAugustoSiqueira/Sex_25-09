
package lista;

public class No<TipoElemento> {
    private TipoElemento elemento;
    private No<TipoElemento> proximo;

    //--!!--//

    // Metodos construtores.
    public No(TipoElemento elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }
    public No(TipoElemento elemento, No<TipoElemento> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    //--!!--//

    // Métodos Getters e Setters padrões.
    public TipoElemento getElemento() {
        return elemento;
    }
    public void setElemento(TipoElemento elemento) {
        this.elemento = elemento;
    }

    public No<TipoElemento> getProximo() {
        return proximo;
    }
    public void setProximo(No<TipoElemento> proximo) {
        this.proximo = proximo;
    }

    //--!!--//

    // Sobreposição do método toString() para exibir o No de forma legível.
    @Override
    public String toString() {
        return "No{" + "elemento=" + elemento + ", proximo=" + proximo + '}';
    }
}
