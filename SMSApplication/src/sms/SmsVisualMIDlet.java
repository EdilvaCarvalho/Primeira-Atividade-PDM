/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import org.netbeans.microedition.lcdui.SplashScreen;
import org.netbeans.microedition.lcdui.WaitScreen;
import org.netbeans.microedition.lcdui.wma.SMSComposer;
import org.netbeans.microedition.util.SimpleCancellableTask;

/**
 * @author Edilva
 */
public class SmsVisualMIDlet extends MIDlet implements CommandListener {
    
    private boolean midletPaused = false;

//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private SplashScreen splashScreen;
    private SMSComposer smsComposer;
    private WaitScreen waitScreen;
    private Alert alert;
    private Alert alert1;
    private Command exitCommand;
    private SimpleCancellableTask task;
//</editor-fold>//GEN-END:|fields|0|
    /**
     * The SmsVisualMIDlet constructor.
     */
    public SmsVisualMIDlet() {
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application. It is called only once when the MIDlet is
     * started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {
//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
}//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {
//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
switchDisplayable(null, getSplashScreen());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
}//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {
//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
}//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code>
     * instance is taken from <code>getDisplay</code> method. This method is
     * used by all actions in the design for switching displayable.
     *
     * @param alert the Alert which is temporarily set to the display; if
     * <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {
//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
}//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a
     * particular displayable.
     *
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {
//GEN-END:|7-commandAction|0|7-preCommandAction
 // write pre-action user code here
if (displayable == smsComposer) {//GEN-BEGIN:|7-commandAction|1|19-preAction
            if (command == SMSComposer.SEND_COMMAND) {//GEN-END:|7-commandAction|1|19-preAction
 // write pre-action user code here
switchDisplayable(null, getWaitScreen());//GEN-LINE:|7-commandAction|2|19-postAction
 // write post-action user code here
} else if (command == exitCommand) {//GEN-LINE:|7-commandAction|3|30-preAction
                // write pre-action user code here
exitMIDlet();//GEN-LINE:|7-commandAction|4|30-postAction
                // write post-action user code here
}//GEN-BEGIN:|7-commandAction|5|16-preAction
} else if (displayable == splashScreen) {
    if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|5|16-preAction
 // write pre-action user code here
switchDisplayable(null, getSmsComposer());//GEN-LINE:|7-commandAction|6|16-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|7|24-preAction
} else if (displayable == waitScreen) {
    if (command == WaitScreen.FAILURE_COMMAND) {//GEN-END:|7-commandAction|7|24-preAction
 // write pre-action user code here
switchDisplayable(getAlert1(), getSmsComposer());//GEN-LINE:|7-commandAction|8|24-postAction
 // write post-action user code here
} else if (command == WaitScreen.SUCCESS_COMMAND) {//GEN-LINE:|7-commandAction|9|23-preAction
 // write pre-action user code here
switchDisplayable(getAlert(), getSmsComposer());//GEN-LINE:|7-commandAction|10|23-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|11|7-postCommandAction
        }//GEN-END:|7-commandAction|11|7-postCommandAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|12|
//</editor-fold>//GEN-END:|7-commandAction|12|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: splashScreen ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initialized instance of splashScreen component.
     *
     * @return the initialized component instance
     */
    public SplashScreen getSplashScreen() {
        if (splashScreen == null) {
//GEN-END:|14-getter|0|14-preInit
 // write pre-init user code here
splashScreen = new SplashScreen(getDisplay());//GEN-BEGIN:|14-getter|1|14-postInit
            splashScreen.setTitle("SMS");
            splashScreen.setCommandListener(this);
            splashScreen.setText("SMS Composer");//GEN-END:|14-getter|1|14-postInit
 // write post-init user code here
}//GEN-BEGIN:|14-getter|2|
        return splashScreen;
    }
//</editor-fold>//GEN-END:|14-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: smsComposer ">//GEN-BEGIN:|17-getter|0|17-preInit
    /**
     * Returns an initialized instance of smsComposer component.
     *
     * @return the initialized component instance
     */
    public SMSComposer getSmsComposer() {
        if (smsComposer == null) {
//GEN-END:|17-getter|0|17-preInit
 // write pre-init user code here
smsComposer = new SMSComposer(getDisplay());//GEN-BEGIN:|17-getter|1|17-postInit
            smsComposer.setTitle("Compose SMS");
            smsComposer.addCommand(SMSComposer.SEND_COMMAND);
            smsComposer.addCommand(getExitCommand());
            smsComposer.setCommandListener(this);
            smsComposer.setBGColor(-3355444);
            smsComposer.setFGColor(-16777216);
            smsComposer.setSendAutomatically(false);
            smsComposer.setPhoneNumberLabel("Phone Number:");
            smsComposer.setMessageLabel("Message:");//GEN-END:|17-getter|1|17-postInit
 // write post-init user code here
}//GEN-BEGIN:|17-getter|2|
        return smsComposer;
    }
//</editor-fold>//GEN-END:|17-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: waitScreen ">//GEN-BEGIN:|20-getter|0|20-preInit
    /**
     * Returns an initialized instance of waitScreen component.
     *
     * @return the initialized component instance
     */
    public WaitScreen getWaitScreen() {
        if (waitScreen == null) {
//GEN-END:|20-getter|0|20-preInit
 // write pre-init user code here
waitScreen = new WaitScreen(getDisplay());//GEN-BEGIN:|20-getter|1|20-postInit
            waitScreen.setTitle("waitScreen");
            waitScreen.setCommandListener(this);
            waitScreen.setTask(getTask());//GEN-END:|20-getter|1|20-postInit
 // write post-init user code here
}//GEN-BEGIN:|20-getter|2|
        return waitScreen;
    }
//</editor-fold>//GEN-END:|20-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: alert ">//GEN-BEGIN:|26-getter|0|26-preInit
    /**
     * Returns an initialized instance of alert component.
     *
     * @return the initialized component instance
     */
    public Alert getAlert() {
        if (alert == null) {
//GEN-END:|26-getter|0|26-preInit
 // write pre-init user code here
alert = new Alert("OK", "A mensagem foi enviada com sucesso!", null, null);//GEN-BEGIN:|26-getter|1|26-postInit
            alert.setTimeout(Alert.FOREVER);//GEN-END:|26-getter|1|26-postInit
 // write post-init user code here
}//GEN-BEGIN:|26-getter|2|
        return alert;
    }
//</editor-fold>//GEN-END:|26-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: alert1 ">//GEN-BEGIN:|27-getter|0|27-preInit
    /**
     * Returns an initialized instance of alert1 component.
     *
     * @return the initialized component instance
     */
    public Alert getAlert1() {
        if (alert1 == null) {
//GEN-END:|27-getter|0|27-preInit
 // write pre-init user code here
alert1 = new Alert("Error", "Erro", null, null);//GEN-BEGIN:|27-getter|1|27-postInit
            alert1.setTimeout(Alert.FOREVER);//GEN-END:|27-getter|1|27-postInit
 // write post-init user code here
}//GEN-BEGIN:|27-getter|2|
        return alert1;
    }
//</editor-fold>//GEN-END:|27-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: task ">//GEN-BEGIN:|25-getter|0|25-preInit
    /**
     * Returns an initialized instance of task component.
     *
     * @return the initialized component instance
     */
    public SimpleCancellableTask getTask() {
        if (task == null) {
//GEN-END:|25-getter|0|25-preInit
 // write pre-init user code here
task = new SimpleCancellableTask();//GEN-BEGIN:|25-getter|1|25-execute
            task.setExecutable(new org.netbeans.microedition.util.Executable() {
                public void execute() throws Exception {//GEN-END:|25-getter|1|25-execute
// write task-execution user code here
    smsComposer.sendSMS();
                }//GEN-BEGIN:|25-getter|2|25-postInit
            });//GEN-END:|25-getter|2|25-postInit
 // write post-init user code here
}//GEN-BEGIN:|25-getter|3|
        return task;
    }
//</editor-fold>//GEN-END:|25-getter|3|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|29-getter|0|29-preInit
    /**
     * Returns an initialized instance of exitCommand component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {
//GEN-END:|29-getter|0|29-preInit
 // write pre-init user code here
exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|29-getter|1|29-postInit
 // write post-init user code here
}//GEN-BEGIN:|29-getter|2|
        return exitCommand;
    }
//</editor-fold>//GEN-END:|29-getter|2|

    /**
     * Returns a display instance.
     *
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started. Checks whether the MIDlet have been
     * already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     *
     * @param unconditional if true, then the MIDlet has to be unconditionally
     * terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }
    
}
