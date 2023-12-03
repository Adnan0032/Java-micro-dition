import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

public class myimage extends MIDlet implements CommandListener {
    private Display display;
    private Form mainForme;
    private StringItem Msg;
    private Ticker t; 
    private Command cmdExit; 
    public myimage() {
        display = Display.getDisplay(this);
        mainForme = new Form("ma Forme");
        t = new Ticker("Be Carful, A Tiger is coming ;)");
        Msg = new StringItem("", " - A Tiger - ");
        cmdExit = new Command("Exit", Command.EXIT, 1); 
        mainForme.addCommand(cmdExit);
        mainForme.append(Msg);
        mainForme.setCommandListener(this);

        try {
            Image img = Image.createImage("/images/tiger.jpg");
            mainForme.append(new ImageItem(null, img,
                    ImageItem.LAYOUT_CENTER, null));
            display.setCurrent(mainForme);
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void startApp() {
        mainForme.setTicker(t);
        display.setCurrent(mainForme);
    }

    public void pauseApp() {
       
    }

    public void destroyApp(boolean unconditional) {
     
    }

    public void commandAction(Command c, Displayable d) {
        if (c == cmdExit) {
    
            destroyApp(true);
            notifyDestroyed();
        }
    }
}