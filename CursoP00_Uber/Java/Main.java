class Main {
    public static void main(String[] args) {
	    System.out.println("hola mundo");

        // Instanciando un objeto de clase Account, y otro de clase Car
        Account driver = new Account("Pepito Perez", "PeP-8");
        Car car = new Car("AK-47", driver);
        car.passenger = 4;

        //Metodo para imprimir
        car.printDataCar();
    }
}
