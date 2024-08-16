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
        fila.push(5);

        System.out.println("Fila após adicionar elementos:");
        fila.mostrarFila();

        fila.pop();

        fila.push(5);
        fila.pop();
        fila.mostrarFila();
        fila.push(5);
        fila.pop();
        fila.mostrarFila();
        fila.push(5);
        fila.pop();
        fila.mostrarFila();
        fila.push(5);

        System.out.println("Fila após adicionar elementos:");
        fila.mostrarFila();

        System.out.println("A fila está vazia? " + fila.isEmpty());
        System.out.println("A fila está cheia? " + fila.isFull());



    }
}