import java.util.*;

public class JaPlay {
  public static void main(String[] args){
    Dog newDog = new Dog("Mewaaa");
    System.out.println(newDog.getSound());
    //System.out.println(newDog.sound("Mewa"));
  }
}


class Dog{
  String sound = "";

  Dog(){
    sound = "Woof Woof";
  }

  Dog(String sound2){
    sound = "Woof Woof "+sound2;
  }

  String getSound(){
    return sound;
  }
}


class Cat{

}
