package ru.eleron.osa.lris.otcenka;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.IOException;

public class StartApp extends Application {

    private static final Logger log = LogManager.getLogger();

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springContext.xml");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Parent root = null;
        try {
            root = FXMLLoader.load(StartApp.class.getClassLoader().getResource("view/TestPage.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setScene(new Scene(root,800,600));
        primaryStage.show();
    }

    @Override
    public void stop(){

    }
}
