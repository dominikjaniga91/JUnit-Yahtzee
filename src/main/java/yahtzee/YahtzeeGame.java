package yahtzee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class YahtzeeGame {


    public int getScoreOfRound(Map<Integer, Integer> thrownDice) {

        return getBestScore(thrownDice);
    }

    private int getBestScore(Map<Integer, Integer> thrownDice) {
        List<Integer> score = new ArrayList<>();
        Arrays.stream(Categories.values())
                .forEach(categories -> score.add(categories.getSumOfDice(thrownDice)));

        return score.stream().reduce(0, Integer::max);
    }
}
