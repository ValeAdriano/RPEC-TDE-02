public class Fila {

    private int tamanhoMaximo;
    private int topo;
    private int base;
    private int[] pilha;

    public Fila(int tamanho) {
        this.tamanhoMaximo = tamanho;
        this.base = 0;
        this.pilha = new int[tamanhoMaximo];
        this.topo = 0; // Pilha começa vazia, então topo é -1
    }

    public void push(int elemento) {
        if (topo == tamanhoMaximo) {
            System.out.println("A pilha está cheia!");
        } else {
            pilha[++topo] = elemento;
        }
    }

    public int pop() {
        if (topo == base) {
            System.out.println("A pilha está vazia!");
            return -1; // Indicando erro ao desempilhar
        } else {
            return pilha[base++];
        }
    }

    public boolean isEmpty() {
        if (topo == base) {

            return topo == -1;
        } else {
            return topo == topo;
        }


    }

    public boolean isFull() {
        if (topo == tamanhoMaximo){
            System.out.println("A fila está cheia");
            return true;
        } else {
            return false;
        }
    }

    // Método para retornar o elemento no topo da pilha
    public int topo() {
        if (topo == -1) {
            System.out.println("A pilha está vazia!");
            return -1; // Indicando que a pilha está vazia
        } else {
            return pilha[topo];
        }
    }

    // Método para imprimir todos os elementos da pilha
    public void mostrarPilha() {
        if (topo == -1) {
            System.out.println("A pilha está vazia!");
        } else {
            System.out.print("Pilha: ");
            for (int i = 0; i <= topo; i++) {
                System.out.print(pilha[i] + " ");
            }
            System.out.println();
        }
    }
}
