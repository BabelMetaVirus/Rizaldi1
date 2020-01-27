/*
  Object class of Person. 
  It assigns the name and the description of the person and returns the name of the person as a string.
 */
public class Person
{
   String name; //The name of the person
   String description; //The description of the person
   
   //A constructor to assign name and description variable of the person 
   public Person(String name, String description){
        this.name = name;
        this.description = description;
       
   }

   public String toString(){//Returns the name of the person as a string
        return name;
   }
   
   public String getDescription(){
       return description;
   }    
   
   public void setDescription(String newDescription){
       this.description = newDescription;    
   }
}
