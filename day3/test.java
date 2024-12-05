package day3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
  public static void main(String[] args) {
    CacheString myMessage = new CacheString();
    CacheInteger myNumber = new CacheInteger();
    CacheAny<Integer> dataString = new CacheAny<>(1);
    dataString.setT(1);
    System.out.println(dataString.getT());
    // Deque<String> listNama = new ArrayDeque<>();
    // Deque<String> listNama2 = new ArrayDeque<>();

    Person person = new Person("Eko");
    person.setHobbies("game");
    person.setHobbies("coding");

    // doSomethingWithHobby(person.getHobbies());

    for (String hobby : person.getHobbies()) {
      System.out.println(hobby);
    }

    // listNama.push("Dev");
    // listNama.push("Joko");
    // listNama.push("Aji");
    // for (String nama : listNama) {
    //   System.out.println(nama);
    // }

    // listNama2.add("Dev");
    // listNama2.add("Joko");
    // listNama2.add("Aji");
    // for (String nama : listNama2) {
    //   System.out.println(nama);
    // }

    // listNama.forEach(nama -> System.out.println(nama));
    // listNama.forEach(System.out::println);

    // Map<String,Object> employees = new HashMap<>();
    // employees.put("101", "Dev");
    // employees.put("102", "Joko");
    // employees.put("103", "Aji");
    // employees.put("104", 1);
    // System.out.println(employees.get("101"));
  }

  // public static void doSomethingWithHobby(List<String> hobbies){
  //   hobbies.add("bukkan hobby");
  // }
}
