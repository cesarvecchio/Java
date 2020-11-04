public class App {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        System.out.println(String.format("Pilha está vazia: %b", pilha.isEmpty()));

        System.out.println(String.format("Pilha está cheia: %b", pilha.isFull()));

        pilha.exibe();

        System.out.println(pilha.peek());

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        pilha.exibe();

        System.out.println(String.format("Pilha está vazia: %b", pilha.isEmpty()));

        System.out.println(String.format("Pilha está cheia: %b", pilha.isFull()));

        System.out.println(String.format("Valor removido: %d", pilha.pop()));

        System.out.println(String.format("Valor removido: %d", pilha.pop()));

        pilha.push(1);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        pilha.push(5);

        System.out.println(String.format("Pilha está cheia: %b", pilha.isFull()));

        pilha.exibe();

        pilha.exibeReverso();

        System.out.println(pilha.peek());
    }
}
