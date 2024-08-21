public class Main {

    public static void main(String[] args) {
        Lista lista = new Lista(5);


        // Adicionando elementos na fila
        lista.push(1);
        lista.push(2);
        lista.push(3);
        lista.push(4);

        lista.mostrarFila();

        lista.push(777, 2);

        lista.mostrarFila();



    }
}