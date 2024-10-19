package Assignment4.State;

public class PlayingState implements PlayerState{
    @Override
    public void play(Player player) {
        System.out.println("Player is already playing.");
    }

    @Override
    public void stop(Player player) {
        player.setState(new StoppedState());
        System.out.println("Player is now stopped.");
    }

    @Override
    public void pause(Player player) {
        player.setState(new PausedState());
        System.out.println("Player is now paused.");
    }
}
