<?php
require '../vendor/autoload.php';
//$uri=$_SERVER['PHP_SELF'];
$uri = "http//localhost/practica6/servidorSoap";
$parametros = ['uri' => $uri];
try {
    $server = new SoapServer(NULL, $parametros);
    $server->setClass('Clases\Operaciones');
    $server->handle();
} catch (SoapFault $f) {
    die("error en server: " . $f->getMessage());
}
