<?php
require_once('car.php');
class UberBlack extends Car{
     public $typeCarAccepted;
     public $seatsMaterial;

     public function __constructor($license, $driver, $typeCarAccepted,$seatsMaterial){
          parent::__construc($license, $driver);
          $this->typeCarAccepted = $typeCarAccepted;
          $this->seatsMaterial = $seatsMaterial;
     }
}
?>