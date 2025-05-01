package BuilderPattern;


import BuilderPattern.TeaDecorator;
import BuilderPattern.Tea;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gule Narjis
 */
public class WithSweetener extends TeaDecorator {

    private int spoonCount;

    public WithSweetener(Tea tea, int spoonCount) {
        super(tea);
        this.spoonCount = spoonCount;
    }

    @Override
    public float price() {
        return decoratedTea.price() + (spoonCount * 2.0f);
    }

    @Override
    public String name() {
        return decoratedTea.name() + " + " + spoonCount + " Spoons Sugar";
    }
}

