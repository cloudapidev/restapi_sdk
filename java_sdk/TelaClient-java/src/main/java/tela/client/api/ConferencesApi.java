package tela.client.api;

import tela.client.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-09T06:32:32.317Z")
public class ConferencesApi {
  private ApiClient apiClient;

  public ConferencesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConferencesApi(ApiClient apiClient) {
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
   * To allow developers end a conference.
   * @param xAuthToken authenticate token
   * @param confId conference ID, return confSessionId after join conference success
   * @return List<Object>
   */
  public List<Object> confCloseGet (String xAuthToken, String confId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'xAuthToken' is set
     if (xAuthToken == null) {
        throw new ApiException(400, "Missing the required parameter 'xAuthToken' when calling confCloseGet");
     }
     
     // verify the required parameter 'confId' is set
     if (confId == null) {
        throw new ApiException(400, "Missing the required parameter 'confId' when calling confCloseGet");
     }
     
    // create path and map variables
    String path = "/conf_close".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "confId", confId));
    

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
   * To allow developers call a SIP or phone number and then bridge to a service number.
   * @param xAuthToken authenticate token
   * @param postBody all post data
   * @return List<Object>
   */
  public List<Object> confInvitePost (String xAuthToken, Object postBody) throws ApiException {
    //Object postBody = postBody;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'xAuthToken' is set
     if (xAuthToken == null) {
        throw new ApiException(400, "Missing the required parameter 'xAuthToken' when calling confInvitePost");
     }
     
     // verify the required parameter 'postBody' is set
     if (postBody == null) {
        throw new ApiException(400, "Missing the required parameter 'postBody' when calling confInvitePost");
     }
     
    // create path and map variables
    String path = "/conf_invite".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

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
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    

    
    
  }
  
