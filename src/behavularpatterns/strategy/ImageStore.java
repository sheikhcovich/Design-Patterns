package behavularpatterns.strategy;

public class ImageStore {

    public void store(String fileName,Compressor compressor,Filter filter){
        String fn = compressor.compress(fileName);
        String v = filter.filter(fn);
        System.out.println(v);
    }
}
