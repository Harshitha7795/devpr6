package cse.prg2;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        Student s = new Student("Harsh", 21);
        Gson gson = new Gson();
        String json = gson.toJson(s);
        System.out.println("Student JSON: " + json);
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
