/*
* File: MainController.java
* Author: Zentai Pál
* Copyright: 2022, Zentai Pál
* Group: Szoft-II-N
* Date: 2022-12-18
* Github: https://github.com/Pali002
* Licenc: GNU GPL
*/

package controllers;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import views.MainWindow;

public class MainController {
    MainWindow mainWindow;

    public MainController() {
        this.mainWindow = new MainWindow();
        this.handleEvents();
    }

    public void handleEvents() {
        JButton calcButton = this.mainWindow.buttonsPanel.calcButton;
        JButton aboutButton = this.mainWindow.buttonsPanel.aboutButton;
        calcButton.addActionListener(e -> onClickCaclButton());
        aboutButton.addActionListener(e -> onClickAboutButton());
    }

    public void onClickCaclButton() {
        this.calcVolume();
        this.calcCircuit();
    }

    public void onClickAboutButton() {
        String aboutString = "Rombitak\nVerzió: 0.1\nSzoft-II-N, 2022";
        JOptionPane.showMessageDialog(mainWindow, aboutString);
    }

    public void calcVolume() {
        String asiteStr = this.mainWindow.asitePanel.getValue();
        String alphaStr = this.mainWindow.alphaPanel.getValue();
        double alpha = Double.parseDouble(alphaStr);
        double asite = Double.parseDouble(asiteStr);

        Double radian = alpha * Math.PI/180;
        Double volume =  Math.pow(asite, 2) * Math.sin(radian);
        this.mainWindow.volumePanel.setValue(volume.toString());
    }

    public void calcCircuit() {
        String asiteStr = this.mainWindow.asitePanel.getValue();
        double asite = Double.parseDouble(asiteStr);

        Double circuit = 4 * asite;
        this.mainWindow.circuitPanel.setValue(circuit.toString());
    }
}