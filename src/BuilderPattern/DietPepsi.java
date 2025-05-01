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
public class DietPepsi extends ColdDrink {
    @Override
    public float price() {
        return 34.0f;
    }

    @Override
    public String name() {
        return "Diet Pepsi";
    }
}