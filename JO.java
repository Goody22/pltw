
import javax.swing.JOptionPane;
public class JO
{
    public static void main(String[]arg){
        String result; 
        
        Service[] options = { 
            new Service ("Oil Change", 25), 
            new Service("Tire rotation",22),
            new Service("Battery check", 15),
            new Service("Brake inspection",5)
        };
            
        String prompt = "Welcome to Trevor's Car Care Shop! \nChoose your service:\n Type 1 for Oil change \n Type 2 for Tire rotation \n Type 3 for Battery check \n Type 4 for Brake inspection";
        
        String entry = JOptionPane.showInputDialog(null, prompt);
        
        while (!(entry.equals("1")) && !(entry.equals("2")) && !(entry.equals("3"))
        && !(entry.equals("4"))) {
            entry = JOptionPane.showInputDialog(null, prompt);
            
        }
        
        if (entry.equals("1")){
            JOptionPane.showMessageDialog(null, "It's $" + options[0].getPrice() + " for " +  options[0].getTitle());
        
        }

        else if (entry.equals("2"))
            JOptionPane.showMessageDialog(null, "It's $" + options[1].getPrice() + " for " +  options[1].getTitle());

        else if (entry.equals("3"))
            JOptionPane.showMessageDialog(null, "It's $" + options[2].getPrice() + " for " +  options[2].getTitle());

        else if (entry.equals("4"))
            JOptionPane.showMessageDialog(null, "It's $" + options[3].getPrice() + " for " +  options[3].getTitle()); 

    }
}