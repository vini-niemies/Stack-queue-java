public class FilaSimples {
    private int[] pedidos;
    private int inicio, fim, tamanho;
    public FilaSimples(int capacidade) {
        pedidos = new int[capacidade];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }
    public void enqueue(int valor) {
        if (tamanho == pedidos.length) {
            throw new RuntimeException("Fila cheia, não da pra atender mais pedidos agora");
        }
        pedidos[fim] = valor;
        fim++;
        tamanho++;
    }
    public int dequeue() {
        if (tamanho == 0) {
            throw new RuntimeException("Fila vazia, nenhum pedido pra atender");
        }
        int valor = pedidos[inicio];
        inicio++;
        tamanho--;
        return valor;
    }
    public void mostrar() {
        if (tamanho == 0) {
            System.out.println("Fila de resgate vazia.");
            return;
        }
        System.out.print("Fila de resgate: ");
        for (int i = inicio; i < fim; i++) {
            System.out.print(pedidos[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        FilaSimples fila = new FilaSimples(5);
        fila.enqueue(101);
        fila.enqueue(102);
        fila.enqueue(103);
        fila.mostrar();
        System.out.println("Atendendo pedido: " + fila.dequeue());
        fila.mostrar();
    }
}