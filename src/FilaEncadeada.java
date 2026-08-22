class No{
    int valor;
    No prox;
    No(int v) { valor = v; }
}

public class FilaEncadeada {
    private No inicio, fim;

    public void enqueue(int valor){
        No novo = new No(valor);
        if (fim != null) fim.prox = novo;
        fim = novo;
        if (inicio == null) inicio = novo;
    }

    public int dequeue(){
        if (inicio == null) throw new RuntimeException("Fila vazia");
        int valor = inicio.valor;
        inicio = inicio.prox;
        if (inicio == null) fim = null;
        return valor;
    }
}
