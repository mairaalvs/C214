
public class MockCalculadoraService implements CalculadoraService{

    @Override
    public int numero(int numero1, int numero2){
        return Operacoes.multiplica;
    }
}
