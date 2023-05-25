package fr.uge.manifest.main;

import fr.uge.manifest.Container;
import fr.uge.manifest.Manifest;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var container = new Container("France",300);
        System.out.println(container.getDestination());
        System.out.println(container.getWeight());
        System.out.println("=================================================");
        var container1 = new Container("Senegal",400);
        var container2 = new Container("Maroc",200);
        var manifest = new Manifest();
        manifest.add(container);
        manifest.add(container1);
        manifest.add(container2);
        System.out.println("Weights Of Manifest is : "+manifest.weight());
        System.out.println("=================================================");
        System.out.println(manifest);
        System.out.println("=================================================");
        var manifest1 = new Manifest();
        Passenger p1 = new Passenger("Turquie");
        Passenger container3 = new Container("Lybie",2000);
        manifest1.add(container3);
        manifest1.add( p1);
        System.out.println(manifest1);
        System.out.println("=================================================");
        System.out.println(manifest1.price());
        System.out.println("=================================================");
        Manifest manifest2 = new Manifest();
        Passenger p2 = new Passenger("Algerie");
        Passenger container4 = new Container("Albanie",2000);
        Passenger container5 = new Container("Albanie",9000);

        manifest2.add(p2);
        manifest2.add(p1);
        manifest2.add(container4);
        manifest2.add(container1);
        manifest2.add(container2);
        manifest2.add(container3);
        manifest2.add(container5);
        //manifest2.removeAllContainersFrom("Albanie");

        System.out.println("=================================================");

        System.out.println(manifest2.weightPerDestination());









    }
}