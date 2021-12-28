from car import Car

if __name__ == "__main__":
    print('hello py')
    car = Car()
    car.driver = "Marcos"
    car.passenger = 4
    car.license = "AMX0041"

    print(vars(car))

