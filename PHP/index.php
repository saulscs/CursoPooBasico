<?php

require_once('Car.php');
require_once('Account.php');

$car = new Car("AWS123", new Account("Saul Corona", "AMD4213"));

$car->printDataCar();

?>