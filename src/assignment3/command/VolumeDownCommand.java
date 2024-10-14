package assignment3.command;

public class VolumeDownCommand implements Command {
    private Television television;

    public VolumeDownCommand(Television television) {
        this.television = television;
    }

    public void execute(){
        television.volumeDown();
    }
}
