package org.example;
import javax.swing.*;

public class Formulario extends JFrame {

    private JButton button;

    public Formulario() {
        setTitle("Mi Formulario");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Haz click");
        add(button);

        setVisible(true);
    }

}