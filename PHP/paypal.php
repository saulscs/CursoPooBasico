<?php
     require_once('payment.php');
     class Paypal extends Payment{
          public $email;

          public function __constructor($id,$email){
               parent::__constructor($id);
               $this->$email = $email;
          }
     }
?>