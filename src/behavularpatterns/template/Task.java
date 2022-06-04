package behavularpatterns.template;

public abstract class Task {
    private AuditTrail auditTrail;
    public Task(){
        this.auditTrail = new AuditTrail();
    }

    protected Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        this.auditTrail.recordData();
        doLogic();
    }

    protected abstract void doLogic();
}
