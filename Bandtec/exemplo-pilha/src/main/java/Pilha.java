import java.util.Arrays;

public class Pilha {
    private int topo;
    private int[] pilha;

    public Pilha(Integer tamanhoPilha) {
        topo = -1;
        pilha = new int[tamanhoPilha];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == (pilha.length - 1);
    }

    public void push(int info) {
        if(!isFull()) {
            pilha[++topo] = info;

        } else {
            System.out.println("A pilha está cheia!");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return pilha[topo--];
        }

        return -1;
    }

    public int peek() {

        if(!isEmpty()) {
            return pilha[topo];
        }

        return -1;
    }

    public void exibe() {
        StringBuilder mensagem;

        if(isEmpty()) {
            mensagem = new StringBuilder("A pilha está vazia!");

        } else {
            mensagem = new StringBuilder("Pilha { ");

            for (int i = 0; i <= topo; i++) {
                if(i == topo) {
                    mensagem.append(String.format("%d ", pilha[i]));

                } else {
                    mensagem.append(String.format("%d, ", pilha[i]));

                }
            }

            mensagem.append("}");
        }

        System.out.println(mensagem);
    }

    public void exibeReverso() {
        StringBuilder mensagem;

        if(isEmpty()) {
            mensagem = new StringBuilder("A pilha está vazia!");

        } else {
            mensagem = new StringBuilder("Pilha { ");

            for (int i = topo; i >= 0; i--) {
                if(i == 0) {
                    mensagem.append(String.format("%d ", pilha[i]));

                } else {
                    mensagem.append(String.format("%d, ", pilha[i]));

                }
            }

            mensagem.append("}");
        }

        System.out.println(mensagem);
    }
}
