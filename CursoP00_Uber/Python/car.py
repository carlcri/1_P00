from account import Account

class Car:
    def __init__(self, license, driver):
        self.license = license
        self.driver = driver
        id = None
        passenger = None

    def print_car(self):
        print(self.license, self.driver.name, self.driver.document)

    