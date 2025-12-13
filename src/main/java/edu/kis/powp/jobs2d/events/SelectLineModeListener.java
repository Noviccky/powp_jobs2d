package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;

public class SelectLineModeListener implements ActionListener {

    private LineDrawerAdapter lineDrawerAdapter;

    private LineDrawerAdapter.LineMode lineMode;

    public SelectLineModeListener(LineDrawerAdapter lineDrawerAdapter, LineDrawerAdapter.LineMode lineMode) {
        this.lineDrawerAdapter = lineDrawerAdapter;
        this.lineMode = lineMode;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.lineDrawerAdapter.setMode(this.lineMode);
    }
}