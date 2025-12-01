package Javabar;

public class Wine {

    String name;
    int year;
    String region;
    int volume;
    float alcoholContent;

    public Wine(String name, int year, String region) {
        this.name = name;
        this.year = year;
        this.region = region;
        this.alcoholContent = 12.5f; // default alcohol content in %
        this.volume = 70; // default volume in cl
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getRegion() {
        return region;
    }
    public int getVolume() {
        return volume;
    }

    public float getAlcoholContent() {
        return alcoholContent;
    }

    public void displayInfo() {
        System.out.println("#=============================#");
        System.out.println("#  Wine Name: " + name);
        System.out.println("#  Year: " + year);
        System.out.println("#  Region: " + region );
        System.out.println("#  Volume: " + volume + "cl");
        System.out.println("#=============================#");
    }

    public void drink() {
        System.out.println("Drinking " + year + " " + name + " from " + region);
        volume -= 23.333; // reduce volume by 23.333cl
        if (volume < 0) {
            volume = 0;
            System.out.println("The bottle is now empty.");
        }
    }
}
