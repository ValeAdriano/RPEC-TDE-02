public class Pilha {

    private static int tamanhoMaximo;
    private static int topo;
    private static int[] pilha;

    public Pilha (int tamanho) {
        this.tamanhoMaximo = tamanho;
        this.pilha = new int[tamanhoMaximo];
        this.topo = -1; // Pilha comeca vazia ent o topo e -1

    }

    public static void push(int elemento) {
        if (topo == tamanhoMaximo - 1) {
            System.out.println("Tá cheio já carai! ");
        } else {
            pilha[++topo] = elemento;
        }
    }

    public int pop() {
        if (topo == -1) {
            //Verifica se tem algm na pilha
            System.out.println("Tá vazia já carai! ");

        } else {
            return pilha[topo--];

        }
        return 0;
    }

//    public int invert(){
//
//    }

    public boolean isEmpty() {
        if (topo == -1) {
            System.out.println("A pilha tá vazia! ");

            return true;
        } else {
            System.out.println("A pilha não está vazia! ");

            return false;
        }


    }

    public boolean isFull() {
        if (topo == tamanhoMaximo) {
            System.out.println("A pilhas tá cheia! ");
            return true;
        } else {
            System.out.println("A pilha não está cheia! ");
            return false;
        }
    }
}
