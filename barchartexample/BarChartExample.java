/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barchartexample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

/**
 *
 * @author Lanie
 */
public class BarChartExample extends Application {
    final static String project = "Projects";
    final static String  quiz = "Quiz";
    final static String midterm = "Midterm";
    final static String finalExam = "Final";

    
    @Override
    public void start(Stage primaryStage) {
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        
        final BarChart<String,Number> bc = new BarChart<String,Number>(xAxis,yAxis);
        
        bc.setTitle("Grades");
        xAxis.setLabel("Overall Grade Catagories"); 
        yAxis.setLabel("Grade %");
        
        XYChart.Series series = new XYChart.Series();
        series.setName("Class of 2018");       
        series.getData().add(new XYChart.Data(project, 20));
        series.getData().add(new XYChart.Data(quiz, 10));
        series.getData().add(new XYChart.Data(midterm, 30));
        series.getData().add(new XYChart.Data(finalExam, 40));
        
        
        

        Scene scene  = new Scene(bc,800,600);
        bc.getData().addAll(series);
        
        scene.getStylesheets().add("barchartstyle.css");
        
        primaryStage.setTitle("Bar chart");
        primaryStage.setScene(scene);
        primaryStage.show();

        
       
        };
        
        
    }

    
    

