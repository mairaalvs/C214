import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteCalculadora {
    CalculadoraService service;
    Operacoes buscaOperacoes;

    private Calculadora calculadora;

    @Before
    public void setUp(){
        service = new MockCalculadoraService();
        buscaOperacoes = new Operacoes(service);
        calculadora = new Calculadora("soma");

    }

    @Test
    public void testeSoma(){
        int resultado = calculadora.soma(4,5);
        assertEquals(9, resultado);
    }

    @Test
    public void testeSubtracao(){
        int resultado = calculadora.subtrair(5,4);
        assertEquals(1, resultado);
    }

    @Test
    public void testeMultiplicacao(){
        int resultado = calculadora.multiplicacao(4,5);
        assertEquals(20, resultado);
    }

    @Test
    public void testeDivisao(){
        int resultado = calculadora.divisao(4,2);
        assertEquals(2, resultado);
    }

    @Test
    public void testeMultiplicacaoMock(){

    }



}
