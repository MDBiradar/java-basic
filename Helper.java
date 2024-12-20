import MethodOverriding.*;
import Threads.*;

public class Helper {

    public void help() {
        // this.runtimePolyMorphism();
        this.ThreadingConcept();
    }

    private void ThreadingConcept() {
        Threading threading = new Threading();
        threading.ThredingStart();
    }

    @SuppressWarnings("unused")
    private void runtimePolyMorphism() {
        Overriding overriding = new Overriding();
        overriding.runtimePolyMorphism();
    }
}
