abstract class MusicPlayer implements IPlayable{
    @Override
    public void start(String songName) {
        System.out.println("I'm playing");
    }

    @Override
    public void stop(String songName) {
        System.out.println("I'm stopping");
    }

    @Override
    public abstract void pause(String songName);
    @Override
    public abstract void unpause(String songName);
}
