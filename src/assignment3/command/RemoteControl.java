package assignment3.command;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    private Map<String, Command> commands = new HashMap<>();

    public void setCommand(String s, Command c) {
        commands.put(s, c);
    }

    public void buttonPressed(String s) {
        Command command = commands.get(s);
        if (command != null) {
            command.execute();
        }else {
            System.out.println("Command not found");
        }
    }
}
