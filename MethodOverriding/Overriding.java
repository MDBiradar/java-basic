package MethodOverriding;

public class Overriding {
    public void runtimePolyMorphism() {
        // Method Override
        Flower lillyFlower = new Lilly();
        lillyFlower.Show();

        // Method Hiding
        Flower roseFlower = new Rose();
        roseFlower.Show();
    }
}
