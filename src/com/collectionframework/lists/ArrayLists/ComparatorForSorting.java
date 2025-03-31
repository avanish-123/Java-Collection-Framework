package com.collectionframework.lists.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorForSorting {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(30);
        numberList.add(20);
        // using lambda expression 
        numberList.sort((a, b) -> b-a);

        System.out.println(numberList);

        List<String> stringList = Arrays.asList( "Chandra", "Avi", "Pandey");
        stringList.sort(new stringLengthComparator());
        System.out.println(stringList);






        // Sort a custom object on the basis of GPA property
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Avanish", 3.9));
        studentList.add(new Student("Arun", 3.3));
        studentList.add(new Student("Shivam", 3.5));
        studentList.add(new Student("Himanshu", 3.4));


        // sort on the basis of name length
        // studentList.sort((a, b) -> a.name.length() - b.name.length());


        // Sort on the basis of GPA
        studentList.sort(new studentGpaComparator());


        for(Student s: studentList){
            System.out.println(s.name+ " "+ s.GPA);
        }



    }

}




// asc order sort on the basis of string length
class stringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
    
}




class Student {
    public String name;
    public double GPA;
    public Student(String name, double GPA){
        this.name = name;
        this.GPA = GPA;
    }
}

class studentGpaComparator implements Comparator<Student> {
    
    @Override
    public int compare(Student o1, Student o2) {
        if(o2.GPA - o1.GPA>0){
            return -1;
        }else if(o1.GPA - o2.GPA==0){
            return 0;
        }else {
            return 1;
        }
        
    }
}
