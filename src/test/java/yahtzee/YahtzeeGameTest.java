package yahtzee;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class YahtzeeGameTest {

    YahtzeeGame game;

    @BeforeEach
    void setUp() {
        game = new YahtzeeGame();
    }

    @AfterEach
    void clearUp() {
        game = null;
    }

    @Test
    @DisplayName("Result should be equals to 12 when player rolls 3 dice each 4 and 2 different ")
    void shouldReturnResultTwelve_afterRolls3x4And2DifferentDice(){
        Map<Integer, Integer> thrownDice = Map.of(1,4, 2,4, 3,4, 5,2, 6,1);
        Assertions.assertThat(game.getScoreOfRound(thrownDice)).isEqualTo(12);
    }
}
