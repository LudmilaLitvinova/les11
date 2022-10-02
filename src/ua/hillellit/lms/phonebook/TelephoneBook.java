package ua.hillellit.lms.phonebook;

import java.util.ArrayList;
import java.util.List;

public class TelephoneBook {

  List<TelephoneEntry> entryList = new ArrayList<>();

  public void add(TelephoneEntry entry) {
    entryList.add(entry);
  }

  public TelephoneEntry find(String name) {
    for (TelephoneEntry ent : entryList) {
      if (ent.getName() == name) {
        return ent;
      }
    }
    return null;
  }

  public List<TelephoneEntry> findAll(String name) {

    List<TelephoneEntry> list = new ArrayList<>();
    for (TelephoneEntry ent : entryList) {
      if (ent.getName() == name) {
        list.add(ent);
      }
    }
    return list;
  }
}
