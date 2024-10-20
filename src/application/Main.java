package application;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();

        // Enfileirar elementos
        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);

        // Exibir a fila
        System.out.println("Fila após enfileirar elementos:");
        fila.exibir();

        // Desenfileirar um elemento
        int removido = fila.desenfileirar();
        System.out.println("Elemento removido: " + removido);

        // Exibir a fila após a remoção
        System.out.println("Fila após desenfileirar um elemento:");
        fila.exibir();

        // Verificar o primeiro elemento da fila (ponta)
        int primeiro = fila.primeiro();
        System.out.println("Primeiro elemento da fila: " + primeiro);
    }
}

