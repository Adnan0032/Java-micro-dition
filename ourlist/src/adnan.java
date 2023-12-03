import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class adnan extends MIDlet {

  private Display display;
  private Form form;
  private ChoiceGroup choiceGroup;
  private DateField dateField;
  private DateField timeField;
  private Gauge gauge;
  private StringItem stringItem;
  private TextField textField;

  public adnan() {
    display = Display.getDisplay(this);
    form = new Form("Adnan form");

    String choix[] = {"GSEII", "GINFO","GTR"};
    stringItem = new StringItem(null," Welcome");
    choiceGroup = new ChoiceGroup("Selectionner",Choice.EXCLUSIVE,choix,null);
    dateField = new DateField("Heure",DateField.TIME);
    timeField = new DateField("Date",DateField.DATE);
    gauge = new Gauge("Avancement",true,10,1);
    textField = new TextField("Nom","",20,0);

    form.append(stringItem);
    form.append(choiceGroup);
    form.append(timeField); 
    form.append(dateField); 
    form.append(gauge);
    form.append(textField);
  }

  public void startApp() {
    display.setCurrent(form);
  }

  public void pauseApp() {
  }

  public void destroyApp(boolean unconditional) {
  }
}