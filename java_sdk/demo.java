import tela.client.ApiException;
import tela.client.api.CallsApi;

/**
 * Created by Administrator on 2015/9/10.
 */
public class demo {
    public static void main(String[] args) {
        final String TOKEN = "j9t2t40ggcba4k444pog0eq8s7z29fs8l34i2mnqv0jh60zbs8lc4t741eo8ih89m2lb93axmlwhy81vkhwfzw83";
        final String APPNUMBER = "6531520072";
        final String DIALBUMBER = "tel:8615982880477";

        CallsApi Calls = new CallsApi();
        try {
            Calls.outCallGet(TOKEN, DIALBUMBER, APPNUMBER, "dsafsadf");
        } catch (ApiException e) {
            System.out.println(e.getMessage());
            return;
        }
    }
}
