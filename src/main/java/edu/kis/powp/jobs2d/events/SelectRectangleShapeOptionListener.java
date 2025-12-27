package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.commands.drawRectangleShapeCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectRectangleShapeOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectRectangleShapeOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        drawRectangleShapeCommand.drawRectangleCommand(0, 50, 25, 50).execute(driverManager.getCurrentDriver());
    }
}