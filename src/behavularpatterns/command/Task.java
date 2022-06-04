package behavularpatterns.command;

import behavularpatterns.command.framework.Command;

public class Task implements Command {
    public void doLogic(){
        System.out.println("doing tasks");
    }

    @Override
    public void onClick() {
        doLogic();
    }
}
