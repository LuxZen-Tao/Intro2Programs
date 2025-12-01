import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int steps = 5

        

        Dragon drake = new Dragon();

        foe
        drake.greet();
        drake.breathFire();
        System.out.print("Enter fly distance: ");
        int flyDistance = input.nextInt();
        drake.fly(flyDistance);
        System.out.print("Enter damage to dragon: ");
        int damage = input.nextInt();
        drake.takeDamage(damage);
        drake.status();
        
        input.close();
    }
}