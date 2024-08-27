class Node {

    Node previous;// Referencia para o nó anterior
    int data;     // Dado armazenado no nó
    Node next;    // Referência para o próximo nó

    // Construtor
    public Node(int data) {

        this.previous = null;
        this.data = data;
        this.next = null;
    }
}