package tela.client.api;

import tela.client.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-09T06:32:32.317Z")
public class CallsApi {
  private ApiClient apiClient;

  public CallsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CallsApi(ApiClient apiClient) {
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
   * To allow developers call a SIP or phone number and then bridge to a service number.
   * @param xAuthToken authenticate token
   * @param callToNumber callee number(sip or phone)
   * @param appNumber bridge number(serve number binding with app)
   * @param tag just a tag
   * @return List<Object>
   */
  public List<Object> outCallGet (String xAuthToken, String callToNumber, String appNumber, String tag) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'xAuthToken' is set
     if (xAuthToken == null) {
        throw new ApiException(400, "Missing the required parameter 'xAuthToken' when calling outCallGet");
     }
     
     // verify the required parameter 'callToNumber' is set
     if (callToNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'callToNumber' when calling outCallGet");
     }
     
     // verify the required parameter 'appNumber' is set
     if (appNumber == null) {
        throw new ApiException(400, "Missing the required parameter 'appNumber' when calling outCallGet");
     }
     
     // verify the required parameter 'tag' is set
     if (tag == null) {
        throw new ApiException(400, "Missing the required parameter 'tag' when calling outCallGet");
     }
     
    // create path and map variables
    String path = "/out_call".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "call_to_number", callToNumber));
    
    queryParams.addAll(apiClient.parameterToPairs("", "app_number", appNumber));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tag", tag));
    

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
  
  /**
   * 
   * To allow developers record call sessions.
   * @param xAuthToken authenticate token
   * @param transcriptionID record uniqueness ID
   * @return List<Object>
   */
  public List<Object> recordSessionGet (String xAuthToken, String transcriptionID) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'xAuthToken' is set
     if (xAuthToken == null) {
        throw new ApiException(400, "Missing the required parameter 'xAuthToken' when calling recordSessionGet");
     }
     
     // verify the required parameter 'transcriptionID' is set
     if (transcriptionID == null) {
        throw new ApiException(400, "Missing the required parameter 'transcriptionID' when calling recordSessionGet");
     }
     
    // create path and map variables
    String path = "/record_session".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "transcriptionID", transcriptionID));
    

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
  
  /**
   * 
   * To allow developers stop recording call sessions.
   * @param xAuthToken authenticate token
   * @param transcriptionID record uniqueness ID
   * @return List<Object>
   */
  public List<Object> stopRecordSessionGet (String xAuthToken, String transcriptionID) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'xAuthToken' is set
     if (xAuthToken == null) {
        throw new ApiException(400, "Missing the required parameter 'xAuthToken' when calling stopRecordSessionGet");
     }
     
     // verify the required parameter 'transcriptionID' is set
     if (transcriptionID == null) {
        throw new ApiException(400, "Missing the required parameter 'transcriptionID' when calling stopRecordSessionGet");
     }
     
    // create path and map variables
    String path = "/stop_record_session".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "transcriptionID", transcriptionID));
    

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
