class PortableMusicPlayer extends MusicPlayer {
    @Override
    public void pause(String songName) {
        System.out.println("I'm Pausing");
    }
    @Override
    public void unpause(String songName) {
        System.out.println("I'm unpausing");
    }
}