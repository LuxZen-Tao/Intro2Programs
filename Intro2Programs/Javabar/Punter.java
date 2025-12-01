package Javabar;


public class Punter {
    String name;
    int age;
    Wine wine;


    public Punter(String name, int age) {
        this.name = name;
        this.age = age;
        this.wine = null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void holdWine(Wine wine) {
        this.wine = wine;
        System.out.println(name + " is holding a bottle of " + wine.getName());

    }

    public void drinkWine() {
        if (wine != null) {
            System.out.println(name + " is about to drink some " + wine.getName());
            wine.drink();
        } else {
            System.out.println(name + " is not holding any wine to drink.");
        }
    }

    // pick a wine from the winerack and hold it
    public void pickWineFromRack(WineRack rack, Wine wine) {
        rack.removeWine(wine);
        holdWine(wine);
    }

}
