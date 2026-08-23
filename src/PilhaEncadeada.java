class NoAndar {
    int andar;
    NoAndar prox;
    NoAndar(int andar) {
        this.andar = andar;
    }
}
public class PilhaEncadeada {
    private NoAndar topo;
    public void push(int andar) {
        NoAndar novo = new NoAndar(andar);
        novo.prox = topo;
        topo = novo;
    }
    public int pop() {
        if (topo == null) {
            throw new RuntimeException("O Homem-Aranha ja esta no chão");
        }
        int andar = topo.andar;
        topo = topo.prox;
        return andar;
    }
    public boolean vazia() {
        return topo == null;
    }
    public void mostrar() {
        if (topo == null) {
            System.out.println("Homem-Aranha esta no chao.");
            return;
        }
        System.out.print("Andares subidos (do topo pro chao): ");
        NoAndar atual = topo;
        while (atual != null) {
            System.out.print(atual.andar + " ");
            atual = atual.prox;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PilhaEncadeada aranha = new PilhaEncadeada();
        aranha.push(1);
        aranha.push(2);
        aranha.push(3);
        aranha.mostrar();
        while (!aranha.vazia()) {
            System.out.println("Descendo do andar: " + aranha.pop());
        }
    }
}