public class Main {
    public static void main(String[] args) {
        River river = new River(100);  
  
        river.addAnimal(new Bear(), 10);  
        river.addAnimal(new Bear(), 20);  
        river.addAnimal(new Bear(), 25);  
        river.addAnimal(new Bear(), 99);  
  
        river.print();  
    }
    
}
