import java.util.Deque;
import java.util.LinkedList;
public class ArenaVingadores {
    private Deque<String> arena = new LinkedList<>();
    public void entrarPelaEsquerda(String heroi) {
        arena.addFirst(heroi);
    }
    public void entrarPelaDireita(String heroi) {
        arena.addLast(heroi);
    }
    public String sairPelaEsquerda() {
        if (arena.isEmpty()) {
            throw new RuntimeException("Arena vazia");
        }
        return arena.removeFirst();
    }
    public String sairPelaDireita() {
        if (arena.isEmpty()) {
            throw new RuntimeException("Arena vazia");
        }
        return arena.removeLast();
    }
    public void mostrar() {
        System.out.println("Heróis na arena: " + arena);
    }
    public static void main(String[] args) {
        ArenaVingadores arena = new ArenaVingadores();
        arena.entrarPelaEsquerda("Thor");
        arena.entrarPelaEsquerda("Hulk");
        arena.entrarPelaDireita("Viuva Negra");
        arena.mostrar();
        System.out.println("Saiu pela esquerda: " + arena.sairPelaEsquerda());
        System.out.println("Saiu pela direita: " + arena.sairPelaDireita());
        arena.mostrar();
    }
}