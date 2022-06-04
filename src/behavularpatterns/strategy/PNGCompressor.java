package behavularpatterns.strategy;

public class PNGCompressor implements Compressor{
    @Override
    public String compress(String fileName) {
        return (fileName+".png");
    }
}
