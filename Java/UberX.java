class UberX extends Car {
     String brand;
     String model;

     public UberX(String license, Account driver, String brand, String model){
          super(license,driver); //Es como llamar al metodo constructor de la clase car. Hace referencia a los atributos y metodos de la superclase.
          this.brand = brand;    //this hace referencia a los atributos de la clase hija o en la que estamos ubicados.
          this.model = model;
          
     }

     @Override
     void printDataCar() {
           System.out.println("Modelo:" + model + " Marca: " + brand);
     }
}
