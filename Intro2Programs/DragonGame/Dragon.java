import java.util.Scanner;

public class Dragon {

    // === Fields ===
    private String name;
    private int flightSpeed;      // km/h
    private int fireTemp;         // Kelvin
    private double size;          // meters
    private double weight;        // kg
    private String color;
    private double healthPoints;  // HP
    private int damage;           // base damage per attack

    private Scanner scanner = new Scanner(System.in);

    // === Constructors asks the user for all key attributes ===
    public Dragon() {
        System.out.print("Name your dragon: ");
        this.name = scanner.nextLine();

        System.out.print("Enter dragon flight speed (km/h): ");
        this.flightSpeed = 500;

        System.out.print("Enter dragon fire temperature (K): ");
        this.fireTemp = 2000;

        System.out.print("Enter dragon weight (kg): ");
        this.weight = scanner.nextDouble();

        System.out.print("Enter dragon size (height meters): ");
        this.size = scanner.nextDouble();

        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter dragon color: ");
        this.color = scanner.nextLine();

        // Default stats
        this.healthPoints = 1000.0;
        this.damage = 150;
        System.out.println("\nYour dragon " + name + " has been created!\n");
        this.status();
    }

    // ===  getters ===
    public String getName() {
        return name;
    }

    public int getFlightSpeed() {
        return flightSpeed;
    }

    public double getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public int getDamage() {
        return damage;
    }

    // === behaviours/actions ===

    public void greet() {
        System.out.println(name + " nods its head in greeting.");
    }

    public void breathFire() {
        if (this.fireTemp > 100) {
            System.out.println(name + " breathes fire at " + fireTemp + " K!");
        } else {
            System.out.println(name + "'s fire is too weak to breathe properly.");
        }
    }

    public void fly(int distance) {
        if (flightSpeed <= 0) {
            System.out.println(name + " cannot fly with a flight speed of " + flightSpeed + " km/h.");
            return;
        }
        float hours = (float) distance / flightSpeed;
        System.out.println(name + " flies " + distance + " km in " + hours + " hours.");
    }

    public void roar() {
        System.out.println(name + " roars: ROAR!!!... *cough cough*");
    }

    public void eatNumber() {
        System.out.print("Enter a number for " + name + " to eat: ");
        int number = scanner.nextInt();
        System.out.println(name + " eats " + number + " numbers.");
    }

    public boolean isFlying() {
        // For now, just pretend the dragon can always fly
        return true;
    }

    public void feed(int foodAmount) {
        // Gain weight from food
        this.weight += foodAmount * 2.0;
        this.healthPoints += foodAmount * 1.0; // small heal from food
        System.out.println(name + " eats " + foodAmount + " units of food.");
        System.out.println(name + " now weighs " + this.weight + " kg and has " + this.healthPoints + " HP.");
    }

    public void expressMetrics() {
        System.out.println(name + " is a " + this.color + " dragon.");
        System.out.println("It weighs " + this.weight + " kg and is " + this.size + " m tall.");
        System.out.println("Flight speed: " + this.flightSpeed + " km/h, Fire temperature: " + this.fireTemp + " K.");
    }

    // === Status & checks ===

    public void checkConsciousness() {
        if (this.healthPoints <= 0) {
            System.out.println(name + " is unconscious.");
        } else {
            System.out.println(name + " stands tall and proud.");
        }
    }

    public void describeSize() {
        if (this.size > 20 && this.weight > 2000) {
            System.out.println(name + " is massive!");
        } else {
            System.out.println(name + " is of average dragon size.");
        }
    }

    public void checkFlyingStatus() {
        if (this.isFlying() && this.healthPoints >= 300) {
            System.out.println(name + " is soaring through the skies!");
        } else {
            System.out.println(name + " is grounded.");
        }
    }

    public void checkFlightAbility() {
        if (this.healthPoints < 300 && this.healthPoints > 0) {
            System.out.println(name + " is too weak to fly.");
        } else if (this.healthPoints <= 0) {
            System.out.println(name + " cannot fly — it is unconscious.");
        } else {
            System.out.println(name + " takes to the skies!");
        }
    }

    public void describeFireStrength() {
        if (this.fireTemp < 500 && this.fireTemp > 100) {
            System.out.println(name + "'s fire is weak.");
        } else if (this.fireTemp >= 500 && this.fireTemp <= 1000) {
            System.out.println(name + "'s fire is moderate.");
        } else if (this.fireTemp > 1000) {
            System.out.println(name + "'s fire is intense!");
        } else {
            System.out.println(name + " can barely manage a spark.");
        }
    }

    // === Stat-changing actions ===

    public void takeDamage(int damageAmount) {
        this.healthPoints -= damageAmount;
        if (this.healthPoints < 0) {
            this.healthPoints = 0;
        }
        System.out.println(name + " takes " + damageAmount + " damage and now has " + this.healthPoints + " HP.");
    }

    public void heal(int amount) {
        this.healthPoints += amount;
        System.out.println(name + " heals for " + amount + " HP and now has " + this.healthPoints + " HP.");
    }

    public void train(int hours) {
        int increase = hours * 5;
        this.damage += increase;
        System.out.println(name + " trains for " + hours + " hours and increases damage to " + this.damage + ".");
    }

    public void grow(double meters) {
        this.size += meters;
        this.weight += meters * 30; // arbitrary growth factor
        System.out.println(name + " grows by " + meters + " m.");
        System.out.println(name + " is now " + this.size + " m tall and weighs " + this.weight + " kg.");
    }

    public void coolDown(int amount) {
        this.fireTemp -= amount;
        if (this.fireTemp < 0) {
            this.fireTemp = 0;
        }
        System.out.println(name + "'s fire cools down by " + amount + " K to " + this.fireTemp + " K.");
    }

    // === Setters (if you want manual overrides) ===

    public void setFlightSpeed(int flightSpeed) {
        this.flightSpeed = flightSpeed;
    }

    public void setFireTemp(int fireTemp) {
        this.fireTemp = fireTemp;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    // === Nice helper to show full current state ===
    public void status() {
        System.out.println("\n=== Dragon Status ===");
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Health: " + healthPoints);
        System.out.println("Damage: " + damage);
        System.out.println("Flight speed: " + flightSpeed + " km/h");
        System.out.println("Fire temperature: " + fireTemp + " K");
        System.out.println("Size: " + size + " m");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("=====================\n");
    }
}
