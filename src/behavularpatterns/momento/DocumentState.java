package behavularpatterns.momento;

public class DocumentState {
    private final String content,fontName,fontSize;
    public DocumentState(String content, String fontName, String fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }
    public String getContent() {
        return content;
    }
    public String getFontName() {
        return fontName;
    }

    public String getFontSize() {
        return fontSize;
    }

}
