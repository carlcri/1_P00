// en la misma clase genero el constructor
function Car(license, driver){
    this.license = license;
    this.driver = driver;
    this.id;
    this.passenger;
}

//Metodo para imprimir
Car.prototype.printDataCAr = function(){
    console.log(this.license)
    console.log(this.driver.name)
    console.log(this.driver.document)
}