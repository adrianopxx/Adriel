package Telas;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    String login;
    String Senha ;

    public void aparece(){
        setBounds(300,300,300,300);
        JPanel Jp =new JPanel();
      Jp. setBounds(300,300,300,300);
      Jp.setBackground(Color.blue);
      add(Jp);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }



}
