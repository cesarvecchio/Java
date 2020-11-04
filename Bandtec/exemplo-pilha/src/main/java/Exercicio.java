public class Exercicio {
    public static boolean ehPalindromo(int[] vetor) {
        Pilha pilha = new Pilha(vetor.length);

        for (int v : vetor) {
            pilha.push(v);
        }

        for (int v : vetor) {
            if(pilha.pop() != v) {
                return false;
            }
        }

        return true;
    }

    public static Pilha converterParaBinario(int numero) {
        String numeroBinario = new String();

        while(numero > 0) {
            if(numero%2 == 0) {
                numeroBinario = numeroBinario.concat("0");
                numero = numero / 2;

            } else {
                numeroBinario = numeroBinario.concat("1");
                numero = numero / 2;
            }
        }

        Pilha pilha = new Pilha(numeroBinario.length());

        for(char a : numeroBinario.toCharArray()) {
            pilha.push(Integer.parseInt(String.valueOf(a)));
        }
        return pilha;
    }

    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 1 };

        System.out.println(ehPalindromo(vetor));

        converterParaBinario(9).exibeReverso();
        converterParaBinario(12).exibeReverso();
        converterParaBinario(32).exibeReverso();
    }
}
