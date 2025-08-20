import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter River length: ");
        int length = input.nextInt();

        System.out.print("Number of Fish: ");
        int numFish = input.nextInt();

        System.out.print("Number of Bears: ");
        int numBear = input.nextInt();

        River river = new River(length);

        for (int i = 0; i < numBear; i++) {
            river.addAnimal(new Bear(), river.randomNull());
        }

        for (int i = 0; i < numFish; i++) {
            river.addAnimal(new Fish(), river.randomNull());
        }

        input.close();

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
