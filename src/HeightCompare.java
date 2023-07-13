import java.util.Comparator;

public class HeightCompare implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return o1.getHeight() - o2.getHeight();
    }
}
