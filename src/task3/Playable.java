package task3;

interface Playable {
    void play();
    void pause();
    void stop();
}

interface Recodable{
    void record();
    void pause();
    void stop();
}

class Player implements Playable, Recodable {

    @Override
    public void play() {
        System.out.println("Програвання");
    }

    @Override
    public void record() {
        System.out.println("Запис");
    }

    @Override
    public void pause() {
        System.out.println("Пауза");
    }

    @Override
    public void stop() {
        System.out.println("Зупинка");
    }
}

class Main{
    public static void main(String[] args) {
        Player player = new Player();

        System.out.println("=== ПРОГРАВАННЯ ===");
        player.play();
        player.pause();
        player.stop();
        System.out.println();

        System.out.println("=== ЗАПИС ===");
        player.record();
        player.pause();
        player.stop();

    }
}