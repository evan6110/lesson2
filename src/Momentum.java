import TerminalIO.*;

public class Momentum {

    public static void main(String[] args) {
        
        KeyboardReader r = new KeyboardReader();
        int mass, vel, mom = 0;
        
        System.out.println("=================Momentum=================");
        mass = r.readInt("Enter the mass of the object(kg): ");
        vel = r.readInt("Enter the velocity of the object(m/s): ");
        mom = mass * vel;
        System.out.print("\nThe momentum of the object is " + mom + "kg*m/s.\n"
        + "==========================================\n");
    }
    
}
