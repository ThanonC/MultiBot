package net.thanon.Window;

import net.thanon.Discord.Bot;
import net.thanon.Utils.Config;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener {
    private Button startDC;
    private boolean isDcBotOn = false;
    private Button startTwit;
    public MainWindow() throws HeadlessException {
        this.setSize(500, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle(new Config().getString("app.name"));

        startDC = new Button();
        startDC.addActionListener(this);
        startDC.setLocation(0, 0);
        startDC.setSize(100,50);
        startDC.setVisible(true);

        this.add(startDC);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(startDC)) {
            if(isDcBotOn != true) {
                isDcBotOn = true;
                startDC.setLabel(String.valueOf(isDcBotOn));
                try {
                    new Bot().start();
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            } else {
                new Bot().shutdown();
            }
        }
    }
}
