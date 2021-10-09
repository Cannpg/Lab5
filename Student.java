class Student {
  String name;
  double gpa;
  String major;

  String getName() {
    return name;
  }

  double getGPA() {
    return gpa;
  }

  String getMajor() {
    return major;
  }

  void setName(String theName) {
    name = theName;
  }

  void setGPA(double theGPA) {
    gpa = theGPA;
  }

  void setMajor(String theMajor) {
    major = theMajor;
  }

  void print(){
      System.out.println("This student's name is " + name);
      System.out.println("This student's GPA is " + gpa);
      System.out.println("This student's major is " + major);
    }
}