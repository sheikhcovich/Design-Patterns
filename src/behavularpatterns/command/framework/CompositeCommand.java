package behavularpatterns.command.framework;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    public void push(Command command){
        commands.add(command);
    }



    @Override
    public void onClick() {
        for (Command command : commands){
            command.onClick();
        }
    }
}
