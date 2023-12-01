package com.kup.entities.animals;

import com.kup.annotations.Property;
import com.kup.entities.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.concurrent.ThreadLocalRandom;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public abstract class Animal extends Entity {
    private static final int MAX_CHANCE = 100;
    @Property(propertyName = "weight")
    private double weight;
    @Property(propertyName = "maxOnCage")
    private  int maxOnCage;
    @Property(propertyName = "speed", defaultValue = "1")
    private int speed;
    @Property(propertyName = "enoughAmountOfFood")
    private double enoughAmountOfFood;
    @Property(propertyName = "unicode")
    private String unicode;
    private double healthScale;


    protected Animal(double weight, int maxOnCage, int speed, double enoughAmountOfFood /*String unicode*/) {
        this.weight = weight;
        this.maxOnCage = maxOnCage;
        this.speed = speed;
        this.healthScale = enoughAmountOfFood;
        this.enoughAmountOfFood = enoughAmountOfFood;
        this.unicode = "hello!";
    }
    public Direction chooseDirection(){
        return Direction.values()[ThreadLocalRandom.current()
                .nextInt(Direction.values().length)];
    }

    public void eat(Entity food)
    {if(food.getWeight() >= this.getEnoughAmountOfFood()){
        this.setHealthScale(this.getEnoughAmountOfFood());
    }  else {
        double hangerAfterEating = this.getHealthScale() + food.getWeight();
        this.setHealthScale(hangerAfterEating);
    }
}
    public abstract Animal reproduce();

    public Action chooseAction(){
     var action = Action.values()[ThreadLocalRandom.current()
             .nextInt(Action.values().length)] ;
     var isActiveAction = ThreadLocalRandom.current().nextInt(MAX_CHANCE) < action.getActionChanceIndex();
         return isActiveAction ? action : Action.SLEEP;
    }
    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public int getMaxOnCage() {
        return maxOnCage;
    }

}
