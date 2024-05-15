import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner scanner = new Scanner(System.in);
      boolean wybor = true;

      while (wybor) {
        System.out.println("Menu:");
        System.out.println("1. Dodaj nowego studenta");
        System.out.println("2. Wypisz wszystkich studentów");
        System.out.println("3. Wyjście");
        System.out.print("Wybierz opcję: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
          case 1:
            System.out.println("Dodaj nowego studenta:");
            System.out.print("Imię: ");
            String name = scanner.next();
            System.out.print("nazwisko: ");
            String surname = scanner.next();
            System.out.print("Wiek: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            s.addStudent(new Student(name, surname, age));
            break;
          case 2:
            var students = s.getStudents();
            for (Student current : students) {
              System.out.println(current.ToString());
            }
            break;
          case 3:
            wybor = false;
            System.out.println("zły wybór");
            break;
          default:
            System.out.println("Niepoprawny wybór. Spróbuj ponownie.");
            break;
        }
      }
    } catch (IOException e) {

    }
  }
}
