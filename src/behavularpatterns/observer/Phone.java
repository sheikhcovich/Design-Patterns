package behavularpatterns.observer;

public class Phone implements Observer<Integer>{




    @Override
    public void get(Integer integer) {
        System.out.println(integer);
    }
}
