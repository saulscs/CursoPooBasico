import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
   Map<String, Map<String, Integer>> typeCarAccepted;
   ArrayList<String>seatsMAterial;

       public UberVan(String license, Account driver, 
       Map<String, Map<String, Integer>> typeCarAccepted,
       ArrayList<String>seatsMAterial){
          super(license,driver);
          this.typeCarAccepted = typeCarAccepted;
          this.seatsMAterial = seatsMAterial;
     }
}
