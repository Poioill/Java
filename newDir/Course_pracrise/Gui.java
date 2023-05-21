package Course_pracrise;
import javax.swing.JOptionPane;

public class Gui {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name, plaese.");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height?"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall.");
    }
}
