package com.sda.timea.clientmanager.view;

import com.sda.timea.clientmanager.service.ClientDisplayService;
import javafx.application.Application;
import javafx.stage.Stage;

public class ClientManagerMainView extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void init() throws Exception {

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ClientDisplayService clientDisplayService = new ClientDisplayService();
        primaryStage.setTitle("Home");
        primaryStage.setWidth(800);
        primaryStage.setHeight(400);
        primaryStage.setX(400);
        primaryStage.setY(300);


        primaryStage.show();
        //NU FOLOSIM DAO IN VIEW
    }

}
