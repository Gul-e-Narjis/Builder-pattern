package BuilderPattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gule Narjis
 */
import java.util.Scanner;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MealBuilder mealBuilder = new MealBuilder();

        System.out.print("Select Meal Type (1-Veg, 2-NonVeg): ");
        int mealType = scanner.nextInt();

        System.out.print("Are you diabetic? (yes/no): ");
        boolean isDiabetic = scanner.next().equalsIgnoreCase("yes");

        Meal meal = (mealType == 1) ? 
            mealBuilder.prepareVegMeal(isDiabetic) : 
            mealBuilder.prepareNonVegMeal(isDiabetic);

        System.out.print("Would you like Tea? (yes/no): ");
        if (scanner.next().equalsIgnoreCase("yes")) {
            Tea tea = new PlainTea();

            System.out.print("Add cream? (yes/no): ");
            if (scanner.next().equalsIgnoreCase("yes")) {
                tea = new WithCream(tea);
            }

            System.out.print("How many spoons of sugar? ");
            int spoons = scanner.nextInt();
            if (spoons > 0) {
                tea = new WithSweetener(tea, spoons);
            }

            meal.addItem(tea);
        }

        System.out.println("\nYour Meal:");
        meal.showItems();
        System.out.println("Total Cost: " + meal.getCost());
    }
}
