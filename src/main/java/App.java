import java.util.List;

public class App {
    public static void main(String[] args) {

        System.out.println(" Welcome Witch in the Land Of Monsters! \n Choose <NEW GAME> or <LOAD GAME>");
        Player player = PlayerCreator.createPlayer();
        System.out.println(player);
        List<Monster> monsters = MonsterCreationUtil.createMonsters();

       
        monsters.stream().filter(n->n.isAlive()).forEach(singleMonster ->player.receiveDamage(singleMonster.attack());

        System.out.println();





    }

}
