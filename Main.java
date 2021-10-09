import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    ArrayList<Double> al = new ArrayList<Double>();

    Student student1 = new Student();

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering\n");

// or can do this with the dot operator
    //student1.name = "Arnold Spielberg";
    //student1.gpa = 4.0;
    //student1.major = "Electrical Engineering";

    student1.print();

    Student student2 = new Student();

    student2.name = "Parker Cann";
    student2.gpa = 4.3;
    student2.major = "Information Systems\n";

    student2.print();

    al.add(student1.gpa);
    al.add(student2.gpa);

    double sumOfGPA = 0;
    double avgGPA = 0;

    for( int index = 0; index < al.size(); index++){
      sumOfGPA += al.get(index);
    }

    avgGPA = sumOfGPA / al.size();

    System.out.println("The average GPA is " + avgGPA);
     

  }
}