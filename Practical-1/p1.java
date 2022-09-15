/*Create a class “Student” having following instance variables and methods.
Instance variables: ID, Name, Branch and university
Method: setDetails() and showDetails().
The setDetails() method sets the values of ID, Name, Branch and University.
And showDetails() method shows the value of each field.
*/

class Student{
    int ID;
    String Name;
    String Branch;
    String University;
    void setDetails(int id,String n,String b,String u){
     ID=id;
     Name =n;
     Branch=b;
     University=u;
    }
    void showDetails(){
        System.out.println("ID:"+ID+"\nName:"
        +Name+"\nBranch:"+Branch+"\nUniversity:"+University);
    }
    public static void main(String args[]){
        Student s=new Student();
        s.setDetails(20011879, "Sachin Aswal", "CSE", "Graphic Era Hill University");
        s.showDetails();
    }
}
