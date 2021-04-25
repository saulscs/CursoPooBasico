<?php
require_once('car.php');
require('uberX.php');
require('uberPool.php');
require('uberVan.php');
require_once('account.php');

$uberX = new UberX("CVB23", new Account("Andres herrera", "AND321"), "Mazda", "XY");
$uberX->printDataCar();

$uberPool = new UberPool("ASD23", new Account("Anahi", "DASD23"), "Tesla", "X");
$uberPool->printDataCar();

$uberVan = new UberVan("OJL395", new Account("Raúl Ramírez", "AND456"), "Nissan", "Versa");
$uberVan->setPassenger(6);
$uberVan->printDataCar();

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Spark");
$uberX->setPassenger(4);
$uberX->printDataCar();
?>