package ru.eleron.osa.lris.otcenka;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartApp extends Application {

    private static final Logger log = LogManager.getLogger();

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration/springContext.xml");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Parent root = new AnchorPane();
        primaryStage.setScene(new Scene(root,800,600));
        primaryStage.show();
    }

    @Override
    public void stop(){

    }
}
