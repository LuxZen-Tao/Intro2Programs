 

public class PackOfCrisps {
    private String flavour;
    private int numOfCrisps;
    private boolean open;

    public PackOfCrisps(String flavour) {
        this.flavour = flavour;
        this.numOfCrisps = 10;
        this.open = false;
    }

    public String getFlavour() {
        return this.flavour;
    }
    public int getNumOfCrisps() {
        return this.numOfCrisps;
    }
    public boolean isOpened() {
        return open;
    }

    public boolean isClosed() {
        if (!open) {
        return true;
        }
        return false;
    }
    public boolean isEmpty() {
        if (numOfCrisps == 0) {
        return true;
        }
        return false;
    }

    public void open() {
        if (!open) {
            open = true;
            System.out.println("You have opened the pack of " + flavour + " crisps.");
        } else {
            System.out.println("The pack is already opened.");
        }
    }

    public void eatCrisp() {
        if (open == false) {
            System.out.println("You need to open the pack first.");
        } else if (open == true && numOfCrisps <= 0) {
            this.numOfCrisps = 0;
            System.out.println("The pack is empty. No crisps left to eat.");
        } else if (open == true &&  numOfCrisps > 0) {
            this.numOfCrisps = numOfCrisps-1;
            System.out.println("You have eaten a crisp. " + this.numOfCrisps + " left.");
        }
    }
}
