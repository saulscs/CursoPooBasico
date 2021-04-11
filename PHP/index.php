<?php
require_once('car.php');
require('uberX.php');
require('uberPool.php');
require_once('account.php');

$uberX = new UberX("CVB23", new Account("Andres herrera", "AND321"), "Mazda", "XY");
$uberX->printDataCar();

$uberPool = new UberPool("ASD23", new Account("Anahi", "DASD23"), "Tesla", "X");
$uberPool->printDataCar();
?>