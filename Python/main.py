from card import Car

if __name__ == "__main__":
     car = Car()
     car.license = "AMD3213"
     car.driver = "Andres herrera"
     print(vars(car))

     car2 = Car()
     car2.license = "dsad"
     car2.driver = "saul corona"
     print(vars(car2))