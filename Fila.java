public class Fila {

    private int tamanhoMaximo;
    private int topo;
    private int base;
    private int[] fila;
    private int quantidade;

    public Fila(int tamanho) {
        this.tamanhoMaximo = tamanho;
        this.quantidade = 0;
        this.base = 0;
        this.topo = 0; // Fila começa vazia, então topo é igual a base
        this.fila = new int[tamanhoMaximo];
    }

    public void push(int elemento) {
        if (isFull()) {
        } else {
            this.move();
            fila[topo] = elemento;
            topo = (topo + 1) % tamanhoMaximo;
            quantidade++;
        }
    }

    public int pop() {
        if (isEmpty()) {
            return -1; // Indicando erro ao desenfileirar
        } else {
            int elemento = fila[base];
            fila[base] = 0;
            base = (base + 1) % tamanhoMaximo;
            --quantidade;
            return elemento;
        }
    }

    public void move() {
        if (this.topo == this.tamanhoMaximo){
            System.out.println("circulando");
            this.topo = 0;
        }
//        this.topo = (this.topo + 1)% this.tamanhoMaximo;
    }

    public boolean isEmpty() {
        if (this.topo == this.quantidade) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isFull() {
        if (this.topo == this.tamanhoMaximo) {
            return true;
        } else {
            return false;
        }

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