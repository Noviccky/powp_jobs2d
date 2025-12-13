package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter implements Job2dDriver {
    public enum LineMode {
        SOLID_LINE, SPECIAL_LINE
    }
    private DrawPanelController drawPanelController;
    private int currentX = 0;
    private int currentY = 0;
    private LineMode lineMode = LineMode.SOLID_LINE;

    public LineDrawerAdapter(DrawPanelController drawPanelController, LineMode initialLineMode) {
        this.drawPanelController = drawPanelController;
        this.setMode(initialLineMode);
    }

    public void setMode(LineMode lineMode) {
        this.lineMode = lineMode;
    }

    @Override
    public void setPosition(int x, int y) {
        this.currentX = x;
        this.currentY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        ILine line;
        switch (this.lineMode) {
            case SOLID_LINE:
                line = LineFactory.getBasicLine();
                break;
            case SPECIAL_LINE:
                line = LineFactory.getSpecialLine();
                break;
            default:
                throw new IllegalArgumentException("Unsupported line mode selected: " + this.lineMode.toString());
        };
        line.setStartCoordinates(this.currentX, this.currentY);
        line.setEndCoordinates(x, y);

        this.drawPanelController.drawLine(line);
        this.currentX = x;
        this.currentY = y;
    }

    @Override
    public String toString() {
        return "Selected line mode: " + this.lineMode.toString();
    }
}