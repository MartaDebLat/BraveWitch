import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        System.out.println("Dungeon master says \n - Hello Witch!, We were expecting You... ");
        Player player = PlayerCreator.createPlayer();
        List<Monster> monsters = MonsterCreationUtil.createMonsters();

        while (player.isAlive() && monsters.stream().anyMatch(m -> m.isAlive())) {

            monsters.stream()
                    .filter(m -> m.isAlive())
                    .findFirst()
                    .get()
                    .receiveDamage(player.attack());


            monsters.stream().filter(m -> m.isAlive())
                    .forEach(singleMonster -> player.receiveDamage(singleMonster.attack()));
            System.out.println(monsters);
        }
        if (player.isAlive()) {
            System.out.println("Congratulations Dear Witch! You have killed " + monsters);
        } else {
            System.out.println("Condolence Dear Witch, You are dead. ");

        }
     }
}