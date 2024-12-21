package MethodOverriding;

public class Overriding {
    public void runtimePolyMorphism() {
        // Method Override
        Flower lillyFlower = new Lilly();
        lillyFlower.show();

        // Method Hiding
        Flower roseFlower = new Rose();
        roseFlower.show();
    }
}
