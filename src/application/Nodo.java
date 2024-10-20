package application;

public class Nodo {
    int valor;           // Campo para armazenar o valor do nó
    Nodo proximo;        // Campo para armazenar a referência ao próximo nó

    public Nodo(int valor) {
        this.valor = valor;        // Inicializa o campo 'valor' com o valor passado como argumento
        this.proximo = null;       // Inicializa 'proximo' como null, pois o nó ainda não aponta para outro nó
    }
}
