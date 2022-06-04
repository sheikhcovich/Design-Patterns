package behavularpatterns.strategy;

public class BWFilter implements Filter{
    @Override
    public String filter(String fileName) {
        return (fileName+" applying B&W filter");
    }
}
