package io.zipcoder.pets;

abstract public class Pets implements petActions, Comparable<Pets>{
    String name;

    public Pets(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) { this.name = name; }

    @Override
    public int compareTo(Pets o) {
        return 0;
    }


}
