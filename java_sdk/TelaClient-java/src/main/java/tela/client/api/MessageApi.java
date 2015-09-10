package tela.client.api;

import tela.client.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-09T06:32:32.317Z")
public class MessageApi {
  private ApiClient apiClient;

  public MessageApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MessageApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * 
   * To allow developers send SMS.
   * @param xAuthToken authenticate token
   * @param sendToNumber taget phone number
   * @param fromNumber from phone number
   * @param usersmscontent message content
   * @return List<Object>
   */
  public List<Object> smsSendGet (String xAuthToken, String sendToNumber, String fromNumber, String usersmscontent) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'xAuthToken' is set
     if (xAuthToken == null) {
        throw new ApiException(400, "Missing the required parameter 'xAuthToken' when calling smsSendGet");
     }
     
     // verify the required parameter 'sendToNumber' is set
     if (sendToNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'sendToNumber' when calling smsSendGet");
     }
     
     // verify the required parameter 'fromNumber' is set
     if (fromNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'fromNumber' when calling smsSendGet");
     }
     
     // verify the required parameter 'usersmscontent' is set
     if (usersmscontent == null) {
        throw new ApiException(400, "Missing the required parameter 'usersmscontent' when calling smsSendGet");
     }
     
    // create path and map variables
    String path = "/sms_send".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "send_to_number", sendToNumber));
    
    queryParams.addAll(apiClient.parameterToPairs("", "from_number", fromNumber));
    
    queryParams.addAll(apiClient.parameterToPairs("", "usersmscontent", usersmscontent));
    

    if (xAuthToken != null)
    headerParams.put("X-Auth-Token", apiClient.parameterToString(xAuthToken));
    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };
    
    

    

    
    
    TypeRef returnType = new TypeRef<List<Object>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    

    
    
  }
  
}
