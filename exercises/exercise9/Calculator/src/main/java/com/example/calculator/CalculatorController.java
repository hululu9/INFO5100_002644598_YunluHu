package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField firstInput;

    @FXML
    private TextField secondInput;

    @FXML
    private Button plusButton;

    @FXML
    private Button minusButton;

    @FXML
    private Button mutipleButton;

    @FXML
    private Button divisionButton;

    @FXML
    private Label resultLabel;

    @FXML
    void operatorButtonAction(ActionEvent event) {

        double firstOperand = Double.parseDouble(firstInput.getText());
        double secondOperand = Double.parseDouble(secondInput.getText());
        double result = 0;

        if (event.getSource() == plusButton) {
            result = firstOperand + secondOperand;
            resultLabel.setText(Double.toString(result));
        }

        if (event.getSource() == minusButton) {
            result = firstOperand - secondOperand;
            resultLabel.setText(Double.toString(result));
        }

        if (event.getSource() == mutipleButton) {
            result = firstOperand * secondOperand;
            resultLabel.setText(Double.toString(result));
        }

        if (event.getSource() == divisionButton) {
            result = firstOperand / secondOperand;
            resultLabel.setText(Double.toString(result));
        }

    }

    @FXML
    void clearButtonAction(ActionEvent event) {
        firstInput.setText("");
        secondInput.setText("");
        resultLabel.setText("?");
    }

}
