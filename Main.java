public class Main {
    public static void main(String[] args) {
        River river = new River(100);

        river.addAnimal(new Bear(), 5);
        river.addAnimal(new Fish(), 4);
        river.addAnimal(new Bear(), 90);
        river.addAnimal(new Fish(), 51);
        river.addAnimal(new Bear(), 10);
        river.addAnimal(new Fish(), 50);


        while(true) {  
            river.step();     
            river.print(); 
            if (!river.hasSpace()) {
                System.exit(0);
            }  


            //slow down the running of the program
            try {  
                Thread.sleep(100); //1000 ms = 1 second, wait and begin again 
                                    //after 1 second has passed 
            } catch (InterruptedException e) {  
                throw new RuntimeException(e);  
            }  
        }
    }
    
}
