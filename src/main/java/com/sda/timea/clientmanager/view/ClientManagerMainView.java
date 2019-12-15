package com.sda.timea.clientmanager.view;

import com.sda.timea.clientmanager.model.Client;
import com.sda.timea.clientmanager.service.ClientDisplayService;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ClientManagerMainView extends Application {

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

        ListView<String> listView = new ListView<>();
        ObservableList<String> items = listView.getItems();
        for(Client client : clientDisplayService.getAllClients()) {
            items.add(client.getClientName());
            items.add(client.getPhoneNo());
        }
        VBox vBox = new VBox();
        vBox.getChildren().add(listView);
        Scene scene = new Scene(vBox);
        clientDisplayService.getAllClients();


        primaryStage.setScene(scene);
        primaryStage.show();
        //NU FOLOSIM DAO IN VIEW
    }

}
