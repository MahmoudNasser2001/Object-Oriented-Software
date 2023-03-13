package c322.Homeworks.Homework5.PartC;
import java.text.DecimalFormat;
public class DriverTest {
    public static DecimalFormat acreageFormat = new DecimalFormat(".##");
    public static void main(String[] args) {
        System.out.println("\n\nReal Estate Land Area Calculation");
        AcreageDeterminatorAdapter adAdapter = new AcreageDeterminatorAdapter();
        realEstate estate = new realEstate(2300,6325);
        System.out.print("Estate Acreage: ");
        System.out.print(acreageFormat.format(adAdapter.determineAcreage(estate)));
    }
}
