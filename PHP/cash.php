<?php
     require_once('payment.php');

     class Cash extends Payment {
          public function __constructor($id){
               parent::__constructor($id);
          }
     }
?>