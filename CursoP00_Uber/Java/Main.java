class Main {
    public static void main(String[] args) {
	    System.out.println("hola mundo");

        // Instanciando un objeto de clase Account, otro de clase UberX, UberPool, UberBlack, UberVan
        Account driver = new Account("Pepito Perez", "PeP-8");
        UberX uberX = new UberX("license", driver, "VW", "2020");
        UberPool uberPool = new UberPool("license1", new Account("name", "321263"), "Toyota", "2011");


        //Metodo para imprimir
        uberX.printDataCar();
        uberPool.printDataCar();

    }
}
