package behavularpatterns.momento;

import java.util.Stack;

public class History {
    Stack<DocumentState> states = new Stack<>();

    public void push(DocumentState state){
        states.push(state);
    }

    public DocumentState pop(){
        if (states.size() > 1)
             return states.pop();
        return states.peek();
    }
}
