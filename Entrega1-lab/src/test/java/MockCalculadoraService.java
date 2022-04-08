
public class MockCalculadoraService implements CalculadoraService{

    @Override
    public String busca(int id){
        if (id == 10){
            return Operacoes.multiplica;
        }
        else return Operacoes.erro;
    }
}
