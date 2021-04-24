class Main {
     public static void main(String[] args) {
          UberX uberX = new UberX("HEL123", new Account("saul corona", "ADN2123"),"Chevrolet", "Sonic");
          uberX.setPassenger(4);
          uberX.printDataCar();

          UberVan uberVan = new UberVan("FACA23", new Account("Andres Herrera", "DDASD12"), null, null);
          uberVan.setPassenger(6);
          uberVan.printDataCar();

          // Car car2 = new Car("TER21", new Account("Anahi", "DSA312"));
          // car2.passengenger = 4;
          // car2.printDataCar();
     }
}