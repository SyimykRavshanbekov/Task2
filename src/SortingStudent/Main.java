package SortingStudent;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        Student student1 = new Student("Syimyk", rd.nextInt(16, 50));
        Student student2 = new Student("Argen Iraliev",rd.nextInt(16, 50) );
        Student student3 = new Student("Ayperi",rd.nextInt(16, 50) );
        Student student4 = new Student("Bakai",rd.nextInt(16, 50) );
        Student student5 = new Student("Burulai",rd.nextInt(16, 50) );
        Student student6 = new Student("Kerezbek",rd.nextInt(16, 50) );
        Student student7 = new Student("Milana",rd.nextInt(16, 50) );
        Student student8 = new Student("Mirgul",rd.nextInt(16, 50) );
        Student student9 = new Student("Nuraiym",rd.nextInt(16, 50) );
        Student student10 = new Student("Nurislam Nurkanov", rd.nextInt(16, 50));
        Student student11 = new Student("Nurlan",rd.nextInt(16, 50) );
        Student student12 = new Student("Nursultan Osorov",rd.nextInt(16, 50) );
        Student student13 = new Student("Oroz",rd.nextInt(16, 50) );
        Student student14 = new Student("Samarbek",rd.nextInt(16, 50) );
        Student student15 = new Student("Zhazgul",rd.nextInt(16, 50) );
        Student student16 = new Student("Nursultan Zhumataev",rd.nextInt(16, 50) );
        Student student17 = new Student("Azimbek",rd.nextInt(16, 50) );
        Student student18 = new Student("Aidana",rd.nextInt(16, 50) );
        Student student19 = new Student("Baisalbek",rd.nextInt(16, 50) );
        Student student20 = new Student("Argen Abdymomunov",rd.nextInt(16, 50) );
        Student student21 = new Student("Jumgalbek",rd.nextInt(16, 50) );
        Student student22 = new Student("Kasiet",rd.nextInt(16, 50) );
        Student student23 = new Student("Mahamatjan",rd.nextInt(16, 50) );
        Student student24 = new Student("Kairat",rd.nextInt(16, 50) );
        Student student25 = new Student("Nurislam", rd.nextInt(16, 50));
        Student student26 = new Student("Nurkyz",rd.nextInt(16, 50) );
        Student student27 = new Student("Nurtilek", rd.nextInt(16, 50));
        Student student28 = new Student("Ildiar",rd.nextInt(16, 50) );
        Student student29 = new Student("Syimyk",rd.nextInt(16, 50) );
        Student student30 = new Student("Syimyk",rd.nextInt(16, 50) );
        Student student31 = new Student("Syimyk",rd.nextInt(16, 50) );
        Student student32 = new Student("Syimyk",rd.nextInt(16, 50) );
        Student student33 = new Student("Syimyk",rd.nextInt(16, 50) );
        Student student34 = new Student("Syimyk",rd.nextInt(16, 50) );
        Student student35 = new Student("Syimyk",rd.nextInt(16, 50) );
        Student student36 = new Student("Syimyk",rd.nextInt(16, 50) );
        Student student37 = new Student("Syimyk",rd.nextInt(16, 50) );
        Student student38 = new Student("Syimyk",rd.nextInt(16, 50) );
        Student student39 = new Student("Syimyk",rd.nextInt(16, 50) );
        Student student40 = new Student("Syimyk", rd.nextInt(16, 50));

        Student[] studentsArray = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10,
                student11, student12, student13, student14, student15, student16, student17, student18, student19, student20, student21, student22, student23,
                student24, student25, student26, student27, student28, student29, student30, student31, student32, student33, student34, student35, student36, student37,
                student38, student39, student40};


        Mentor mentor1 = new Mentor("Zhanarbek", 20);
        Mentor mentor2 = new Mentor("Muhammed", 20);
        Mentor mentor3 = new Mentor("Nurbek", 20);
        Mentor mentor4 = new Mentor("Mukhamed", 20);
        Mentor[] mentors = {mentor1, mentor2, mentor3, mentor4};

        for (int i = 0; i < studentsArray.length; i++) {
            mentors[rd.nextInt(0,4)].addStudents(studentsArray[i]);
        }

        System.out.println(mentor1.students[1].toString());


//        Student[] studentPart1 = new Student[10];
//        int[] usedNumbers = new int[40];
//        int num = 0;
//        for (int i = 0; i < usedNumbers.length; i++) {
//            usedNumbers[i] = rd.nextInt(0, 40);
//        }
//
//        for (int i = 0; i < usedNumbers.length-30; i++) {
//            studentsArray[usedNumbers[i]] = studentPart1[i];
//        }
//
//        System.out.println(Arrays.toString(usedNumbers));
//


//        int number = 0;
//        for (int i = 0; i < 10; i++) {
//            number = rd.nextInt(0, 40);
//            for (int j = 0; j < studentsArray.length-1; j++) {
//                if (number != usedNumbers[j]){
//                    mentor1.addStudents(studentsArray[number]);
//                }
//            }
//            usedNumbers[i] = number;
//        }
//
//
//        for (int i = 0; i < 10; i++) {
//            number = rd.nextInt(0, 40);
//            for (int j = 0; j < studentsArray.length; j++) {
//                if (number != usedNumbers[j]){
//                    mentor2.addStudents(studentsArray[number]);
//                }
//            }
//            usedNumbers[i] = number;
//        }
//
//        for (int i = 0; i < 10; i++) {
//            number = rd.nextInt(0, 40);
//            for (int j = 0; j < studentsArray.length; j++) {
//                if (number != usedNumbers[j]){
//                    mentor3.addStudents(studentsArray[number]);
//                }
//            }
//            usedNumbers[i] = number;
//        }
//
//        for (int i = 0; i < 10; i++) {
//            number = rd.nextInt(0, 40);
//            for (int j = 0; j < studentsArray.length; j++) {
//                if (number != usedNumbers[j]){
//                    mentor4.addStudents(studentsArray[number]);
//                }
//            }
//            usedNumbers[i] = number;
//        }


//        System.out.println("-------------MENTOR1------------------");
//        System.out.println(mentor1);

    }
}
