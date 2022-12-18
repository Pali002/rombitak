/*
* File: ButtonsPanel.java
* Author: Zentai Pál
* Copyright: 2022, Zentai Pál
* Group: Szoft-II-N
* Date: 2022-12-18
* Github: https://github.com/Pali002
* Licenc: GNU GPL
*/

package views;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel {
    
    public JButton calcButton;
    public JButton aboutButton;

    public ButtonsPanel() {

        this.calcButton = new JButton("Számít");
        this.aboutButton = new JButton("Névjegy");
        this.addComponent();
    }

    public void addComponent() {
        this.add(calcButton);
        this.add(aboutButton);
    }
}
