package com.example.programovani;

import java.util.LinkedList;
import java.util.List;


public class Student {
   private List<Subject> subjects = new LinkedList<>();
   private String name;

   public Student(String name, String surname) {
      this.name = name;
      this.surname = surname;
   }

   public List<Subject> getSubjects() {
      return subjects;
   }

   public void setSubjects(List<Subject> subjects) {
      this.subjects = subjects;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getSurname() {
      return surname;
   }

   public void setSurname(String surname) {
      this.surname = surname;
   }

   private String surname;

   @Override
   public String toString() {
      return "Student{" +
              "subjects=" + subjects +
              ", name='" + name + '\'' +
              ", surname='" + surname + '\'' +
              '}';
   }
   public String both (){
      return name+" "+surname;
   }
}
