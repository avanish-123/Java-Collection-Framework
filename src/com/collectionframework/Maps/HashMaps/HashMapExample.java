package com.collectionframework.Maps.HashMaps;

import java.util.HashMap;
import java.util.Objects;

public class HashMapExample {
    public static void main(String[] args) {
        Student studentOne = new Student(1, "Avanish");
        Student studentTwo = new Student(2, "Chandra");
        Student studentThree = new Student(1, "Pandey");
        HashMap<Student, Integer> students = new HashMap<>();
        students.put(studentOne, 2);
        students.put(studentTwo, 1);
        students.put(studentThree, 2);
        System.out.println(students);

    }

}

class Student {
    private int id;
    private String name;

    public Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return this.id;
    } 
    public String getName(){
        return this.name;
    }


    @Override
    public int hashCode(){
        return Objects.hash(this.id, this.name);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj==  null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Student other = (Student) obj;
        return id==other.id && Objects.equals(name, other.getName());
    }
 }
