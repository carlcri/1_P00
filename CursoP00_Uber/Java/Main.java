/*
Como obsrevamos en la clase Car no hay ningun metodo constructor, estamos usando el metodo cosntructor por defecto
Creamos un objeto en memoria de tipo Car. El motodo printDataCar() lo usamso para imprimir
*/ 

class Main {
    public static void main(String[] args) {
	    System.out.println("hola mundo");

        Car car = new Car();
        car.driver = "Marcos";
        car.passenger = 4;
        car.license = "AMX0041";

        car.printDataCar();
    }
}
