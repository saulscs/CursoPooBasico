public class Car {
     //Estas son variables locales
     private Integer id;
     private String license;
     private Account driver;
     private Integer passengenger;

     //CONTRUCTOR: parametros obligatorios para que se cree la clase Car
     public Car(String license, Account driver){ //Estos parametros estan de manera local.
          this.license = license;
          this.driver = driver;
          passengenger = 4;
     }

     void printDataCar(){
          System.out.println("Licence: " + license + " Driver: " + driver.name + "Passengers: " + passengenger);
     }

     public Integer getPassenger(){
          return passengenger;
     }

     public void setPassenger( Integer passengenger){
          if(passengenger == 4 ){
               this.passengenger = passengenger;
          } else {
               System.out.println("Necesitas asignar cuatro pasageros");
          }
          
     }

     public Integer getId() {
          return id;
     }

     public void setId(Integer id) {
          this.id = id;
     }

     public String getLicense() {
          return license;
     }

     public void setLicense(String license) {
          this.license = license;
     }

     public Account getDriver() {
          return driver;
     }

     public void setDriver(Account driver) {
          this.driver = driver;
     }
     
}
