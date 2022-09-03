class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    //Metodo Constructor
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver; 
    }

    void printDataCar() {
        System.out.println("Car plates: " + license + ", name: " + driver.name + ", document: "+ driver.document);
    }
}
