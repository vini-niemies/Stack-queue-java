public class FilaSimples {
    private int[] pedidos;
    private int inicio, fim, tamanho;

    public FilaSimples(int capacidade){
        pedidos = new int[capacidade];
        inicio = fim = tamanho = 0;
    }

    public void enqueue(int valor){
        if (tamanho == pedidos.length) throw new RuntimeException("Fila cheia");

        if (fim == pedidos.length){
            fim = 0;
        }

        pedidos[fim++] = valor;
        tamanho++;
    }

    public int dequeue(){
        if (tamanho == 0) throw new RuntimeException("Fila vazia");
        int valor = pedidos[inicio++];
        tamanho--;

        if (inicio == pedidos.length){
            inicio = 0;
        }

        return valor;
    }
}
