import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos los dos tipos de autos
        ProductionRemoteControlCar autoProd = new ProductionRemoteControlCar();
        ExperimentalRemoteControlCar autoExp = new ExperimentalRemoteControlCar();

        // 2. Los hacemos correr en la pista usando el mismo método race()
        TestTrack.race(autoProd);
        TestTrack.race(autoExp);

        System.out.println("Distancia auto producción: " + autoProd.getDistanceTravelled()); // Debe dar 10
        System.out.println("Distancia auto experimental: " + autoExp.getDistanceTravelled()); // Debe dar 20

        // 3. Probamos el ranking de victorias
        ProductionRemoteControlCar campeon = new ProductionRemoteControlCar();
        campeon.setNumberOfVictories(5);

        ProductionRemoteControlCar novato = new ProductionRemoteControlCar();
        novato.setNumberOfVictories(2);

        List<ProductionRemoteControlCar> listaAutos = new ArrayList<>();
        listaAutos.add(novato);
        listaAutos.add(campeon);

        List<ProductionRemoteControlCar> ordenados = TestTrack.getRankedCars(listaAutos);
        System.out.println("El primero del ranking tiene: " + ordenados.get(0).getNumberOfVictories() + " victorias"); // Debe dar 5
    }
}