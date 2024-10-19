package Assignment4.Visitor;

public class TextFile implements File{
    private String content;

    public TextFile(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
