package c322.Homeworks.Homework4.PartD;
import java.util.Locale;
import java.util.Scanner;
public class MotorHomeDriver {

    public static void main (String[] args)
    {

        Scanner s = new Scanner(System.in);
        //Step1
        //create abstract factory
        MotorHomeAbstractFactory mhFactory = null;

        //Step2
        //Create a factory instance
        //Simulated user input
        System.out.println("Enter \"TypeA\", \"TypeB\", or \"TypeC\" to retrieve a motor home:");
        String nextMotorHome = (s.nextLine()).toLowerCase(Locale.ROOT).replace(" ","");

        if(nextMotorHome.equals("typea"))
        {
            System.out.println("\nType A motor home selected");
            mhFactory = new TypeAFactory();
        }
        else if (nextMotorHome.equals("typeb"))
        {
            System.out.println("\nType B motor home selected");
            mhFactory = new TypeBFactory();
        }
        else if (nextMotorHome.equals("typec"))
        {
            System.out.println("\nType C motor home selected");
            mhFactory = new TypeCFactory();
        }
        else
        {
            System.out.println("Invalid motor home type entered.");
        }

        //Step 3
        //create motor home components
        Style mhStyle = mhFactory.createStyle();
        Frame mhFrame = mhFactory.createFrame();
        Engine mhEngine = mhFactory.createEngine();
        Kitchen mhKitchen = mhFactory.createKitchen();

        //Step 4
        //provide output
        System.out.println("\nComponent list for " + nextMotorHome +
                " motor home");
        System.out.println(mhStyle.getStyle());
        System.out.println(mhFrame.getFrame());
        System.out.println(mhEngine.getEngine());
        System.out.println(mhKitchen.getKitchen());
        s.close();
    }
}