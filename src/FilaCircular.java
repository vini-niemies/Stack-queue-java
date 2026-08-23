public class FilaCircular {
    private int[] pedidos;
    private int inicio, fim, tamanho;
    public FilaCircular(int capacidade) {
        pedidos = new int[capacidade];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }
    public void enqueue(int valor) {
        if (tamanho == pedidos.length) {
            throw new RuntimeException("Projetor cheio! Batman precisa atender algum sinal antes.");
        }
        pedidos[fim] = valor;
        fim = (fim + 1) % pedidos.length;
        tamanho++;
    }
    public int dequeue() {
        if (tamanho == 0) {
            throw new RuntimeException("Nenhum Bat-Sinal ativo no momento");
        }
        int valor = pedidos[inicio];
        inicio = (inicio + 1) % pedidos.length;
        tamanho--;
        return valor;
    }
    public void mostrar() {
        if (tamanho == 0) {
            System.out.println("Nenhum sinal ativo.");
            return;
        }
        System.out.print("Sinais ativos: ");
        int idx = inicio;
        for (int i = 0; i < tamanho; i++) {
            System.out.print(pedidos[idx] + " ");
            idx = (idx + 1) % pedidos.length;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        FilaCircular gotham = new FilaCircular(3);
        gotham.enqueue(1);
        gotham.enqueue(2);
        gotham.enqueue(3);
        gotham.mostrar();
        System.out.println("Batman atendeu o sinal: " + gotham.dequeue());
        gotham.enqueue(4);
        gotham.mostrar();
    }
}