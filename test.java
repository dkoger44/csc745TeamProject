/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author ekustudent
 */
public class test {
    public static void main(String[] args) {
        String name = "Pizza";
        String instructions = "Put it in the oven!";
        String category = "Lunch";
        
        DatabaseHandler.insertRecipe(name, instructions, category);
    }
    
}

