package behavularpatterns.momento;

public class Editor {
    private String content,fontName,fontSize;

    public DocumentState create() {
        return new DocumentState(this.content,this.fontName,this.fontSize);
    }

    public void restore(DocumentState documentState){
        this.content = documentState.getContent();
        this.fontName = documentState.getFontName();
        this.fontSize = documentState.getFontSize();
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void setFontSize(String fontSize) {
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
