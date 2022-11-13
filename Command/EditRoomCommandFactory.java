package Command;

import java.util.*;
import Building.*;

public class EditRoomCommandFactory implements CommandFactory {
    Stack commands;
    Scanner sc;
    HashMap<Integer, Building> buildMap;

    public EditRoomCommandFactory(Scanner sc, HashMap<Integer, Building> buildMap, Stack commands) {
        this.sc = sc;
        this.buildMap = buildMap;
        this.commands = commands;
    }

    @Override
    public Command createCommand() {
        return new EditRoomCommand(sc, buildMap, commands);
    }}
