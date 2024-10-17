package br.com.conversorDeMoedas.modelos;
import com.google.gson.annotations.SerializedName;

public record DadosMoeda(
        @SerializedName("result")
        String result,
        @SerializedName("documentation")
        String documentation,
        @SerializedName("terms_of_use")
        String terms_of_use,
        @SerializedName("supported_codes")
        String[][] supported_codes) {
}
