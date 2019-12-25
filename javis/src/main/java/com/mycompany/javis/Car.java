/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javis;

/**
 *
 * @author pavlos
 */
public class Car {
    private String tipos;
    private String kafsimo;
    private int ippodinami;
    private int troxoi;
    private int kivismos;
    private int kostos;
    
    public Car(String type, String gas, int hp, int wheels, int blocks, int cost ){
        tipos = type;
        kafsimo = gas;
        ippodinami = hp;
        troxoi = wheels;
        kivismos = blocks;
        kostos = cost;
    }
    
    public void kratisi(String type){
         if (type == "car"){
             //afto tha efanizi tin lista me ta diathesima aftikinita ke pote to theli
         }
    }
        

}
