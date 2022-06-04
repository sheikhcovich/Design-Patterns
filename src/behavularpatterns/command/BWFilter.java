package behavularpatterns.command;

import behavularpatterns.command.framework.Command;

public class BWFilter implements Command {
    @Override
    public void onClick() {
        filter();
    }
    private void filter(){
        System.out.println("filter B&W");
    }
}
