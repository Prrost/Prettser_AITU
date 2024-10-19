package Assignment4.State;

public class PausedState implements PlayerState {
    @Override
    public void play(Player player) {
        player.setState(new PlayingState());
        System.out.println("Player is continuing to play.");
    }

    @Override
    public void stop(Player player) {
        player.setState(new StoppedState());
        System.out.println("Player is now stopped.");
    }

    @Override
    public void pause(Player player) {
        System.out.println("Player is already paused.");
    }
}
