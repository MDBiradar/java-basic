import MethodOverriding.*;

class Practice {
    public static void main(final String[] args) {
        runtimePolyMorphism();
    }

    private static void runtimePolyMorphism() {
        // Method Override
        Flower lillyFlower = new Lilly();
        lillyFlower.Show();

        // Method Hiding
        Flower roseFlower = new Rose();
        roseFlower.Show();
    }
}