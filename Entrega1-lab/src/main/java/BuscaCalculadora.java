import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaCalculadora {

    CalculadoraService calculadoraService;

    public BuscaCalculadora(CalculadoraService service){
        this.calculadoraService = service;
    }

    public Calculadora buscaCalculadora(int id){
        // id = 10 -> buscando um calculadora de ID 10
        //CalculadoraJson é uma string que retornou do serviço
        String calculadoraJson = calculadoraService.busca(id);

        //jsonObject é um objeto JSON feito a partir da string de retonro
        JsonObject jsonObject = JsonParser.parseString(calculadoraJson).getAsJsonObject();

        return new Calculadora(jsonObject.get("operacao").getAsString());
    }


}
