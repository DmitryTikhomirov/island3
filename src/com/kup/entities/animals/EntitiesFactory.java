package com.kup.entities.animals;

import com.kup.entities.Entity;
import com.kup.entities.EntityType;
import com.kup.entities.animals.herbivore.*;
import com.kup.entities.animals.predators.*;
import com.kup.entities.plants.Plant;;import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EntitiesFactory {
    public static final String CURRENT_PATH = "com.kup.entities";
    //Constructor<? extends Entity>>   -  Конструктор какого то класса наследника Entity
    private Map<Class, Constructor<? extends Entity>> entitesMap = new HashMap<>();
    public void initEntitiesMap(){
       Set <Class> allClassesFromMyPackage = findAllClassesUsingClassLoader(CURRENT_PATH);
        System.out.println("123");
    }
    public Entity createEntity(EntityType entityType){
      return switch (entityType){
          case WOLF -> new Wolf();
          case FOX -> new Fox();
          case SNAKE -> new Snake();
          case BAER -> new Bear();
          case EAGLE -> new Eagle();
          case HORSE -> new Horse();
          case DEER -> new Deer();
          case RABBIT -> new Rabbit();
          case GOAT -> new Goat();
          case SHEEP -> new Sheep();
          case BOAR -> new Boar();
          case BUFFALO -> new Buffalo();
          case DUCK -> new Duck();
          case LARVA -> new Larva();
          case PLANT -> new Plant();

      };
    }
    public Set<Class> findAllClassesUsingClassLoader(String packageName){
        InputStream stream = ClassLoader.getSystemClassLoader()
                .getResourceAsStream(packageName.replaceAll("[.]", "/"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        return reader
                .lines()
                .filter(line -> line.endsWith(".class"))
                .map(line -> getClass(line, packageName))
                .collect(Collectors.toSet());
    }

    private Class getClass(String className, String packageName) {
        try{
            Class.forName(packageName + "." + className.substring(0, className.lastIndexOf('.')));
        }  catch (ClassNotFoundException e ) {
            System.out.println("handle the exception 1234");
        }
        return null;
    }
}
