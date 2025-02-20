public class DuckGame {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        rubberDuck.performQuack(); // Squeak!
        rubberDuck.performFly();   // I can't fly.
        woodenDuck.performQuack(); // ... (silence) ...
        redHeadDuck.performFly();  // I am flying!
        lakeDuck.performQuack();   // Quack!
    }
}
