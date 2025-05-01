package BuilderPattern;


import BuilderPattern.ColdDrink;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gule Narjis
 */
public class DietCoke extends ColdDrink {
    @Override
    public float price() {
        return 32.0f;
    }

    @Override
    public String name() {
        return "Diet Coke";
    }
}
