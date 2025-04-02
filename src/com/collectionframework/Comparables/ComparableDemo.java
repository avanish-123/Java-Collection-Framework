package com.collectionframework.Comparables;

import java.util.ArrayList;

// Use can assign sorting algo inside class
// In this we can define own way of sorting inside class instead of writing it in function. So in result if we use .sort() method to it will sort the list by given logic without passing any custom comparator
public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        list.add(new student("Avanish", 4.5));
        list.add(new student("Chandra", 3.5));
        list.add(new student("Pandey", 4.9));
        list.sort(null);
        System.out.println(list);
    }
}

class student implements Comparable<student> {
    private double gpa;
    private String name;

    public student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(student o) {
        return o.getGpa() - this.getGpa() > 0 ? -1 : o.getGpa() - this.getGpa() == 0 ? 0 : 1;
    }

    @Override
    public String toString(){
        return this.name + " "+ this.gpa;
    }

}
