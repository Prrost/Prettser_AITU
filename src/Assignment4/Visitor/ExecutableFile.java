package Assignment4.Visitor;

public class ExecutableFile implements File{
    private String executableCode;

    public ExecutableFile(String executableCode) {
        this.executableCode = executableCode;
    }

    public String getExecutableCode() {
        return executableCode;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
