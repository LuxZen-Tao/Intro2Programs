package java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WineBar {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Random random = new Random();

            // Set up the bar
        WineRack rack = new WineRack();
        rack.addWine(new Wine("Chateau Margaux", 2015, "Bordeaux", 120.00));
        rack.addWine(new Wine("Screaming Eagle", 2012, "Napa Valley", 250.00));
        rack.addWine(new Wine("Penfolds Grange", 2010, "Australia", 180.00));
        rack.addWine(new Wine("Cheap Table Red", 2020, "Spain", 8.50));
        rack.addWine(new Wine("House White", 2021, "Italy", 7.00));
        rack.addWine(new Wine("Mid-range Merlot", 2018, "France", 18.00));

        // Set up punters
        List<Punter> punters = new ArrayList<>();
        punters.add(new Punter("Alice", 30, 60.00));
        punters.add(new Punter("Bob", 17, 20.00));   // underage
        punters.add(new Punter("Carol", 25, 15.00));
        punters.add(new Punter("Dave", 19, 5.00));   // broke-ish

        System.out.println("\n#=====================================#");
        System.out.println("# Welcome to the Wine Bar Simulation! y#");
        System.out.println("#=====================================#\n");
        System.out.println(" Punters:");
        for (Punter p : punters) {
            System.out.println(" -- " + p);
        }

        int round = 1;

        while (true) {
            System.out.println("\n============================");
            System.out.println("          ROUND " + round);
            System.out.println("============================");

            rack.displayWines();

            if (rack.isEmpty()) {
                System.out.println("The rack is empty. The bar is closed for the night.");
                break;
            }

            // Each non-banned punter takes a turn
            for (Punter p : punters) {
                p.takeTurn(rack, random);
                if (rack.isEmpty()) {
                    System.out.println("All the wine is gone mid-round!");
                    break;
                }
            }

            if (rack.isEmpty()) {
                System.out.println("No more wine left. Simulation ending.");
                break;
            }

            // Ask if we should continue to next round
            System.out.print("Continue to next round? (y/n): ");
            String ans = input.nextLine().trim();

            if (ans.equalsIgnoreCase("n")) {
                System.out.println("Closing the bar. Good night.");
                break;
            }

            round++;
        }
        }
    }
}
