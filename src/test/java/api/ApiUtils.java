package api;

import io.restassured.response.Response;
import org.json.JSONObject;
import utils.LogUtils;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ApiUtils extends LogUtils {

    protected static Response response;
    protected static JSONObject body;
    protected static String uri;
    protected static Map<String, String> headers = new HashMap<>();
    protected static Map<String, String> params = new HashMap<>();
    protected static String token;

    public void log(String verbo) {
        super.logInfo("********* Dados enviados no request ********");
        super.logInfo(verbo + " "+ uri);
        super.logInfo("Body : \n"+ body);
        super.logInfo("Headers : "+ headers);
        super.logInfo("Params : "+ params);

        super.logInfo("******** Dados Recebidos no response ********");
        super.logInfo("Status code : " + response.statusCode());
        super.logInfo("Payload Recebido: \n"+ response.asPrettyString());
        super.logInfo("Tempo de Resposta: "+ response.timeIn(TimeUnit.MILLISECONDS));
    }
}
