package fr.uge.manifest;

import fr.uge.manifest.main.Passenger;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
import java.util.stream.Collectors;

public class Manifest {

    private List<Passenger> manifests = new ArrayList<>();


    public boolean add(Passenger c) {
        if (c != null) return manifests.add(c);
        else System.out.println("Container is null!");
        return false;

    }

    public Integer weight() {
        return manifests.stream()
                .filter(Container.class::isInstance).filter(o -> ((Container) o).getWeight() > 0)
                .collect(Collectors.summingInt(o -> ((Container) o).getWeight()));
    }

    public Integer price(){
        return manifests.stream().filter(Passenger.class::isInstance)
                .filter(o -> ( o).getPrice() > 0)
                .mapToInt(o -> (o).getPrice()).sum();
    }

    public String removeAllContainersFrom(String containerDestination){

        this.manifests.removeIf(c -> c.getDestination() == containerDestination && c instanceof Container);
        return this.toString();
    }

    public Map<String,Integer> weightPerDestination(){
        Map<String,Integer> t = new HashMap<>();
        for(int i =0; this.manifests.size() > i; i++) {
            if(this.manifests.get(i) instanceof Container){
                String dest = this.manifests.get(i).getDestination();
                Integer weight = t.containsKey(dest) ? t.get(dest):0;
                weight += ((Container) this.manifests.get(i)).getWeight();
                t.put(dest,weight);
            }
        }
        return t;
    }

    public List<Passenger> getManifests() {
        return manifests;
    }

    @Override
    public String toString() {
        int count = 0;
        Iterator<Passenger> it = manifests.iterator();
        while (it.hasNext()) {
            Passenger c = it.next();
            System.out.println((count + 1) + c.toString());
            count++;
        }
        return "================================";
    }
}
