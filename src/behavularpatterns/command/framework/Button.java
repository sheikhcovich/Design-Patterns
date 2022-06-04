package behavularpatterns.command.framework;

public class Button {
    private Command command;
    private final CompositeCommand compositeCommand = new CompositeCommand();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click(){
        command.onClick();
        compositeCommand.push(command);
    }

    public CompositeCommand getCompositeCommand() {
        return compositeCommand;
    }
}
