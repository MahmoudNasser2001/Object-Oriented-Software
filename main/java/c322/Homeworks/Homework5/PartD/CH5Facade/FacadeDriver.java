package c322.Homeworks.Homework5.PartD.CH5Facade;
import c322.Homeworks.Homework5.PartD.MealFacade.MealFacade;

public class FacadeDriver {
    public static void main(String[] args) {
        System.out.println("\n\n==========================================================");
        System.out.println("\t\t\tMeal Assembly Service Demo");
        System.out.println("\n\n==========================================================");

        MealFacade meal1 = new MealFacade();
        meal1.assembleMeal("Steak","Asparagus","Wild Rice");

        MealFacade meal2 = new MealFacade();
        meal2.assembleMeal("Chicken","Green Bean", "Potato wedges");

        MealFacade meal3 = new MealFacade();
        meal3.assembleMeal("Meatloaf","Brussel Sprouts","Mashed Potatoes");
    }
}