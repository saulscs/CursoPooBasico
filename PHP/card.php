<?php
require_once('payment.php');

class Card extends Payment{
     public $numberCard;
     public $dateCard;
     public $cvv;

     public function __constructor($id,$numberCard,$dateCard,$cvv){
          parent::__constructor($id);
          $this->numberCard = $numberCard;
          $this->dateCard = $dateCard;
          $this->cvv = $cvv;
     }
}


?>