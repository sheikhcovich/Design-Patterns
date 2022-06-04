package behavularpatterns.strategy;

public class ColoredFilter implements Filter{
    @Override
    public String filter(String fileName) {
        return fileName+" applying Colored filter";
    }
}
