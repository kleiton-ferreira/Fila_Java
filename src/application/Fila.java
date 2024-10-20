package application;


public class Fila {
    private Nodo ponta;  // Ponta da fila (início)
    private Nodo cauda;  // Cauda da fila (final)

    public Fila() {
        this.ponta = null;  // Inicialmente, a fila está vazia
        this.cauda = null;
    }

    // Método para verificar se a fila está vazia
    public boolean estaVazia() {
        return ponta == null;
    }

    // Método para enfileirar (adicionar) um elemento
    public void enfileirar(int valor) {
        Nodo novoNodo = new Nodo(valor);
        if (estaVazia()) {
            ponta = novoNodo;  // Se a fila estiver vazia, a ponta e a cauda apontam para o novo nó
            cauda = novoNodo;
        } else {
            cauda.proximo = novoNodo;  // A cauda atual aponta para o novo nó
            cauda = novoNodo;  // A cauda se torna o novo nó
        }
    }

    // Método para desenfileirar (remover) um elemento
    public int desenfileirar() {
        if (estaVazia()) {
            System.out.println("Fila vazia. Não é possível desenfileirar.");
            return -1;
        }
        int valorRemovido = ponta.valor;
        ponta = ponta.proximo;  // A ponta se move para o próximo nó
        if (ponta == null) {
            cauda = null;  // Se a fila ficar vazia, a cauda também se torna null
        }
        return valorRemovido;
    }

    // Método para visualizar o primeiro elemento (ponta)
    public int primeiro() {
        if (estaVazia()) {
            System.out.println("Fila vazia.");
            return -1;
        }
        return ponta.valor;
    }

    // Método para exibir a fila
    public void exibir() {
        if (estaVazia()) {
            System.out.println("Fila vazia.");
            return;  // Encerra a execução do método se a fila estiver vazia
        }
        Nodo atual = ponta;
        while (atual != null) {
            System.out.print(atual.valor + " "); // Exibe o valor do nó atual seguido de um espaço
            atual = atual.proximo; // Move 'atual' para o próximo nó na fila
        }
        System.out.println();
    }
}
