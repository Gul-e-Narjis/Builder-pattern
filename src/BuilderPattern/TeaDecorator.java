package BuilderPattern;


import BuilderPattern.Tea;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gule Narjis
 */
public abstract class TeaDecorator extends Tea {
    protected Tea decoratedTea;

    public TeaDecorator(Tea tea) {
        this.decoratedTea = tea;
    }
}
