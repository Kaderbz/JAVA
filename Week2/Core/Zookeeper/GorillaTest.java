public class GorillaTest {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla(100);
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();
        
        
        gorilla.eatBananas();
        gorilla.eatBananas();
        
        gorilla.climb();
        System.out.println("the gorilla 's energy level is " +gorilla.energy);
    }
    
}
