
public class PersonList{
    private int size = 0;
    private Person[] personArray;
    
    public PersonList(){
      personArray = new Person[100]; 
    }

 
    public void addPerson(Person newPerson){
      for(int i = 0; i<personArray.length; i++){
          //if(i<size){
          personArray[i] = newPerson;
          size++;
          
      //}
    }
   }
   
   public int size(){
        return size;
    }
    
    public String toString(){
       String person = "";
       
       for(int i = 0; i<counter; i++){
       person ;   
       }
       
       return person;
   
    }
}
