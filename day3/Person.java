package day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
  private String name;
  private List<String> hobbies;

  public Person(String name) {
    super();
    this.name = name;
    this.hobbies = new ArrayList<>();
  }
  
  public String getName() {
    return name;
  }
  
  public List<String> getHobbies() {
    return Collections.unmodifiableList(hobbies);
  }

  public void setHobbies(String hobby) {
    hobbies.add(hobby);
  }

  
}
