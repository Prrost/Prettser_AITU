package Assignment4.Visitor;

public class AntivirusVisitor implements Visitor {
    public void visit(TextFile textFile) {
        System.out.println("Scanning text file for forbidden words...");
        // Проверка текста на запрещённые слова
        if (textFile.getContent().contains("virus")) {
            System.out.println("Warning: Forbidden word found in text file!");
        }
    }

    public void visit(ExecutableFile executableFile) {
        System.out.println("Scanning executable file for malicious code...");
        // Проверка исполняемого файла на вредоносный код
        if (executableFile.getExecutableCode().contains("malware")) {
            System.out.println("Warning: Malicious code found in executable file!");
        }
    }
}
