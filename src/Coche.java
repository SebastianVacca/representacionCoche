public class Coche {
    //Atributos
    private String brand;
    private String model;
    private Integer year;
    private Double currentSpeed = 0.0;
    private Boolean engineOn = false;

    //Constructores
    public Coche(String brand, String model){
        this(brand, model, 2025);
    }
    public Coche(String brand, String model, Integer year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    //Métodos
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public Integer getYear(){
        return this.year;
    }
    public Double getCurrentSpeed(){
        return this.currentSpeed;
    }
    public Boolean IsEngineOn(){
         return this.engineOn;
    }

    //Método para encender el carro
    public void TurnOnEngine(){
        if (!engineOn) {
            this.engineOn = true;
            System.out.println("Motor en marcha");
        } else {
            System.out.println("El motor ya está prendido");
        }
    }

    //Método para apagar
    public void TurnOffEngine(){
        if (engineOn && currentSpeed == 0.0 ) {
            this.engineOn = false;
            System.out.println("Motor apagado");
        } else if (!engineOn) {
            System.out.println("El motor ya está apagado");
        } else {
            System.out.println("El carro se está moviendo, no se puede apagar");
        }
    }

    //Método para acelerar
    public void Accelerate (Double acceleration){
        if (engineOn == true && acceleration > 0) {
            this.currentSpeed += acceleration;
            System.out.printf("Acelerando, velocidad: %.1f km/h%n", currentSpeed);
        } else if (!engineOn) {
            System.out.println("No se puede acelerar, el carro está apagado");
        } else {
            System.out.println("La aceleración no puede ser inferio a 0");
        }
    }

    //Método para frenar
    public void Stop(Double decelerate){
        if (engineOn && decelerate > 0 ) {
            if (currentSpeed - decelerate >= 0) {
                this.currentSpeed -= decelerate;
                System.out.printf("Frenando, velocidad: %.1f", currentSpeed);
            } else {
                System.out.println("Ya se frenó el carro");
            }
        } else if (!engineOn) {
            System.out.println("No se puede frenar con el carro apagado");
        } else {
            System.out.println("El decremento debe ser mayor a 0");
        }
    }

    public String MostrarEstado(){
        return String.format("Marca: %s%nModelo: %s%nAño de fabricación: %d%nVelocidad actual: %.1f%nMotor encendido: %s",
        getBrand(), getModel(), getYear(), getCurrentSpeed(), engineOn ? "si":"no");
    }
}
