from account import Account
from car import Car

if __name__ == "__main__":

    # Puedes observar dos formas para instanciar, con una linea de codigo o con dos
    driver = Account("Perico", "843673421832")
    car = Car("4363245137", driver)

    car_1 = Car("4313345", Account("Alonso", "6783468732"))
    
    print(vars(car))
    print(vars(car.driver))

    print(vars(car_1))
    print(vars(car_1.driver))
   
    
