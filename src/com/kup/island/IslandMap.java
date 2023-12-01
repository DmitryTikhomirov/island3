package com.kup.island;

import com.kup.entities.Entity;
import com.kup.entities.EntityType;
import com.kup.entities.animals.EntitiesFactory;
import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.ThreadLocalRandom;
 @Getter
 @Setter
public class IslandMap {
     private final EntitiesFactory entitiesFactory;
     private final int height;
     private final int width;
     private final Location[][] locations;

    public IslandMap(int height, int width) {
        this.height = height;
        this.width = width;
        this.locations = new Location[height][width];
        this.entitiesFactory = new EntitiesFactory();
        entitiesFactory.initEntitiesMap();
    }
    public void initialize(){
        for (int coordY = 0; coordY < height; coordY++) {
            for (int coordX = 0; coordX < width; coordX++) {
                locations[coordY][coordX] = new Location(coordX,coordY);
            }
        }
    }
    public  void fill(int maxEntityCount){
        for (int coordY = 0; coordY < height; coordY++) {
            for (int coordX = 0; coordX < width; coordX++) {
                for (int i = 0; i < maxEntityCount ; i++) {
                    Entity entity = getRandomEntity();
                    var entityAsString = entity.getClass().getSimpleName();
                    var entityCountOnLocation = locations[coordY][coordX].getEntityesCount().getOrDefault(entityAsString, 0);
                    if(entityCountOnLocation >= entity.getMaxOnCage()){
                        continue;
                    }
                    locations[coordY][coordX].addEntity(entity);
                };
            }
        }

    }

    private Entity getRandomEntity() {
        var entityTypes = EntityType.values();
        var size = entityTypes.length;
        var entityType = entityTypes[ThreadLocalRandom.current().nextInt(size)];
        return entitiesFactory.createEntity(entityType);
    }
}
