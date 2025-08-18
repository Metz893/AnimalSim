public class River {
    private Animal river[];

    //One-Argument Constructor to initialize Animals Array with size length
    public River (int length) {
        river = new Animal[length];
    }

    //Add Animal to the array
    public void addAnimal(Animal a, int index) {  
        if (index < river.length && river[index] == null)
            river[index] = a;
    }

    //output contents of river
    public void print() {
        for (Animal a : river) {
            if (a == null) 
                System.out.print("-");
            else
                System.out.print(a);
        }
    }


}
