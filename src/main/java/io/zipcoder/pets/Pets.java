package io.zipcoder.pets;

abstract public class Pets implements petActions, Comparable<Pets>{
    String name;
    String type;

    public Pets(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) { this.name = name; }

    public void setType(){
        if(this instanceof Bird){
            this.type = "Bird";
        }else if(this instanceof Cat){
            this.type = "Cat";
        } else if (this instanceof Dog){
            this.type = "Dog";
        }
    }

    public String getType() {
        return type;
    }

    @Override
    public int compareTo(Pets otherPet) {
        //Fill out this method to pass test
        return this.name.compareTo(otherPet.getName());
    }

}
