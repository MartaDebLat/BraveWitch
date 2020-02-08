import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MonsterCreationUtil {
    private static List<Monster> createMobnster() {
        int howManyMonsters = new Random().nextInt(4);
        List<Monster> monster = new ArrayList<>();
        for (int i = 0; i < howManyMonsters; i++) {
            int monsterTape = new Random().nextInt(2);
            if (monsterTape == 0) {
                monster.add(new Goblin());
            } else {
                monster.add(new Ghul());
            }
        }
        return monster;

    }
}
