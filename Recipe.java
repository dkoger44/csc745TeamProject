/*
This is the class file for Recipe
It will contain the information for a specific recipe as an object.
*/
package test;


public class Recipe {
    int recipeID;
    String catagory;
    String instruction;
    String name;
    //full Constructor
    Recipe(int id, String cat, String instruct, String n){
        recipeID = id;
        catagory = cat;
        instruction = instruct;
        name = n;
    }
    //constructor without id
    Recipe(String cat, String instruct, String n){
        catagory = cat;
        instruction = instruct;
        name = n;
    }
    //null constructor
    Recipe(){
        
    }
    public int getID(){
        return recipeID;
    }
    public String getCategory(){
        return catagory;
    }
    public String getInstruction(){
        return instruction;
    }
    public String getName(){
        return name;
    }
    public void setID(int id){
        recipeID = id;
    }
    public void setCategory(String c){
        catagory = c;
    }
    public void setInstruction(String i){
        instruction = i;
    }
    public void setName(String n){
        name = n;
    }
}