package behavularpatterns;

import behavularpatterns.command.BWFilter;
import behavularpatterns.command.ResizeVideo;
import behavularpatterns.command.Task;
import behavularpatterns.command.framework.Button;
import behavularpatterns.command.framework.Command;
import behavularpatterns.command.framework.CompositeCommand;
import behavularpatterns.state.BrushTool;
import behavularpatterns.state.Canvas;
import behavularpatterns.state.SelectionTool;

public class Excecutor {

    public static void main(String[] args) {
//        TODO Momento Pattern ----> Undo actions
//        Editor editor = new Editor();
//        History history = new History();
//
//        editor.setContent("ddscsd");
//        editor.setFontName("aura");
//        editor.setFontSize("15");
//        history.push(editor.create());
//
//        editor.setContent("ewrer");
//        editor.setFontName("kij");
//        editor.setFontSize("20");
//        history.push(editor.create());
//
//        editor.restore(history.pop());
//        editor.restore(history.pop());
//        editor.restore(history.pop());
//        editor.restore(history.pop());
//        System.out.println(editor.getContent());


//        TODO State Pattern ----> Polymorphism
//        Canvas canvas = new Canvas();
//        canvas.mouseDown(new SelectionTool());
//        canvas.mouseUp(new BrushTool());


//      TODO Iterator Pattern ----> Doesn't matter which data structure data are stored in
//
//        BrowserHistory browserHistory = new BrowserHistory();
//        browserHistory.push("a");
//        browserHistory.push("b");
//        browserHistory.push("c");
//
//        Iterator<String> iterator = browserHistory.createIterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.current());
//            iterator.next();
//        }

//        TODO Strategy Pattern ---> It look like state design pattern ,the only difference, the strategy pattern has many states to apply
//        ImageStore imageStore = new ImageStore();
//        String s = "photo";
//        imageStore.store(s,new PNGCompressor(),new BWFilter());
//        imageStore.store(s,new PEGCompressor(),new ColoredFilter());

//        TODO Template Pattern ---> common base action is shared between various classes & do some actions moreover this base action
//        GenerateReport generateReport = new GenerateReport();
//        TransferMoneyTask transferMoneyTask = new TransferMoneyTask();
//        transferMoneyTask.execute();
//        generateReport.execute();

//        TODO Command Pattern ---> Decoupled certain implementation of some logic from implementation for a certain action like onClick in android studio & other frameworks use the same pattern
//        Command command = new Task();
//        Button button = new Button();
//        button.setCommand(command);
//        button.click();

//        TODO CompositeCommand ---> we can list all actions we did in composite command
//        Command command1 = new ResizeVideo();
//        button.setCommand(command1);
//        button.click();
//        Command command2 = new BWFilter();
//        button.setCommand(command2);
//        button.click();

//        CompositeCommand compositeCommand = button.getCompositeCommand();
//        compositeCommand.onClick();



    }
}
