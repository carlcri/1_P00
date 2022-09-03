import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    //atributos propios de la clase Uberx
    Map<String, ArrayList<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    /*Metodo constructor que debe coincidir con el de la clase padre, mas los atributos propios de la clase
    UberX*/
    public UberVan(String license, Account driver, 
    Map<String, ArrayList<String,Integer>> typeCarAccepted, 
    ArrayList<String> seatsMaterial ){
        /* con palabra reservada super, nos referimos al metodo constructor de la clase padre, en este caso la 
           clase Car*/
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    } 
    
}
