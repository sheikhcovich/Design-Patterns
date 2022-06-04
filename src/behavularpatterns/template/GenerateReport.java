package behavularpatterns.template;

public class GenerateReport extends Task{
    @Override
    protected void doLogic() {
        System.out.println("Generating report");
    }
}
