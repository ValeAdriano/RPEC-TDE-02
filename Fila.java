public class Fila {
    private int[] fila; // Array que armazena os elementos da fila
    private int capacidade; // Capacidade máxima da fila
    private int frente; // Índice do primeiro elemento
    private int traseira; // Índice do último elemento
    private int tamanho; // Número de elementos na fila

    // Construtor para inicializar a fila
    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.fila = new int[capacidade];
        this.frente = 0;
        this.traseira = -1;
        this.tamanho = 0;
    }

    // Método para adicionar um elemento na fila (enfileirar)
    public void enfileirar(int data) {
        if (isFull()) {
            System.out.println("A fila está cheia. Não é possível enfileirar.");
            return;
        }
        // Incrementa a traseira e ajusta o valor com módulo da capacidade para circular
        traseira = (traseira + 1) % capacidade;
        fila[traseira] = data;
        tamanho++;
    }

    // Método para remover um elemento da fila (desenfileirar)
    public int desenfileirar() {
        if (isEmpty()) {
            System.out.println("A fila está vazia. Não é possível desenfileirar.");
            return -1;
        }
        int data = fila[frente];
        frente = (frente + 1) % capacidade;
        tamanho--;
        return data;
    }

    // Método para verificar se a fila está vazia
    public boolean isEmpty() {
        return tamanho == 0;
    }

    // Método para verificar se a fila está cheia
    public boolean isFull() {
        return tamanho == capacidade;
    }

    // Método para retornar o elemento na frente da fila
    public int frente() {
        if (isEmpty()) {
            System.out.println("A fila está vazia.");
            return -1;
        }
        return fila[frente];
    }

    // Método para mostrar os elementos da fila
    public void mostrarFila() {
        if (isEmpty()) {
            System.out.println("A fila está vazia.");
            return;
        }
        System.out.print("Fila: ");
        for (int i = 0; i < tamanho; i++) {
            int index = (frente + i) % capacidade;
            System.out.print(fila[index] + " ");
        }
        System.out.println();
    }
}
