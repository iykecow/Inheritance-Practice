public class Main
{
  public static void main(String [] args)
  {
    Person bob = new Person("Coach Bob", 27, "M");
    System.out.println(bob);

    Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
    System.out.println(lynne);

    Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
    System.out.println(mrJava);

    College_Student ima = new College_Student("Ima Frosh", 18, "F", "UCB123",
    4.0, 1, "English");
    System.out.println(ima);

    Parent lena = new Parent("Lena Brooke", 27, "F", "Principal", 2);
    System.out.println(lena);

    
  }
}
