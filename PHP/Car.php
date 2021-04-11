<?php

class Car{
     public $id;
     public $license;
     public $driver;
     public $passengenger;

     public function __constructor($license,$driver){
          $this->license = $license;
          $this->driver = $driver;
     }

     public function printDataCar(){
          echo "License: $this->license, Conductor:{$this->driver->name},document: {$this->driver->document}";
     }
}

?>