package behavularpatterns.strategy;

public class PEGCompressor implements Compressor{
    @Override
    public String compress(String fileName) {
        return fileName+".peg";
    }
}
