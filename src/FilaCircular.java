public class FilaCircular {
    private int[] pedidos;
    private int inicio, fim, tamanho;

    public FilaCircular(int capacidade){
        pedidos = new int[capacidade];
        inicio = fim = tamanho = 0;
    }

    public void enqueue(int valor){
        if (tamanho == pedidos.length) throw new RuntimeException("Fila cheia!");
        pedidos[fim] = valor;
        fim = (fim + 1) % pedidos.length;
        tamanho++;
    }

    public int dequeue(){
        if (tamanho == 0) throw new RuntimeException("Fila vazia");
        int valor = pedidos[inicio];
        inicio = (inicio + 1) % pedidos.length;
        tamanho--;
        return valor;
    }
}
