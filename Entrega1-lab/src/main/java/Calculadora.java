public class Calculadora {

    public int soma(int i, int j) {
        return i + j;
    }

    public int subtrair(int i, int j) {
        return i-j;
    }

    public int multiplicacao(int i, int j) {
        return i*j;
    }

    public int divisao(int i, int j) {
        if(j==0)
            throw new IllegalArgumentException("Divisão por zero");
        return i/j;
    }
}
