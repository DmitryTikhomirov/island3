package com.kup.island;

import com.kup.entities.Entity;
import com.kup.entities.animals.Animal;
import com.kup.entities.plants.Plant;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class Location {
    private int coordX;
    private int coordY;
    private List<Entity> entities;
    private Map<String,Integer> entityesCount;

    public Location(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.entities = new ArrayList<>();
        this.entityesCount = new HashMap<>();
    }
    public void addEntity(Entity entity){
        entities.add(entity);
        addToStatistic(entity);
    }



    public void removeEntity(Entity entity){
        entities.remove(entity);
        removeFromStatistic(entity);
    }
    public List<Animal> getAnimals(){
      return entities.stream()
              .filter(entity -> entity instanceof Animal)
              .map(entity -> (Animal) entity)
              .toList();
    }
    public List<Plant> getPlants(){
        return entities.stream()
                .filter(Plant.class::isInstance)
                .map(Plant.class::cast)
                .toList();
     }
    private void addToStatistic(Entity entity) {
        var entityAsString = getEntityName(entity);
        entityesCount.merge(entityAsString, 1, (oldValue, newValue) -> oldValue +1);
    }
    private void removeFromStatistic(Entity entity){
        var entityAsString = getEntityName(entity);
        entityesCount.merge(entityAsString, 1, (oldValue, newValue) -> {
            int newCount = oldValue -1;
            if(newCount <= 0){
                return  null;
            }
            return newCount;
        });

    }

    private String getEntityName(Entity entity) {
        return entity.getClass().getSimpleName();
    }
}
