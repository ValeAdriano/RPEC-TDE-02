public class Fila {

    private int tamanhoMaximo;
    private int topo;
    private int base;
    private int[] fila;

    public Fila(int tamanho) {
        this.tamanhoMaximo = tamanho;
        this.base = 0;
        this.topo = 0; // Fila começa vazia, então topo é igual a base
        this.fila = new int[tamanhoMaximo];
    }

    public void push(int elemento) {
        if (isFull()) {
        } else {
            fila[topo] = elemento;
            topo = (topo + 1) % tamanhoMaximo;
        }
    }

    public int pop() {
        if (isEmpty()) {
            return -1; // Indicando erro ao desenfileirar
        } else {
            int elemento = fila[base];
            base = (base + 1) % tamanhoMaximo;
            return elemento;
        }
    }

    public boolean isEmpty() {
        return topo == base;
    }

    public boolean isFull() {
        return (topo + 1) % tamanhoMaximo == base;
    }

    // Método para retornar o elemento no topo da fila (na frente)
    public int topo() {
        if (isEmpty()) {
            System.out.println("A fila está vazia!");
            return -1; // Indicando que a fila está vazia
        } else {
            return fila[base];
        }
    }

    // Método para imprimir todos os elementos da fila
    public void mostrarFila() {
        if (isEmpty()) {
            System.out.println("A fila está vazia!");
        } else {
            System.out.print("Fila: ");
            for (int i = base; i != topo; i = (i + 1) % tamanhoMaximo) {
                System.out.print(fila[i] + " ");
            }
            System.out.println();
        }
    }
}