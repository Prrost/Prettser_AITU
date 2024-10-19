package Assignment4.State;

public class StoppedState implements PlayerState{
    @Override
    public void play(Player player) {
        player.setState(new PlayingState());
        System.out.println("Player is now playing.");
    }

    @Override
    public void stop(Player player) {
        System.out.println("Player is already stopped.");
    }

    @Override
    public void pause(Player player) {
        System.out.println("Player can't be paused.");
    }
}
