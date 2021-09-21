package com.ashwin.compfuture;

import javafx.application.Application;

public class Main {
    public static void main(String[] args) {
        System.out.println("comp-future: main: " + Thread.currentThread().getName());
        Application.launch(MyApplication.class, args);
    }
}
