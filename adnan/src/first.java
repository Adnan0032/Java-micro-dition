import javax.microedition.midlet.*;

import javax.microedition.lcdui.*;

public class first extends MIDlet {

  private Display display;
  private Form form;
  private StringItem string;
  private TextField textbox;
  private TextField textbox2; 
  private ChoiceGroup list;
  protected static final String[] items={"audi","mercedes","fiat uno","Dacia"};


  public first() {
    display = Display.getDisplay(this);
    form = new Form("Ma form");
    string=new StringItem(null," Welcome to our list ");
    textbox=new TextField("Email:","",100,TextField.EMAILADDR);
    textbox2=new TextField("Password:\n","",15,TextField.PASSWORD);
    list=new ChoiceGroup("Selection",List.MULTIPLE,items,null);
    form.append(string);
    form.append(textbox);
    form.append(textbox2);
    form.append(list);
    

  }

  public void startApp() {

    display.setCurrent(form);
   
  }

  public void pauseApp() {
  }

  public void destroyApp(boolean unconditional) {
  }
}