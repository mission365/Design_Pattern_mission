/*
 * Imagine you're designing a music player app.
 * The player can be in different states: Playing, Paused, or Stopped.
 * Each state affects how the buttons (like Play, Pause, Stop) behave.
 * Without the State pattern, you'd have to write complex if-else ,
 * or switch statements to handle these behaviors.
 */
class MusicPlayer {
    public String state = "stopped";

    public void pressPlay() {
        if (state.equals("playing")) {
            System.out.println("Music is already playing.");
        } else if (state.equals("paused")) {
            state = "playing";
            System.out.println("Resuming music.");
        } else if (state.equals("stopped")) {
            state = "playing";
            System.out.println("Starting music.");
        }
    }

    public void pressPause() {
        if (state.equals("paused")) {
            System.out.println("Music is already paused.");
        } else if (state.equals("playing")) {
            state = "paused";
            System.out.println("Pausing music.");
        } else if (state.equals("stopped")) {
            System.out.println("Cannot pause, music is stopped.");
        }
    }

    public void pressStop() {
        if (state.equals("stopped")) {
            System.out.println("Music is already stopped.");
        } else {
            state = "stopped";
            System.out.println("Stopping music.");
        }
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
