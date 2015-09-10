<?php
/**
 * MessageApi
 * PHP version 5
 *
 * @category Class
 * @package  Tela\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */
/**
 *  Copyright 2015 SmartBear Software
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program. 
 * https://github.com/swagger-api/swagger-codegen 
 * Do not edit the class manually.
 */

namespace Tela\Client\Api;

use \Tela\Client\Configuration;
use \Tela\Client\ApiClient;
use \Tela\Client\ApiException;
use \Tela\Client\ObjectSerializer;

/**
 * MessageApi Class Doc Comment
 *
 * @category Class
 * @package  Tela\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class MessageApi
{

    /**
     * API Client
     * @var \Tela\Client\ApiClient instance of the ApiClient
     */
    protected $apiClient;
  
    /**
     * Constructor
     * @param \Tela\Client\ApiClient|null $apiClient The api client to use
     */
    function __construct($apiClient = null)
    {
        if ($apiClient == null) {
            $apiClient = new ApiClient();
            $apiClient->getConfig()->setHost('http://27.111.216.231:8000/v1/token_fire');
        }
  
        $this->apiClient = $apiClient;
    }
  
    /**
     * Get API client
     * @return \Tela\Client\ApiClient get the API client
     */
    public function getApiClient()
    {
        return $this->apiClient;
    }
  
    /**
     * Set the API client
     * @param \Tela\Client\ApiClient $apiClient set the API client
     * @return MessageApi
     */
    public function setApiClient(ApiClient $apiClient)
    {
        $this->apiClient = $apiClient;
        return $this;
    }
  
    
    /**
     * smsSendGet
     *
     * 
     *
     * @param string $x_auth_token authenticate token (required)
     * @param string $send_to_number taget phone number (required)
     * @param string $from_number from phone number (required)
     * @param string $usersmscontent message content (required)
     * @return object[]
     * @throws \Tela\Client\ApiException on non-2xx response
     */
    public function smsSendGet($x_auth_token, $send_to_number, $from_number, $usersmscontent)
    {
        
        // verify the required parameter 'x_auth_token' is set
        if ($x_auth_token === null) {
            throw new \InvalidArgumentException('Missing the required parameter $x_auth_token when calling smsSendGet');
        }
        // verify the required parameter 'send_to_number' is set
        if ($send_to_number === null) {
            throw new \InvalidArgumentException('Missing the required parameter $send_to_number when calling smsSendGet');
        }
        // verify the required parameter 'from_number' is set
        if ($from_number === null) {
            throw new \InvalidArgumentException('Missing the required parameter $from_number when calling smsSendGet');
        }
        // verify the required parameter 'usersmscontent' is set
        if ($usersmscontent === null) {
            throw new \InvalidArgumentException('Missing the required parameter $usersmscontent when calling smsSendGet');
        }
  
        // parse inputs
        $resourcePath = "/sms_send";
        $resourcePath = str_replace("{format}", "json", $resourcePath);
        $method = "GET";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = ApiClient::selectHeaderAccept(array());
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = ApiClient::selectHeaderContentType(array());
  
        // query params
        if ($send_to_number !== null) {
            $queryParams['send_to_number'] = $this->apiClient->getSerializer()->toQueryValue($send_to_number);
        }// query params
        if ($from_number !== null) {
            $queryParams['from_number'] = $this->apiClient->getSerializer()->toQueryValue($from_number);
        }// query params
        if ($usersmscontent !== null) {
            $queryParams['usersmscontent'] = $this->apiClient->getSerializer()->toQueryValue($usersmscontent);
        }
        // header params
        if ($x_auth_token !== null) {
            $headerParams['X-Auth-Token'] = $this->apiClient->getSerializer()->toHeaderValue($x_auth_token);
        }
        
        
        
  
        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } else if (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
        
        // make the API Call
        try
        {
            list($response, $httpHeader) = $this->apiClient->callApi(
                $resourcePath, $method,
                $queryParams, $httpBody,
                $headerParams, 'object[]'
            );
        } catch (ApiException $e) {
            switch ($e->getCode()) { 
            case 200:
                $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), 'object[]', $httpHeader);
                $e->setResponseObject($data);
                break;
            }
  
            throw $e;
        }
        
        if (!$response) {
            return null;
        }
  
        return $this->apiClient->getSerializer()->deserialize($response, 'object[]');
        
    }
    
}