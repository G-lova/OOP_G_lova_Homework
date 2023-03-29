package Seminar3;

import Seminar3.drugs.Component;
import Seminar3.drugs.impl.CatDrug;
import Seminar3.drugs.impl.components.Azitron;
import Seminar3.drugs.impl.components.Pinecilin;
import Seminar3.drugs.impl.components.Water;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Component> componentsCat = List.of(new Azitron("Азитрон", "4", 4),
                new Water("Вода", "15", 1));
        CatDrug drug = new CatDrug(componentsCat);
        for (Component component : drug) {
            System.out.println(component);
        }
        List<Component> componentCat2 = List.of(new Azitron("Азитрон","4",4),
                new Pinecilin("Пинецилин", "15", 6));
        List<Component> componentCat4 = List.of(new Water("Пинецилин", "20", 12),
                new Azitron("Азитрон", "10", 9));
        List<Component> componentCat3 = List.of(new Water("Вода", "20", 12),
                new Azitron("Азитрон", "10", 9));
        List<Component> componentCat5 = List.of(new Water("Вода", "20", 12),
                new Azitron("Пинецилин", "18", 9));
        CatDrug drug1 = new CatDrug(componentCat2);
        CatDrug drug2 = new CatDrug(componentCat3);
        CatDrug drug4 = new CatDrug(componentCat4);
        CatDrug drug5 = new CatDrug(componentCat5);

        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(drug);
        drugs.add(drug1);
        drugs.add(drug2);
        drugs.add(drug4);
        drugs.add(drug5);
//        System.out.println(drugs);

        Collections.sort(drugs);
        System.out.println(drugs);

        Set<Component> componentSet = new HashSet<>();
        for (Component c:componentsCat) {
            componentSet.add(c);
        }
        for (Component c:componentCat2) {
            componentSet.add(c);
        }
        for (Component c:componentCat3) {
            componentSet.add(c);
        }
        for (Component c:componentCat4) {
            componentSet.add(c);
        }
        for (Component c:componentCat5) {
            componentSet.add(c);
        }

        List<Component> componentList = new ArrayList<>(componentSet);
        Collections.sort(componentList);
        System.out.println();
        for (Component c:componentList) {
            System.out.println(c.toString());
        }

    }


}