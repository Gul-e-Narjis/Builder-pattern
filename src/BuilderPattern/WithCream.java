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
public class WithCream extends TeaDecorator {

    public WithCream(Tea tea) {
        super(tea);
    }

    @Override
    public float price() {
        return decoratedTea.price() + 5.0f;
    }

    @Override
    public String name() {
        return decoratedTea.name() + " + Cream";
    }
}
