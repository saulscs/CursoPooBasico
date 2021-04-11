class Main {
     public static void main(String[] args) {
          Car car = new Car("HEL123", new Account("saul corona", "ADN2123"));
          car.passengenger = 4;
          car.printDataCar();

          Car car2 = new Car("TER21", new Account("Anahi", "DSA312"));
          car2.passengenger = 4;
          car2.printDataCar();
     }
}