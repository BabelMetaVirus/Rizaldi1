/*
  Object class of Thing. 
  It assigns the name and the description of the thing and returns the name of the thing as a string.
 */
public class Thing{
   String name; //The name of the Thing
   String description; //The description of the Thing
   
   //A constructor to assign the name and description variable of the Thing 
   public Thing(String name, String description){
        this.name = name;
        this.description = description;
    }

   public String toString(){//Returns the name of the Thing as a string
        return name;
   }
   
   public String getDescription(){
       return description;
   }    
   
   public void setDescription(String newDescription){
       this.description = newDescription;    
   }
}
