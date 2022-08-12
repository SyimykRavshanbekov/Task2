package SortingStudent;

import java.util.Random;
import java.util.Scanner;
public class Main {
    /*Syimyk, Argen Iraliev, Ayperi, Bakai, Burulai, Kerezbek, Milana, Mirgul, Nuraiym, Nurislam Nurkanov, Nurlan, Nursultan Osorov, Oroz, Samarbek, Zhazgul, Nursultan Zhumataev, Azimbek, Aidana, Baisalbek, Argen Abdymomunov, Jumgalbek, Kasiet, Mahamatjan, Kairat, Nurislam, Nurkyz, Nurtilek, Eldiar, Aktan, Erjan, Aibek, Iskender, Ruslan, Ramazan, Bektemir, Narboto, Ali, Nurjigit, Altylbek, Kylym, Azamat*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String names = scanner.nextLine();
        String[] namesArray = names.split(", ");
        Student[] students = new Student[40];
        Mentor[] mentors = {new Mentor("Zhanarbek"), new Mentor("Muhammed"), new Mentor("Nurbek"), new Mentor("Mukhamed")};
        allMethods(namesArray, students, mentors);

    }
    static void allMethods(String[] names, Student[] studentsArray, Mentor[] mentors){
        Random rd = new Random();
        for (int i = 0; i < studentsArray.length; i++) {
            Student student = new Student(names[i]);
            studentsArray[i] = student;
        }

        for (int i = 0, counter = 0; i < studentsArray.length; i++) {
            if (i==10){
                i=0;
            }
            int num = rd.nextInt(0, 4);
            if (mentors[num].students[i] == null) {
                mentors[num].addStudents(studentsArray[counter]);
                counter++;
            }
            if (counter==40){
                break;
            }
        }

        for (Mentor mentor : mentors) {
            mentor.getStudentsName();
        }
    }
}
