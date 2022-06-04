package behavularpatterns.command;

import behavularpatterns.command.framework.Command;

public class ResizeVideo implements Command {

    private void resize(){
        System.out.println("resizing video");
    }


    @Override
    public void onClick() {
        resize();
    }
}
