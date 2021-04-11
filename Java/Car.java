public class Car {
     //Estas son variables locales
     Integer id;
     String license;
     Account driver;
     Integer passengenger;

     //CONTRUCTOR: parametros obligatorios para que se cree la clase Car
     public Car(String license, Account driver){ //Estos parametros estan de manera local.
          this.license = license;
          this.driver = driver;
     }

     void printDataCar(){
          System.out.println("Licence: " + license + " Driver: " + driver.name);
     }
}
