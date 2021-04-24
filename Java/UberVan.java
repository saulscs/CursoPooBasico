import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
   Map<String, Map<String, Integer>> typeCarAccepted;
   ArrayList<String>seatsMAterial;
   private Integer passengenger;

       public UberVan(String license, Account driver, 
       Map<String, Map<String, Integer>> typeCarAccepted,
       ArrayList<String>seatsMAterial){
          super(license,driver);
          this.typeCarAccepted = typeCarAccepted;
          this.seatsMAterial = seatsMAterial;
     }
     @Override
     public void setPassenger(Integer passengenger) {
        if(passengenger == 6 ){
               this.passengenger = passengenger;
          } else {
               System.out.println("Necesitas asignar 4 pasageros");
          }
     }
}
