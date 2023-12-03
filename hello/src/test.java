
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class test extends MIDlet {

  public void startApp() {
    Display.getDisplay(this).setCurrent(new TextBox("","Hello Adnan",20,0));
  }

  public void pauseApp() {
  }

  public void destroyApp(boolean unconditional) {
  }
}