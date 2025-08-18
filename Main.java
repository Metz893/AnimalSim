public class Main {
    public static void main(String[] args) {
        River river = new River(100);

        river.addAnimal(new Bear(), 5);
        river.addAnimal(new Bear(), 20);



        while(true) {  
            river.step();  
            river.print(); 


            //slow down the running of the program
            try {  
                Thread.sleep(1000); //1000 ms = 1 second, wait and begin again 
                                    //after 1 second has passed 
            } catch (InterruptedException e) {  
                throw new RuntimeException(e);  
            }  
        }
    }
    
}
