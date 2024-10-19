package Assignment4.Visitor;

public class ReportVisitor implements Visitor {
    public void visit(TextFile textFile) {
        System.out.println("Generating report for text file...");
        // Генерация отчёта для текстового файла
        System.out.println("Text file content length: " + textFile.getContent().length());
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Generating report for executable file...");
        // Генерация отчёта для исполняемого файла
        System.out.println("Executable file code length: " + executableFile.getExecutableCode().length());
    }
}
