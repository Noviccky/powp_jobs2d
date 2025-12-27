package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.commands.drawTriangleShapeCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectTriangleShapeOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTriangleShapeOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        drawTriangleShapeCommand.drawTriangleCommand(25, 50, -25, 50, 0, 100).execute(driverManager.getCurrentDriver());
    }
}