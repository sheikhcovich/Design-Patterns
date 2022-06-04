package behavularpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    List <String> urls = new ArrayList<>();

    public void push(String url){
        urls.add( url);
    }

    public Iterator<String> createIterator(){
        return new ArrayListIterable(this);
    }


    private class ArrayListIterable implements Iterator<String>{
        int index;
        private BrowserHistory browserHistory;

        public ArrayListIterable(BrowserHistory browserHistory){
            this.browserHistory = browserHistory;
        }

        @Override
        public boolean hasNext() {
            return index < browserHistory.urls.size();
        }

        @Override
        public String current() {
            return browserHistory.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }


}
