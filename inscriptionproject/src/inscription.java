import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDlet;

public class inscription extends MIDlet implements CommandListener {
    private Display display;
    private Form registrationForm;
    private TextField usernameField;
    private TextField passwordField;
    private Command registerCommand;
    private Command exitCommand;

    public inscription() {
        display = Display.getDisplay(this);
        registrationForm = new Form("Registration Form");
        usernameField = new TextField("Username:", "", 20, TextField.ANY);
        passwordField = new TextField("Password:", "", 20, TextField.PASSWORD);
        registerCommand = new Command("Register", Command.OK, 1);
        exitCommand = new Command("Exit", Command.EXIT, 2);

        registrationForm.append(usernameField);
        registrationForm.append(passwordField);
        registrationForm.addCommand(registerCommand);
        registrationForm.addCommand(exitCommand);
        registrationForm.setCommandListener(this);
    }

    public void startApp() {
        display.setCurrent(registrationForm);
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable d) {
        if (c == registerCommand) {
            String username = usernameField.getString();
            String password = passwordField.getString();
            displayRegistrationInfo(username, password);
        } else if (c == exitCommand) {
            notifyDestroyed();
        }
    }

    private void displayRegistrationInfo(String username, String password) {
        Form infoForm = new Form("Registration Info");
        StringItem usernameItem = new StringItem("Username:", username);
        StringItem passwordItem = new StringItem("Password:", password);
        infoForm.append(usernameItem);
        infoForm.append(passwordItem);
        display.setCurrent(infoForm);
    }
}
