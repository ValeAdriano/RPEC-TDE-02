public class Lista {

    private int tamanhoMaximo;
    private int topo;
    private int base;
    private int[] lista;
    private int quantidade;
    private int position;

    public Lista(int tamanho) {
        this.tamanhoMaximo = tamanho;
        this.quantidade = 0;
        this.base = 0;
        this.topo = 0; // Fila começa vazia, então topo é igual a base
        this.lista = new int[tamanhoMaximo];
        this.position = position;
    }

    public void push(int elemento) {
        if (isFull()) {
        } else {
//            this.move();
            lista[topo] = elemento;
            topo = (topo + 1) % tamanhoMaximo;
            quantidade++;
            mostrarFila();
        }
    }

    public void push(int elemento, int position) {
        if (isFull()) {
            System.out.println("A fila está cheia. Não é possível adicionar o elemento.");
        } else {


//            Pilha pilha = new Pilha(tamanhoMaximo);
//            pilha.push(lista[position]);
            int aux1, aux2;
            aux1 = lista[position];
            lista[position] = elemento;
            for (int i = (position+1); i <= topo; i++) {
                aux2 = lista[i];
                lista[i] = aux1;
                aux1 = aux2;
            }
            quantidade++;
        }
    }

    public int pop() {
        if (isEmpty()) {
            return -1; // Indicando erro ao desenfileirar
        } else {
            int elemento = lista[base];
            lista[base] = 0;
            base = (base + 1) % tamanhoMaximo;
            --quantidade;
            return elemento;
        }
    }

//    public void move() {
//        if (this.topo == this.tamanhoMaximo){
//            System.out.println("circulando");
//            this.topo = 0;
//        }
////        this.topo = (this.topo + 1)% this.tamanhoMaximo;
//    }

    public boolean isEmpty() {
        if (this.topo == this.base) {
            return true;
        }
        return false;


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
        }
        return lista[base];

    }

    // Método para imprimir todos os elementos da fila
    public void mostrarFila() {
        if (isEmpty()) {
            System.out.println("A fila está vazia!");
        } else {
            System.out.print("Fila: ");
            // O loop deve percorrer a fila desde a base até a quantidade de elementos na fila
            for (int i = 0; i < quantidade; i++) {
                // Calcula o índice usando a base como referência e o tamanho máximo para lidar com a fila circular
                int index = (base + i) % tamanhoMaximo;
                System.out.print(lista[index] + " ");
            }
            System.out.println();
        }
    }

}