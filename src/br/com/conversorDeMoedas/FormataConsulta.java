package br.com.conversorDeMoedas;

import br.com.conversorDeMoedas.modelos.DadosMoeda;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FormataConsulta {

    protected Gson gson ;

     public FormataConsulta(){
        gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();
    }

    public <T> T consultaToJson(String json, Class<T> classeRecord) {
        var dadosMoeda = gson.fromJson(json,  classeRecord);
        return (T) dadosMoeda;
    }
}
