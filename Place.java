/*
  Object class of place. 
  It assigns the name and the description of the place and returns the name of the place as a string.
 */
public class Place 
{
   String name; //The name of the place
   String description; //The description of the place

   //A constructor to assign name and description variable of the place 
   public Place(String name, String description)
   {
        this.name = name;
        this.description = description;
   }

   public String toString(){ //Returns the name of the place as a string
       return name;
   }
    
   public String getDescription(){
       return description;
   }    
   
   public void setDescription(String newDescription){
       this.description = newDescription;    
   }
       
}
