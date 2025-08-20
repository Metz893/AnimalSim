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

        System.out.println();
    }

    //Go through List and do the actions
    public void step() {
        for (int i = 0; i < river.length; i++) {
            Animal current = river[i];
            int action;

            if (current != null) {
                action = current.act();

                if (river[i] instanceof Bear) {
                    if (action == 1 && i != 0) {
                        if (river[i-1] == null || river[i-1] instanceof Fish) {
                            river[i-1] = current;
                            river[i] = null;
                        }
                        else {
                            river[randomNull()] = new Bear();
                        }
                    }

                    else if (action == 2 && i != river.length - 1) {
                        if (river[i+1] == null || river[i+1] instanceof Fish) {
                            river[i+1] = current;
                            river[i] = null;
                        }
                        else {
                            river[randomNull()] = new Bear();
                        }
                    }
                }

                else {
                    if (action == 1 && i != 0) {
                        if (river[i-1] == null) {
                            river[i-1] = current;
                            river[i] = null;
                        }
                        else  if (river[i-1] instanceof Fish) {
                            river[randomNull()] = new Fish();
                        }
                        else 
                            river[i] = null;
                    }

                    else if (action == 2 && i != river.length - 1) {
                        if (river[i+1] == null) {
                            river[i+1] = current;
                            river[i] = null;
                        }
                        else if (river[i+1] instanceof Fish) {
                            river[randomNull()] = new Fish();
                        }
                        else 
                            river[i] = null;
                    }
                }
            }
        }
    }

    //randm null sport in river
    private int randomNull() {
        int random = randomNum();

        while (hasSpace() && river[random] != null) {
            random = randomNum();
        }

        return random;
    }

    public boolean hasSpace() {
        for (Animal a : river) {
            if (a == null)
                return true;
        }

        return false;
    }

    //random number in river length
    private int randomNum () {
        return (int) (Math.random() * river.length);
    }


}
