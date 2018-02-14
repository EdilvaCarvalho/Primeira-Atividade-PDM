/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 * @author Edilva
 */
public class Calculadora extends MIDlet implements CommandListener{
    
    private Display display;
    private Form formIndex;
    private TextField tFValueA;
    private TextField tFValueB;
    private StringItem sIValue;
    
    private Command cMSum;
    private Command cMSub;
    private Command cMMult;
    private Command cMDiv;
    private Command cMExit;
    
    private Alert alert = new Alert("Alerta", "Preencha todos os campos!", null, AlertType.ALARM);;

    public void startApp() {
        display = Display.getDisplay(this);
        getFormIndex();
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
    
    public void getFormIndex(){
        formIndex = new Form("Calculadora");
        tFValueA = new TextField("Valor1: ", "0", 15, TextField.DECIMAL);
        tFValueB = new TextField("Valor2: ", "0", 20, TextField.DECIMAL);
        sIValue = new StringItem("Resultado: ", "");
        
        cMSum = new Command("+", Command.ITEM, 1);
        cMSub = new Command("-", Command.ITEM, 2);
        cMMult = new Command("x", Command.ITEM, 3);
        cMDiv = new Command("/", Command.ITEM, 4);
        cMExit = new Command("Sair", Command.EXIT, 1);
        
        formIndex.append(tFValueA);
        formIndex.append(tFValueB);
        formIndex.append(sIValue);
        
        formIndex.addCommand(cMSum);
        formIndex.addCommand(cMSub);
        formIndex.addCommand(cMMult);
        formIndex.addCommand(cMDiv);
        formIndex.addCommand(cMExit);
        
        display.setCurrent(formIndex);
        formIndex.setCommandListener(this);
    }

    public void commandAction(Command c, Displayable d) {
        if (c == cMExit) {
            destroyApp(true);
            notifyDestroyed();
        } else if (c == cMSum) {
            if (verificaCampos()) {
                alert.setTimeout(Alert.FOREVER);
                display.setCurrent(alert);
            } else {
                sIValue.setText(String.valueOf(soma(tFValueA.getString(), tFValueB.getString())));
            }
        } else if (c == cMSub) {
            if (verificaCampos()) {
                alert.setTimeout(Alert.FOREVER);
                display.setCurrent(alert);
            } else {
                sIValue.setText(String.valueOf(sub(tFValueA.getString(), tFValueB.getString())));
            }
        } else if (c == cMMult) {
            if (verificaCampos()) {
                alert.setTimeout(Alert.FOREVER);
                display.setCurrent(alert);
            } else {
                sIValue.setText(String.valueOf(mult(tFValueA.getString(), tFValueB.getString())));
            }
        } else {
            if (verificaCampos()) {
                alert.setTimeout(Alert.FOREVER);
                display.setCurrent(alert);
            } else {
                sIValue.setText(String.valueOf(div(tFValueA.getString(), tFValueB.getString())));
            }
        }
    }

    private int soma(String valueA, String valueB) {
        int soma = Integer.parseInt(valueA) + Integer.parseInt(valueB);
        return soma;
    }

    private int sub(String valueA, String valueB) {
        int sub = Integer.parseInt(valueA) - Integer.parseInt(valueB);
        return sub;
    }

    private int mult(String valueA, String valueB) {
        int mult = Integer.parseInt(valueA) * Integer.parseInt(valueB);
        return mult;
    }

    private int div(String valueA, String valueB) {
        int div = Integer.parseInt(valueA) / Integer.parseInt(valueB);
        return div;
    }
    
    private boolean verificaCampos() {
        if(tFValueA.getString().equals("") || tFValueB.getString().equals("")) {
            return true;
        }
        return false;
    }
}
