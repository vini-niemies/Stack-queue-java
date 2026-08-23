public class PilhaSimples {
    private int[] ataques;
    private int topo;
    public PilhaSimples(int capacidade) {
        ataques = new int[capacidade];
        topo = 0;
    }
    public void push(int ataque) {
        if (topo == ataques.length) {
            throw new RuntimeException("Escudo nao aguenta bloquear mais ataques");
        }
        ataques[topo] = ataque;
        topo++;
    }
    public int pop() {
        if (topo == 0) {
            throw new RuntimeException("Não tem nenhum ataque bloqueado pra contra-atacar");
        }
        topo--;
        return ataques[topo];
    }
    public int topo() {
        if (topo == 0) {
            throw new RuntimeException("Pilha vazia");
        }
        return ataques[topo - 1];
    }
    public void mostrar() {
        System.out.print("Ataques bloqueados (do começo pro final): ");
        for (int i = topo - 1; i >= 0; i--) {
            System.out.print(ataques[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PilhaSimples cap = new PilhaSimples(5);
        cap.push(10);
        cap.push(20);
        cap.push(30);
        cap.mostrar();
        System.out.println("Contra-atacando com o bloqueio: " + cap.pop());
        cap.mostrar();
    }
}