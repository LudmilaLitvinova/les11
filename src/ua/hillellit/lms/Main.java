package ua.hillellit.lms;

import java.util.ArrayList;
import java.util.List;
import ua.hillellit.lms.models.CollectionMethods;
import ua.hillellit.lms.phonebook.TelephoneBook;
import ua.hillellit.lms.phonebook.TelephoneEntry;

public class Main {

  public static void main(String[] args) {
    CollectionMethods cm = new CollectionMethods();
    List<String> listOfStr = new ArrayList<>();
    listOfStr.add("One");
    listOfStr.add("Two");
    listOfStr.add("Three");
    listOfStr.add("Four");
    listOfStr.add("Five");
    listOfStr.add("Six");
    listOfStr.add("Seven");
    listOfStr.add("Eight");
    listOfStr.add("Nine");
    listOfStr.add("Eight");
    listOfStr.add("Seven");
    listOfStr.add("Six");
    listOfStr.add("Five");
    listOfStr.add("Four");
    listOfStr.add("Three");
    System.out.println("Count occurrence: ");
    System.out.println(cm.countOccurrence(listOfStr, "Seven"));

    System.out.println("------------------");
    int[] arr = {1, 2, 3};
    System.out.println("List " + cm.toList(arr));

    System.out.println("------------------");
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(1);
    list.add(2);
    System.out.println("Set " + cm.findUnique(list));

    System.out.println("------------------");
    System.out.println(cm.calcOccurrence(listOfStr));

    System.out.println("------------------");
    System.out.println(cm.findOccurrence(listOfStr));

    TelephoneBook telephoneBook = new TelephoneBook();
    TelephoneEntry ab1 = new TelephoneEntry("Danya", "5632568");
    TelephoneEntry ab2 = new TelephoneEntry("Tanya", "09893778");
    TelephoneEntry ab3 = new TelephoneEntry("Danya", "99876686");
    telephoneBook.add(ab1);
    telephoneBook.add(ab2);
    telephoneBook.add(ab3);

    System.out.println("------------------");
    System.out.println(telephoneBook.find("Danya"));

    System.out.println("------------------");
    System.out.println(telephoneBook.findAll("Danya"));
  }
}