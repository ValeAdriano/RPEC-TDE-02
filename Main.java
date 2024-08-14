public class Main {

    public static void main(String[] args) {
        Fila fila = new Fila(5);

        // Testando isEmpty() em uma fila vazia
        System.out.println("A fila está vazia? " + fila.isEmpty());

        // Adicionando elementos na fila
        fila.push(1);
        fila.push(2);
        fila.push(3);
        fila.push(4);

        System.out.println("Fila após adicionar elementos:");
        fila.mostrarFila();


        System.out.println("A fila está vazia? " + fila.isEmpty());


        System.out.println("Fila após adicionar elementos:");
        fila.mostrarFila();


        System.out.println("A fila está cheia? " + fila.isFull());


        fila.push(5);


        System.out.println("A fila está cheia? " + fila.isFull());


        System.out.println("Fila após encher:");
        fila.mostrarFila();


        int removido = fila.pop();
        System.out.println("Elemento removido: " + removido);


        System.out.println("Fila após remover um elemento:");
        fila.mostrarFila();


        System.out.println("Elemento na frente da fila: " + fila.topo());


        while (!fila.isEmpty()) {
            System.out.println("Elemento removido: " + fila.pop());
        }

        System.out.println("Fila após remover todos os elementos:");
        fila.mostrarFila();


        System.out.println("Tentando remover de uma fila vazia: " + fila.pop());

        System.out.println("Tentando acessar o topo de uma fila vazia: " + fila.topo());
    }
}