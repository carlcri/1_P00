from account import Account
from car import Car

if __name__ == "__main__":
    car = Car("45436532", Account("pepito", "787584554"))
    print(vars(car))
    print(vars(car.driver))

    car.print_car()
