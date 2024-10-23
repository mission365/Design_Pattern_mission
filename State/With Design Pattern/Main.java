// State interface
interface PlayerState {
    void pressPlay(MusicPlayer player);
    void pressPause(MusicPlayer player);
    void pressStop(MusicPlayer player);
}

// Concrete states (Playing, Paused, Stopped)
class PlayingState implements PlayerState {
    @Override
    public void pressPlay(MusicPlayer player) {
        System.out.println("Music is already playing.");
    }

    @Override
    public void pressPause(MusicPlayer player) {
        System.out.println("Pausing music.");
        player.setState(new PausedState());
    }

    @Override
    public void pressStop(MusicPlayer player) {
        System.out.println("Stopping music.");
        player.setState(new StoppedState());
    }
}

class PausedState implements PlayerState {
    @Override
    public void pressPlay(MusicPlayer player) {
        System.out.println("Resuming music.");
        player.setState(new PlayingState());
    }

    @Override
    public void pressPause(MusicPlayer player) {
        System.out.println("Music is already paused.");
    }

    @Override
    public void pressStop(MusicPlayer player) {
        System.out.println("Stopping music.");
        player.setState(new StoppedState());
    }
}

class StoppedState implements PlayerState {
    @Override
    public void pressPlay(MusicPlayer player) {
        System.out.println("Starting music.");
        player.setState(new PlayingState());
    }

    @Override
    public void pressPause(MusicPlayer player) {
        System.out.println("Cannot pause, music is stopped.");
    }

    @Override
    public void pressStop(MusicPlayer player) {
        System.out.println("Music is already stopped.");
    }
}

// Context class (Music Player)
class MusicPlayer {
    private PlayerState state;

    public MusicPlayer() {
        this.state = new StoppedState(); // Default state
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void pressPlay() {
        state.pressPlay(this);
    }

    public void pressPause() {
        state.pressPause(this);
    }

    public void pressStop() {
        state.pressStop(this);
    }
}

public class Main {
    public static void main(String[] args) {
        // Client code
        MusicPlayer player = new MusicPlayer();
        player.pressPlay(); // Starting music.
        player.pressPause(); // Pausing music.
        player.pressStop(); // Stopping music.
    }
}
