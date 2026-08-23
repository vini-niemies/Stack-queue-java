class NoHeroi {
    String nome;
    NoHeroi prox;
    NoHeroi(String nome) {
        this.nome = nome;
    }
}
public class FilaEncadeada {
    private NoHeroi inicio, fim;
    public void enqueue(String nomeHeroi) {
        NoHeroi novo = new NoHeroi(nomeHeroi);
        if (fim != null) {
            fim.prox = novo;
        }
        fim = novo;
        if (inicio == null) {
            inicio = novo;
        }
    }
    public String dequeue() {
        if (inicio == null) {
            throw new RuntimeException("Ninguem na fila pra falar com o Superman");
        }
        String nome = inicio.nome;
        inicio = inicio.prox;
        if (inicio == null) {
            fim = null;
        }
        return nome;
    }
    public void mostrar() {
        if (inicio == null) {
            System.out.println("Fila da Sala da Justica esta vazia.");
            return;
        }
        System.out.print("Herois esperando: ");
        NoHeroi atual = inicio;
        while (atual != null) {
            System.out.print(atual.nome + " ");
            atual = atual.prox;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        FilaEncadeada fila = new FilaEncadeada();
        fila.enqueue("Flash");
        fila.enqueue("Batman");
        fila.enqueue("Mulher Maravilha");
        fila.mostrar();
        System.out.println("Superman esta falando com: " + fila.dequeue());
        fila.mostrar();
    }
}