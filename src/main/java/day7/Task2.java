package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(3);
        Player player2 = new Player(100);
        Player player3 = new Player(100);
        Player.info();
        Player player4 = new Player(100);
        Player player5 = new Player(100);
        Player player6 = new Player(100);
        player1.getStamina();


        for (int i = 0; i < 100; i++ )
            player5.run();
        Player.info();
    }

}

class Player {
    private int stamina;
    private final static int MAX_STAMINA = 100;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6)
            countPlayers++;
    }

    private final static int MIN_STAMINA = 0;
    public static int countPlayers;

    public int getStamina() {
        return stamina;

    }

    public void run() {
        if (stamina == 0)
            return;

        stamina--;
        if (stamina ==0)
            countPlayers--;
    }


    public static void info(){
        if (countPlayers < 6){
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("мест нет");
        }
        System.out.println("игрочков "+countPlayers);
    }


}
