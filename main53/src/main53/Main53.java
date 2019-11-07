/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main53;

/**
 *
 * @author LENOVO
 */
public class Main53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit R=new Rabbit("Peter",false,"grass",4,"Grey");
        System.out.println("Hello,His Name is "+R.getName());
        System.out.println(R.getName()+" is Vegetarian ? "+R.isVegetarian());
        System.out.println(R.getName()+" eats "+R.getEats());
        System.out.println(R.getName()+" has "+R.getNoOfLegs()+" legs");
        System.out.println(R.getName()+" color is "+R.getColor());
    }
    
}
