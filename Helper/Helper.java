package Helper;

import Collections.ArrayListPractice;
import Collections.HashSetPractice;
import Collections.ListPractice;
import Collections.MapPractice;
import MethodOverriding.*;
import ThreadConcept.*;

public class Helper {

    public void help() {
        this.runtimePolyMorphism();
        this.threadingConcept();
        this.collectionPractice();
    }

    private void collectionPractice() {
        HashSetPractice hsp = new HashSetPractice();
        hsp.setCollectionMethod();

        ArrayListPractice alp = new ArrayListPractice();
        alp.arrayListMethod();

        SortElements sortElements = new SortElements();
        ListPractice lp = new ListPractice(sortElements);
        lp.listMethod();
        lp.showPersons();

        MapPractice mp = new MapPractice();
        mp.mapMethod();
    }

    private void threadingConcept() {
        Threading threading = new Threading();
        threading.thredingStart();
    }

    private void runtimePolyMorphism() {
        Overriding overriding = new Overriding();
        overriding.runtimePolyMorphism();
    }
}
