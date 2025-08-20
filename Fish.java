public class Fish extends Animal {
     //Empty constructor set standard symbol to B
    public Fish() {
        setSymbol("F");
    }

    //Determine Which Direction to Move: 1 = Left; 0 = Nowhere; 2 = Right;
    @Override
    public int act() {
        int random = (int) (Math.random() * 10);

        if (random < 2) {
            return Animal.LEFT;
        }
        else if (random < 4) {
            return Animal.NOWHERE;
        }
        else {
            return Animal.RIGHT;
        }
    }
}
