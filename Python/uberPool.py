from car import Car

class UberPool(Car):
     brand = str
     model = str

     def __init_(self,license,driver,brand,model):
          super.__init__(license,driver)
          self.brand = brand
          self.model = model