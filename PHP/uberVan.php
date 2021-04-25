<?php
require_once('car.php');
class UberVan extends Car{
     public $typeCarAccepted;
     public $seatsMaterial;
     protected $passenger;

     public function __constructor($license, $driver, $typeCarAccepted,$seatsMaterial){
          parent::__construc($license, $driver);
          $this->typeCarAccepted = $typeCarAccepted;
          $this->seatsMaterial = $seatsMaterial;
     }

     public function setPassenger($passenger){
          if($passenger == 6){
               $this->passenger = $passenger;
          }  else{
               echo "Necesitamos asignar 6 pasajeros";
          }
     }
}

?>