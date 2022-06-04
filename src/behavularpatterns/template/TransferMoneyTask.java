package behavularpatterns.template;

public class TransferMoneyTask extends Task{
    @Override
    protected void doLogic() {
        System.out.println("transfer money");
    }
}
