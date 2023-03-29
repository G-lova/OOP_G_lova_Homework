package Seminar3.drugs;

public class Component implements Comparable<Component>{
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        Component comp = (Component) obj;
        return this.name.equals(comp.getName())
                && this.weight.equals(comp.getWeight())
                && this.power == (comp.getPower());
    }

    @Override
    public int hashCode() {
        int res = name == null ? 0 : name.hashCode();
        res += weight == null ? 0 : weight.hashCode();
        res += power;
        return res;
    }

    @Override
    public int compareTo(Component o) {
        return getName().compareTo(o.getName());
    }
}