package behavularpatterns.state;

public class Canvas {
    public void mouseDown(Tool tool){
        tool.mouseDown();
    }
    public void mouseUp(Tool tool){
        tool.mouseUp();
    }
}
