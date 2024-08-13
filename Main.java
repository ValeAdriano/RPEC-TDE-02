public class Main {

    public static void main(String[] args) {
        Fila fila = new Fila(5);

        // Adicionando elementos na pilha
        fila.push(1);
        fila.push(2);
        fila.push(3);
        fila.push(4);
        fila.push(5);

        // Mostrando a pilha antes de remover um elemento
        System.out.println("Pilha antes de remover um elemento:");
        fila.mostrarPilha();

        // Removendo um elemento do topo da pilha
        int removido = fila.pop();
        System.out.println("Elemento removido: " + removido);

        // Mostrando a pilha após remover um elemento
        System.out.println("Pilha após remover um elemento:");
        fila.mostrarPilha();
    }
}