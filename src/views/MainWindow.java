/*
* File: MainWindow.java
* Author: Zentai Pál
* Copyright: 2022, Zentai Pál
* Group: Szoft-II-N
* Date: 2022-12-18
* Github: https://github.com/Pali002
* Licenc: GNU GPL
*/

package views;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class MainWindow extends JFrame{
    TitlePanel titlePanel;
    public AsitePanel asitePanel;
    public AlphaPanel alphaPanel;
    public CircuitPanel circuitPanel;
    public VolumePanel volumePanel;
    public ButtonsPanel buttonsPanel;

    public MainWindow() {
        this.titlePanel = new TitlePanel();
        this.asitePanel = new AsitePanel();
        this.alphaPanel = new AlphaPanel();
        this.circuitPanel = new CircuitPanel();
        this.volumePanel = new VolumePanel();
        this.buttonsPanel = new ButtonsPanel();

        this.initWindow();
    }

    public void initWindow() {
        this.setTitle("Rombitak");
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.addComponent();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public void addComponent() {
        this.add(this.titlePanel);
        this.add(this.asitePanel);
        this.add(this.alphaPanel);
        this.add(this.circuitPanel);
        this.add(this.volumePanel);
        this.add(this.buttonsPanel);
    }
}
