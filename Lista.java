public class Lista {

    private int tamanho;
    private Node topo;
    private Node base;
    private Node[] lista;
    private int quantidade;
    private int position;

    public Lista() {
        this.tamanho = 0;
        this.quantidade = 0;
        this.base = null;
        this.topo = null; // Fila começa vazia, então topo é igual a base
        this.lista = new Node[tamanho];
        this.position = position;
    }

    public void push(int data) {
        Node novoElemento = new Node(data);

        if (isEmpty()) {
            this.base = novoElemento;
            this.topo = novoElemento;
        } else {
            this.topo.next = novoElemento;
            novoElemento.previous = this.topo;
            this.topo = novoElemento;

        }
        tamanho++;
        quantidade++;
    }

//    public void push(int data, int position) {
//        if (position < 0 || position > quantidade) {
//            System.out.println("Posição inválida!");
//            return;
//        }
//
//        Node novoElemento = new Node(data);
//
//        if (position == 0) {
//            // Inserção no início da lista
//            novoElemento.next = this.base;
//            if (this.base != null) {
//                this.base.previous = novoElemento;
//            }
//            this.base = novoElemento;
//            if (quantidade == 0) {
//                this.topo = novoElemento;
//            }
//        } else if (position == quantidade) {
//            // Inserção no final da lista (mesmo que o método push(int data))
//            push(data);
//            return;
//        } else {
//            // Inserção no meio da lista
//            Node atual = this.base;
//            for (int i = 0; i < position - 1; i++) {
//                atual = atual.next;
//            }
//            novoElemento.next = atual.next;
//            novoElemento.previous = atual;
//            if (atual.next != null) {
//                atual.next.previous = novoElemento;
//            }
//            atual.next = novoElemento;
//        }
//
//        quantidade++;
//    }

    public int pop() {
        if (isEmpty()) {
            return -1; // Indicando erro ao desenfileirar
        } else {
            int data = this.base.data;
            if (this.base == this.topo) {
                this.base = null;
                this.topo = null;
            } else {
                this.base = this.base.next;
                this.base.previous = null;
            }
            quantidade--;
            return data;
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
        return tamanho == 0;


    }



    // Método para imprimir todos os elementos da fila
    public void mostrarFila() {
        if (isEmpty()) {
            System.out.println("A fila está vazia!");
        } else {
            System.out.print("Fila: ");
            // Percorre a fila desde a base até a quantidade de elementos na fila
            for (int i = 0; i < tamanho; i++) {
                // Calcula o índice usando a base como referência e o tamanho máximo para lidar com a fila circular
                int index = (this.topo.data + i) % this.tamanho;
                System.out.print(lista[index] + " ");
            }
            System.out.println();
        }
    }

}