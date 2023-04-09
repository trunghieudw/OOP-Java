
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    int Id;
    String Name;
    double Score;
    String Rank;
    int Pass = 0;
    int Failed = 0;
    int numberStudents;

    // libary JAVA
    Scanner scanner = new Scanner(System.in);
    // Students studentsList[]= new Students[numberStudents];
    List<Students> studentsList = new ArrayList<Students>(numberStudents);

    public Students() {

    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setPass(int pass) {
        Pass = pass;
    }

    public int getPass() {
        return Pass;
    }

    public void setFailed(int failed) {
        Failed = failed;
    }

    public int getFailed() {
        return Failed;
    }

//    public Student(int Id, String Name, double Score) {
//
//        this.setId(Id);
//        this.setName(Name);
//        this.setScore(Score);
//        this.StudentsRank();
//    }
    
    

    @Override
    public String toString() {
        return "Student [MSSV: " + Id + ", Ten sinh vien: " + Name + ", Diem so: " + Score + ", Xep Loai: " + Rank + "]";
    }

    public Students(int id, String name, double score) {
	super();
	Id = id;
	Name = name;
	Score = score;
	this.StudentsRank();
}

	public void Input() {

        System.out.println("Nhap so luong sinh vien");
        numberStudents = scanner.nextInt();

        for (int i = 0; i < numberStudents; i++) {
            System.out.println("Nhap MSSV:");
            int Id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhap ten sinh vien:");
            String Name = scanner.nextLine();
            System.out.println("Nhap diem so:");
            double Score = scanner.nextDouble();

            Students student = new Students(Id, Name, Score);
            studentsList.add(student);
        }
    }


    
    public void StudentsList() {
        System.out.println("Danh sach sinh vien");

        for (int i = 0; i < studentsList.size(); i++) {
            Students s = studentsList.get(i);
            System.out.println(s.toString());
            if (s.Score < 5) {
                Failed++;
            } else {
                Pass++;
            }
        }
        this.DauRotStudents(studentsList);
    }


    public void StudentsRank() {

        if (Score >= 0 && Score <= 10) {
            if (Score >= 4 && Score < 5.5) {

                Rank = "Yeu";
                Failed++;
            } else if (Score >= 5.5 && Score < 7) {
                Rank = "Trung binh";
                Pass++;
            }

            else if (Score >= 7 && Score < 8.5) {
                Rank = "Kha";
                Pass++;

            } else if (Score >= 8.5 && Score < 9.5) {
                Rank = "Gioi";
                Pass++;
            } else if (Score >= 9.5) {
                Rank = "Xuat sac";
                Pass++;
            } else {
                Rank = "Kem";
                Failed++;
            }

        } else {
            Rank = "Khong xac dinh";
        }

    }

//    public void DauRotStudents(List<Student> studentsList) {
//
//        if (!studentsList.isEmpty()) {
//            int lastIndex = studentsList.size() - 1;
//            Student lastElement = studentsList.get(lastIndex);
//            System.out.println("So sinh vien dau " + lastElement.Pass);
//            System.out.println("So sinh vien rot " + lastElement.Failed);
//
//        } else {
//            System.out.println("ArrayList rỗng:");
//        }
//    }
    
    public void DauRotStudents(List<Students> studentsList) {
        if (!studentsList.isEmpty()) {
            int totalStudents = studentsList.size();
            int totalPassed = 0;
            for (Students s : studentsList) {
                if (s.Score >= 5) {
                    totalPassed++;
                }
            }
            int totalFailed = totalStudents - totalPassed;
//          double passPercentage = (double)totalPassed / totalStudents * 100;
//          double failPercentage = (double)totalFailed / totalStudents * 100;
            System.out.println("So sinh vien dau: " + totalPassed);
            System.out.println("So sinh vien rot: " + totalFailed);
        } else {
            System.out.println("Danh sach sinh vien rong");
        }
    }




}