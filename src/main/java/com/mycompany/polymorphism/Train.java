/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polymorphism;

/**
 *
 * @author Suttipong
 */
public class Train extends Vehicle{
    @Override
    public void move() {
        System.out.println("Moving on the track!");
    }
}
