import javax.swing.*;

public class Xsimain
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(()->
        {
            Xsi0Model model=new Xsi0Model();
            Xsi0view view=new Xsi0view();
            new Xsi0Controller(model, view);
        });
    }
}