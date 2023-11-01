package com.example.programovani;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TextField name;
    @FXML
    private TextField surname;
    @FXML
    private Button save;
    @FXML
    private ChoiceBox<String> subjectChoiceBox;
    @FXML
    private ListView view;
    @FXML
    private TextField grade;

    private List<Student> students = new ArrayList<>();

    public void onSaveButtonClick(){

        String namestr = name.getText();
        String surnamestr = surname.getText();
        students.add(new Student(namestr, surnamestr));
        String gradestr = grade.getText();
        String[] grades = gradestr.split(",");
        List<Integer> marks = new ArrayList<>();
        for (String g: grades) {
            int m = Integer.parseInt(g);
            if(m<=5) {
                marks.add(m);
            }
            else{
                System.out.println("Error");
            }
        }

    Student student = new Student(namestr, surnamestr);
        Subject subject = new Subject();
        String subjectName = subjectChoiceBox.getSelectionModel().getSelectedItem();
        subject.setName(subjectName);
        subject.setMarks(marks);
        student.getSubjects().add(subject);
        System.out.println(student);
        double m = MathUtils.average(marks);
        System.out.println(m);
        view.getItems().add(student.both() +" " + subjectName+" "+m);
        students.add(student);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        subjectChoiceBox.getItems().add("Matematika");
        subjectChoiceBox.getItems().add("Český jazyk");
        subjectChoiceBox.getItems().add("Fyzika");
        subjectChoiceBox.getItems().add("Progravování");
        subjectChoiceBox.getItems().add("Počítačové sítě");
    }
    int n = 0;
    public void chooseSubject(){
        while(n == 0){
            subjectChoiceBox.setValue("Vyberte předmět");
            n = 1;
        }
    }

}