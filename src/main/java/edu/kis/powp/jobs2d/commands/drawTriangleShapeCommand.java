package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.drivers.DriverCommand;
import java.util.ArrayList;
import java.util.List;

public class drawTriangleShapeCommand {
    public static ComplexCommand drawTriangleCommand(int x1, int y1, int x2, int y2, int x3, int y3) {
        List<DriverCommand> commands = new ArrayList<>();
        commands.add(SetPositionCommand(x1, y1));
        commands.add(OperateToCommand(x2, y2));
        commands.add(OperateToCommand(x3, y3));
        commands.add(OperateToCommand(x1, y1));
        return new ComplexCommand(commands);
    }

    private static DriverCommand SetPositionCommand(int x, int y) {
        return new SetPositionCommand(x, y);
    }

    private static DriverCommand OperateToCommand(int x, int y) {
        return new OperateToCommand(x, y);
    }
}