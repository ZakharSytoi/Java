package org.example;

import java.io.*;

public class Student implements Serializable{
    private String name;
    private String surname;
    private String email;

    private transient String password;

    public Student(String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void writeStudent() {
        File file = new File("src/main/resources/student.bin");
        try {
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.close();
        } catch (IOException e) {
            System.out.println("Problem with file");
        }

    }
    public static Student readStudent(){
        File file = new File("src/main/resources/student.bin");
        Student result = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            result = (Student) ois.readObject();
            ois.close();
        } catch (IOException e) {
            System.out.println("Problem with file");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;
    }


}
