package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.event.ActionEvent;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Controller {

    @FXML
    private Button zeroButton;

    @FXML
    private Button oneButton;

    @FXML
    private Button twoButton;

    @FXML
    private Button threeButton;

    @FXML
    private Button fourButton;

    @FXML
    private Button fiveButton;

    @FXML
    private Button sixButton;

    @FXML
    private Button sevenButton;

    @FXML
    private Button eightButton;

    @FXML
    private Button nineButton;




    @FXML
    private Button pointButton;

    @FXML
    private Button equalsButton;

    @FXML
    private Button plusButton;

    @FXML
    private Button minusButton;

    @FXML
    private Button divisionButton;

    @FXML
    private Button multiplicationButton;

    @FXML
    private Button clearButton;


    @FXML
    private TextArea screen;




    @FXML
    private TextArea screen2;

    @FXML
    private Button helloButton;

    @FXML
    private Button timeButton;

    @FXML
    private Button dieButton;




    @FXML
    void showInputZero(ActionEvent event) {
        screen.appendText("0");
    }

    @FXML
    void showInputOne(ActionEvent event) {
        screen.appendText("1");
    }

    @FXML
    void showInputTwo(ActionEvent event) {
        screen.appendText("2");
    }

    @FXML
    void showInputThree(ActionEvent event) {
        screen.appendText("3");
    }

    @FXML
    void showInputFour(ActionEvent event) {
        screen.appendText("4");
    }

    @FXML
    void showInputFive(ActionEvent event) {
        screen.appendText("5");
    }

    @FXML
    void showInputSix(ActionEvent event) {
        screen.appendText("6");
    }

    @FXML
    void showInputSeven(ActionEvent event) {
        screen.appendText("7");
    }

    @FXML
    void showInputEight(ActionEvent event) {
        screen.appendText("8");
    }

    @FXML
    void showInputNine(ActionEvent event) {
        screen.appendText("9");
    }









    @FXML
    void showInputPoint(ActionEvent event) {
        screen.appendText(".");
    }


    @FXML
    void showInputDivision(ActionEvent event) {
        screen.appendText("/");
    }


    @FXML
    void showInputMinus(ActionEvent event) {
        screen.appendText("-");
    }

    @FXML
    void showInputMultiplication(ActionEvent event) {
        screen.appendText("*");
    }

    @FXML
    void showInputPlus(ActionEvent event) {
        screen.appendText("+");
    }





    @FXML
    void Calculate(ActionEvent event) {   // all the calculating happens here

        String input = screen.getText();
        char operation = 'Q';
        int operationAtIndex = 0;


        String[] numbers = new String[2];
        double result = 0;




        screen.appendText("\n");         // newline for bugfixing


        for (int i = 0; i < input.length(); i++) {

            switch (input.charAt(i)) {
                case '+' -> {
                    operation = '+';
                    operationAtIndex = i;
                }
                case '-' -> {
                    operation = '-';
                    operationAtIndex = i;
                }
                case '*' -> {
                    operation = '*';
                    operationAtIndex = i;
                }
                case '/' -> {
                    operation = '/';
                    operationAtIndex = i;
                }
            }

        }



        numbers = input.split(String.valueOf("\\" + operation));

        switch (operation) {
            case '+' -> {
                result = (Double.parseDouble(numbers[0])) + (Double.parseDouble(numbers[1]));
            }
            case '-' -> {
                result = (Double.parseDouble(numbers[0])) - (Double.parseDouble(numbers[1]));
            }
            case '*' -> {
                result = (Double.parseDouble(numbers[0])) * (Double.parseDouble(numbers[1]));
            }
            case '/' -> {
                result = (Double.parseDouble(numbers[0])) / (Double.parseDouble(numbers[1]));
            }
        }

        String stringResult = Double.toString(result);
        screen.appendText(stringResult);

    }


    @FXML
    void clearScreen(ActionEvent event) {
        screen.clear();
    }




    @FXML
    void getTime(ActionEvent event) {
        screen2.clear();
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");

        screen2.appendText(df.format(currentTime));

    }

    @FXML
    void rollDie(ActionEvent event) {
        screen2.clear();
        int randomNum = (int) ((Math.random()*6)+1);
        String stringNum = Integer.toString(randomNum);

        screen2.appendText(stringNum);

    }

    @FXML
    void sayHello(ActionEvent event) {
        screen2.clear();
        screen2.appendText("Hello!");
    }



}
