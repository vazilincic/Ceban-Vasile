package com.company;
public class Main {
    public static void main(String[] args) {
        university university1 = new university();
        university1.name = "UTM";
        university1.foundationYear = 1964;
        university1.students = new students[3];
        students student000 = new students("Ceban Vasile", 19, 7.5f);
        students student001 = new students("Cernei Andrei", 20, 9.5f);
        students student010 = new students("Cernei Andrei", 20, 9.5f);
        university1.students = new students[]{student000,student001,student010};
        university university2 = new university();
        university2.name = "USMF";
        university2.foundationYear = 1945;
        university2.students = new students[3];
        students student011 = new students("Cazacu Ionel", 25, 5.8f);
        students student100 = new students("Iurie Cius", 23, 9.9f);
        students student101 = new students("Iurie Cius", 23, 9.9f);
        university2.students = new students[]{student011,student100,student101};
        university university3 = new university();
        university3.name = "USM";
        university3.foundationYear = 1946;
        university3.students = new students[3];
        students student110 = new students("Dragan Paula", 18, 9.5f);
        students student111 = new students("Schitco Ivan", 23, 8.9f);
        students student0000 = new students("Schitco Ivan", 23, 8.9f);
        university3.students = new students[]{student110, student111,student0000};
        university[] univ = new university[]{university1, university2, university3};
        float sum = 0;
        int n = 0;
        for (university i : univ) {
            for (students j : i.students) {
                sum += j.mark;
                n++;
            }
        }
        System.out.println(sum / n);
    }
}
