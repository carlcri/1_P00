class UberX extends Car {
    //atributos propios de la clase Uberx
    String brand;
    String model;

    /*Metodo constructor que debe coincidir con el de la clase padre, mas los atributos propios de la clase
    UberX*/
    public UberX(String license, Account driver, String brand, String model){
        /* con palabra reservada super, nos referimos al metodo constructor de la clase padre, en este caso la 
           clase Car*/
        super(license, driver);
        this.brand = brand;
        this.model = model;
    } 
    
}
