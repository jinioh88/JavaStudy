package OOP2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

class InnerEx3 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occ");
            }
        });
    }
}

