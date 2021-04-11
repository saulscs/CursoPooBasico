from car import Car
from account import Account

if __name__ == "__main__":
     car = Car("AMD213", Account("Andres herrera", "AND133"))
     print(vars(car))
     print(vars(car.driver))