  /**
   * 
   * To allow developers mute members in a conference.
   * @param xAuthToken authenticate token
   * @param confId conference ID, return confSessionId after join conference success
   * @param memberId conference member ID, return sessionId after join conference success
   * @return List<Object>
   */
  public List<Object> confMuteGet (String xAuthToken, String confId, String memberId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'xAuthToken' is set
     if (xAuthToken == null) {
        throw new ApiException(400, "Missing the required parameter 'xAuthToken' when calling confMuteGet");
     }
     
     // verify the required parameter 'confId' is set
     if (confId == null) {
        throw new ApiException(400, "Missing the required parameter 'confId' when calling confMuteGet");
     }
     
     // verify the required parameter 'memberId' is set
     if (memberId == null) {
        throw new ApiException(400, "Missing the required parameter 'memberId' when calling confMuteGet");
     }
     
    // create path and map variables
    String path = "/conf_mute".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "confId", confId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "memberId", memberId));
    

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
   * To allow developers play an audio file in a conference.
   * @param xAuthToken authenticate token
   * @param confId conference ID, return confSessionId after join conference success
   * @param fileUrl audio file path(on dialogic server)
   * @return List<Object>
   */
  public List<Object> confPlayGet (String xAuthToken, String confId, String fileUrl) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'xAuthToken' is set
     if (xAuthToken == null) {
        throw new ApiException(400, "Missing the required parameter 'xAuthToken' when calling confPlayGet");
     }
     
     // verify the required parameter 'confId' is set
     if (confId == null) {
        throw new ApiException(400, "Missing the required parameter 'confId' when calling confPlayGet");
     }
     
     // verify the required parameter 'fileUrl' is set
     if (fileUrl == null) {
        throw new ApiException(400, "Missing the required parameter 'fileUrl' when calling confPlayGet");
     }
     
    // create path and map variables
    String path = "/conf_play".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "confId", confId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "fileUrl", fileUrl));
    

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
   * To allow developers record a conference.
   * @param xAuthToken authenticate token
   * @param confId conference ID, return confSessionId after join conference success
   * @param saveUrl record save path
   * @param recordTime record time
   * @return List<Object>
   */
  public List<Object> confRecordGet (String xAuthToken, String confId, String saveUrl, Integer recordTime) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'xAuthToken' is set
     if (xAuthToken == null) {
        throw new ApiException(400, "Missing the required parameter 'xAuthToken' when calling confRecordGet");
     }
     
     // verify the required parameter 'confId' is set
     if (confId == null) {
        throw new ApiException(400, "Missing the required parameter 'confId' when calling confRecordGet");
     }
     
     // verify the required parameter 'saveUrl' is set
     if (saveUrl == null) {
        throw new ApiException(400, "Missing the required parameter 'saveUrl' when calling confRecordGet");
     }
     
     // verify the required parameter 'recordTime' is set
     if (recordTime == null) {
        throw new ApiException(400, "Missing the required parameter 'recordTime' when calling confRecordGet");
     }
     
    // create path and map variables
    String path = "/conf_record".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "confId", confId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "saveUrl", saveUrl));
    
    queryParams.addAll(apiClient.parameterToPairs("", "recordTime", recordTime));
    

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
   * To allow developers unmute members in a conference.
   * @param xAuthToken authenticate token
   * @param confId conference ID, return confSessionId after join conference success
   * @param memberId conference member ID, return sessionId after join conference success
   * @return List<Object>
   */
  public List<Object> confUnmuteGet (String xAuthToken, String confId, String memberId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'xAuthToken' is set
     if (xAuthToken == null) {
        throw new ApiException(400, "Missing the required parameter 'xAuthToken' when calling confUnmuteGet");
     }
     
     // verify the required parameter 'confId' is set
     if (confId == null) {
        throw new ApiException(400, "Missing the required parameter 'confId' when calling confUnmuteGet");
     }
     
     // verify the required parameter 'memberId' is set
     if (memberId == null) {
        throw new ApiException(400, "Missing the required parameter 'memberId' when calling confUnmuteGet");
     }
     
    // create path and map variables
    String path = "/conf_unmute".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "confId", confId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "memberId", memberId));
    

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
   * To allow developers remove members from a conference.
   * @param xAuthToken authenticate token
   * @param confId conference ID, return confSessionId after join conference success
   * @param memberId conference member ID, return sessionId after join conference success
   * @return List<Object>
   */
  public List<Object> kickPersonGet (String xAuthToken, String confId, String memberId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'xAuthToken' is set
     if (xAuthToken == null) {
        throw new ApiException(400, "Missing the required parameter 'xAuthToken' when calling kickPersonGet");
     }
     
     // verify the required parameter 'confId' is set
     if (confId == null) {
        throw new ApiException(400, "Missing the required parameter 'confId' when calling kickPersonGet");
     }
     
     // verify the required parameter 'memberId' is set
     if (memberId == null) {
        throw new ApiException(400, "Missing the required parameter 'memberId' when calling kickPersonGet");
     }
     
    // create path and map variables
    String path = "/kick_person".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "confId", confId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "memberId", memberId));
    

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
   * To allow developers count the number of conference members by App ID.
   * @param xAuthToken authenticate token
   * @param appId appId, create app&#39;s ID on portal(can find in conference ID, subtring of confId; for example confId 47ae7c80-ed2e-4bc@101,substring 47ae7c80-ed2e-4bc is appId)
   * @return List<Object>
   */
  public List<Object> queryConfGet (String xAuthToken, String appId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'xAuthToken' is set
     if (xAuthToken == null) {
        throw new ApiException(400, "Missing the required parameter 'xAuthToken' when calling queryConfGet");
     }
     
    // create path and map variables
    String path = "/query_conf".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "appId", appId));
    

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
   * To allow developers stop recording a conference.
   * @param xAuthToken authenticate token
   * @param dialogId conference record id, return after start record
   * @return List<Object>
   */
  public List<Object> stopConfRecordGet (String xAuthToken, String dialogId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'xAuthToken' is set
     if (xAuthToken == null) {
        throw new ApiException(400, "Missing the required parameter 'xAuthToken' when calling stopConfRecordGet");
     }
     
     // verify the required parameter 'dialogId' is set
     if (dialogId == null) {
        throw new ApiException(400, "Missing the required parameter 'dialogId' when calling stopConfRecordGet");
     }
     
    // create path and map variables
    String path = "/stop_conf_record".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "dialogId", dialogId));
    

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
