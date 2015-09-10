<?php

require_once 'TelaClient-php/autoload.php';

$TOKEN = "j9t2t40ggcba4k444pog0eq8s7z29fs8l34i2mnqv0jh60zbs8lc4t741eo8ih89m2lb93axmlwhy81vkhwfzw83";
$APPNUMBER = "6531520072";
$DIALBUMBER = "tel:8615982880477";

$client = new \Tela\Client\ApiClient();
$client->callApi("/out_call", "GET", array('call_to_number'=>$DIALBUMBER,'app_number'=>$APPNUMBER,'tag'=>'dsafsadf'), "application/json", array('X-Auth-Token'=>$TOKEN), "application/json");
