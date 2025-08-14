import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class ConsultaMonedaApi {
    private final String BASE_URL = "https://v6.exchangerate-api.com/v6/";
    private final String API_KEY = "7c983c201b7d93a6cd1e64fc";

    // Consumo de la API y Análisis JSON
    public Map<String, Double> obtenerTasasConversion() {
        URI direccion = URI.create(BASE_URL + API_KEY + "/latest/USD");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Moneda datos = new Gson().fromJson(response.body(), Moneda.class);
            return datos.conversion_rates();
        } catch (Exception e) {
            System.out.println("Error en la solicitud a la API: " + e.getMessage());
            return null;
        }
    }
}
