package com.ashwin.compfuture;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class HomeController {
    private WordRepository wordRepository = new WordRepository();

    @FXML
    public void handleTestButton(ActionEvent actionEvent) {
        System.out.println("comp-future: handleTestButton on thread: " + Thread.currentThread().getName());

        Executor guiExecutor = new Executor() {
            @Override
            public void execute(Runnable command) {
                Platform.runLater(command);
            }
        };

        CompletableFuture.supplyAsync(() -> {
                System.out.println("comp-future: supplyAsync on thread: " + Thread.currentThread().getName());
                return wordRepository.getWords();
            })
            .thenAcceptAsync(words -> {
                System.out.println("comp-future: thenAcceptAsync( " + words + " ) on thread: " + Thread.currentThread().getName());
            }, guiExecutor);
    }
}
