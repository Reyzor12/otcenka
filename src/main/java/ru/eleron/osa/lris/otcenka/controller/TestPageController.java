package ru.eleron.osa.lris.otcenka.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.springframework.beans.factory.annotation.Autowired;
import ru.eleron.osa.lris.otcenka.logic.implementation.TestDaoImplementation;

public class TestPageController {

    @Autowired
    private TestDaoImplementation testDaoImplementation;

    @FXML
    private Button button;

    @FXML
    private Label label;

    @FXML
    private void initialize(){
        System.out.println("Hello World");
    }

    @FXML
    private void changeLabel(){
        System.out.println(testDaoImplementation == null);
        label.setText(testDaoImplementation.getTestById(1l).getText());
    }
}
