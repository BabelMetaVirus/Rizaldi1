public class TestClass{
 public static void main(String[] args){
     Person p1 = new Person("Rizaldi", "My description");
     /*
     Place place1 = new Place("Winnipeg", "Coldest place ever");
     Thing thing1 = new Thing("Spoon","My Spoon");
     System.out.println("Name of Person: " + p1.toString() + ", " + "Description of Person: " + p1.getDescription());
     System.out.println("Name of Place: " + place1.toString() + ", " + "Description of Place: " + place1.getDescription());
     System.out.println("Name of Thing: " + thing1.toString() + ", " + "Description of Thing: " + thing1.getDescription());
     p1.setDescription("This is a new description for person1");
     place1.setDescription("This is a new description for place1");
     thing1.setDescription("This is a new description for thing1");
     System.out.println("New description of p1: " + p1.getDescription());
     System.out.println("New description of place1: " + place1.getDescription());
     System.out.println("New description of thing1: " + thing1.getDescription());
     */
     PersonList newList = new PersonList();
     newList.addPerson(p1);
     System.out.println(newList.toString());
     System.out.println(newList.size());
    }
}
