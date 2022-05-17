import java.io.IOException;

class Main {
  
  public static void wyczysc(){
    //wyczyszczenie ekranu
    System.out.print("\033[H\033[2J");
    System.out.flush();
    //-----------------
  }
  
  public static void main(String[] args) {
    try {
      Service1 s = new Service1();
      s.addStudent(new Student("Krzysztof", 20));
      s.addStudent(new Student("Janusz", 40));

      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
    } catch (IOException e) {

    }
  }
}