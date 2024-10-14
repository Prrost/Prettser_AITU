package assignment3.command;

public class VolumeUpCommand implements Command {
    private Television television;

    public VolumeUpCommand(Television television) {
        this.television = television;
    }

    public void execute(){
        television.volumeUp();
    }
}
