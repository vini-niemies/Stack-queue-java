import java.util.Deque;
import java.util.ArrayDeque;
public class PilhaComDeque {
    private Deque<String> portais = new ArrayDeque<>();
    public void abrirPortal(String portal) {
        portais.addFirst(portal);
    }
    public String fecharPortal() {
        if (portais.isEmpty()) {
            throw new RuntimeException("Não tem nenhum portal aberto");
        }
        return portais.removeFirst();
    }
    public void mostrar() {
        System.out.println("Portais abertos (do mais novo pro mais antigo): " + portais);
    }
    public static void main(String[] args) {
        PilhaComDeque estranho = new PilhaComDeque();
        estranho.abrirPortal("Recife");
        estranho.abrirPortal("Curitiba");
        estranho.abrirPortal("União da Vitória");
        estranho.mostrar();
        System.out.println("Fechando o portal: " + estranho.fecharPortal());
        estranho.mostrar();
    }
}