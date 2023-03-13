package c322.Homeworks.Homework5.PartD.MealFacade;

import c322.Homeworks.Homework5.PartD.MealComponents.MealStarch;
import c322.Homeworks.Homework5.PartD.MealComponents.MealVegetable;
import c322.Homeworks.Homework5.PartD.MealComponents.MealProtein;

public class MealFacade {
    MealProtein MP;
    MealVegetable MV;
    MealStarch MS;
    public void assembleMeal(String protein, String Vegetable, String Starch){
        System.out.println("Meal Assembly process initiated. . .");
        this.MP = new MealProtein(protein);
        this.MV = new MealVegetable(Vegetable);
        this.MS = new MealStarch(Starch);
        System.out.println("Meal Assembly process completed. . .\n\n\n");
    }
}
