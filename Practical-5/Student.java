import java.util.*;

public class Student {
  String name, branch;
  static String university = "Graphic Era Hill University"; // Static keyword is used to provide better memory management
  int ID;

  void setDetails(String nm, String b, int i) {
    name = nm;
    branch = b;
    ID = i;
  }

  void showDetails() {
    System.out.println("Name of student=" + name);
    System.out.println("Branch of student=" + branch);
    System.out.println("University of student=" + university);
    System.out.println("ID of student=" + ID);
  }

  public static void main(String args[]) {
    String nm = "Sachit ";
    String b = "CSE";
    int i = 20011756;
    Student obj = new Student();
    obj.setDetails(nm, b, i);
    obj.showDetails();
  }
}
