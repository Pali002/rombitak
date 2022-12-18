/*
* File: TitlePanel.java
* Author: Zentai Pál
* Copyright: 2022, Zentai Pál
* Group: Szoft-II-N
* Date: 2022-12-18
* Github: https://github.com/Pali002
* Licenc: GNU GPL
*/

package views;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class TitlePanel extends JPanel {
    JLabel mainLabel;

    public TitlePanel() {
        this.mainLabel = new JLabel("Rombusz területe és kerülete");        
        this.mainLabel.setFont(new Font("Sans serif", Font.BOLD, 24));
        this.mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.mainLabel.setBorder(new EmptyBorder(10, 10, 5, 10));

        this.add(this.mainLabel);
    }
    
}