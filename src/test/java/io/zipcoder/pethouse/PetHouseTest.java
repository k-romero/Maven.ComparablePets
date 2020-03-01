package io.zipcoder.pethouse;

import io.zipcoder.pets.Bird;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pets;
import org.junit.Assert;
import org.junit.Test;
import static  org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PetHouseTest {

    @Test
    public void sortNameTest(){
        //Given
        PetHouse petHouse = new PetHouse();
        petHouse.setNumOfPets(3);
        petHouse.petHouse = new ArrayList<>();
        Pets dog = new Dog("Bernie");
        Pets cat = new Cat("Bingley");
        Pets bird = new Bird("Tweety");
        petHouse.petHouse.add(bird);
        petHouse.petHouse.add(cat);
        petHouse.petHouse.add(dog);

        //When
        Collections.sort(petHouse.petHouse);


        //Then
        Assert.assertThat(petHouse.petHouse.get(0).getName(), is("Bernie"));
        Assert.assertThat(petHouse.petHouse.get(1).getName(), is("Bingley"));
        Assert.assertThat(petHouse.petHouse.get(2).getName(), is("Tweety"));

    }

    @Test
    public void sortTypeTest(){
        //Given
        PetHouse petHouse = new PetHouse();
        petHouse.setNumOfPets(3);
        petHouse.petHouse = new ArrayList<>();
        Pets dog = new Dog("Bernie");
        Cat cat = new Cat("Bingley");
        Pets bird = new Bird("Tweety");
        petHouse.setTypeAndAddPetForTesting(dog);
        petHouse.setTypeAndAddPetForTesting(cat);
        petHouse.setTypeAndAddPetForTesting(bird);

        //When
        Collections.sort(petHouse.petHouse, new Comparator<Pets>(){
            @Override
            public int compare(Pets o1, Pets o2) {
                return o1.getType().compareTo(o2.getType());
            }
        });

        //Then
        Assert.assertTrue(petHouse.petHouse.get(0) instanceof Bird);
        Assert.assertTrue(petHouse.petHouse.get(1) instanceof Cat);
        Assert.assertTrue(petHouse.petHouse.get(2) instanceof Dog);
    }

}
