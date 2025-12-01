package Javabar;


import java.util.ArrayList;
import java.util.List;

public class WineRack {
    private List<Wine> wines;

    public WineRack() {
        wines = new ArrayList<>();
    }

    public void addWine(Wine wine) {
        wines.add(wine);
    }

    public void removeWine(Wine wine) {
        wines.remove(wine);
    }

    public void displayWines() {
        for (Wine wine : wines) {
            System.out.println("-----");
            wine.displayInfo();
            System.out.println("-----");
        }
    }
}
