package Seminar3.drugs.impl;

import Seminar3.drugs.Component;

import java.util.Iterator;
import java.util.List;

public abstract class Drug implements Iterable<Component>, Comparable<Drug> {
    @Override
    public int compareTo(Drug o) {
        int comparator = Integer.compare(getDrugPower(), o.getDrugPower());
        if (comparator == 0) {
            return components.get(0).compareTo(o.components.get(0));
        } else {
            return comparator;
        }
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            public boolean hasNext() {
                return index < components.size();
            }
            public Component next() {
                return components.get(index++);
            }
        };
    }
    private List<Component> components;
    int index;

    public Drug(List<Component> component) {
        this.components = component;
        this.index = 0;
    }

    public int getDrugPower(){
        int power = 0;
        for (Component component: components) {
            power += component.getPower();
        }
        return power;
    }

    @Override
    public String toString() {
        return String.format(
                "%s {components: %s, power: %s}%n", this.getClass().getSimpleName(), components, getDrugPower()
        );
    }


}