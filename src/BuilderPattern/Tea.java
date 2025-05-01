package BuilderPattern;


import BuilderPattern.Packing;
import BuilderPattern.Item;
import BuilderPattern.Bottle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gule Narjis
 */
public abstract class Tea implements Item {

    @Override
    public Packing packing() {
        return new Bottle();  // Assuming it's served in a cup/bottle
    }

    @Override
    public String name() {
        return "Basic Tea";
    }

    @Override
    public abstract float price();
}

