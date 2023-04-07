import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Students {
    int Id;
    String Name;
    double Score;
    int numberStudents;

    //libary JAVA
    Scanner scanner = new Scanner(System.in);
    // Students studentsList[]= new Students[numberStudents];
    List<Students> studentsList = new ArrayList<Students>(numberStudents);


    public Students() {

    }

    public Students(int Id, String Name, double Score) {
        super();
        this.Id = Id;
        this.Name = Name;
        this.Score = Score;
    }

    @Override
    public String toString() {
        return "Student [MSSV " + Id + ", Ten sinh vien " + Name + ", Diem so " + Score + "]";
    }

    public void Input() {

        System.out.println("Nhap so luong sinh vien");
        numberStudents = scanner.nextInt();

        for(int i =0; i<numberStudents ; i++){
            System.out.println("Nhap MSSV:");
            int Id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhap ten sinh vien:");
            String Name = scanner.nextLine();
            System.out.println("Nhap diem so:");
            double Score = scanner.nextDouble();    

            Students students = new Students(Id , Name , Score);
            studentsList.add(students);
        }       
    }

    public void StudentsList(){
        System.out.println("Danh sach sinh vien");

        for(int i =0; i < studentsList.size() ; i++){
            System.out.println(studentsList.toString());
         }
    }

}
