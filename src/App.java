public class App {
    public static void main(String[] args) throws Exception {
        var carro = new Coche("Renault", "Duster", 2015);

        System.out.println(carro.MostrarEstado());

        carro.TurnOnEngine();

        System.out.println(carro.MostrarEstado());

        carro.Accelerate(10.0);

        System.out.println(carro.MostrarEstado());

        

        carro.Stop(11.0);

        carro.Stop(10.0);

        carro.TurnOffEngine();

        carro.Stop(10.0);

    }
}
