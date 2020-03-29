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
    @DisplayName("Result should be equals to 4 when player rolls 4 dice each 1 and 2 different ")
    void shouldReturnResult4_afterRolls3x1And2DifferentDice(){
        Map<Integer, Integer> thrownDice = Map.of(1,1, 2,1, 3,1, 4,2, 5,1);
        Assertions.assertThat(game.getScoreOfRound(thrownDice)).isEqualTo(6);
    }

    @Test
    @DisplayName("Result should be equals to 10 when player rolls 3 dice each 2 and 2 different ")
    void shouldReturnResult6_afterRolls3x2And2DifferentDice(){
        Map<Integer, Integer> thrownDice = Map.of(1,2, 2,2, 3,2, 4,3, 5,1);
        Assertions.assertThat(game.getScoreOfRound(thrownDice)).isEqualTo(10);
    }

    @Test
    @DisplayName("Result should be equals to 12 when player rolls 3 dice each 3 and 2 different ")
    void shouldReturnResult12_afterRolls3x3And2DifferentDice(){
        Map<Integer, Integer> thrownDice = Map.of(1,3, 2,3, 3,3, 4,2, 5,1);
        Assertions.assertThat(game.getScoreOfRound(thrownDice)).isEqualTo(12);
    }

    @Test
    @DisplayName("Result should be equals to 15 when player rolls 3 dice each 4 and 2 different ")
    void shouldReturnResult15_afterRolls3x4And2DifferentDice(){
        Map<Integer, Integer> thrownDice = Map.of(1,4, 2,4, 3,4, 4,2, 5,1);
        Assertions.assertThat(game.getScoreOfRound(thrownDice)).isEqualTo(15);
    }

    @Test
    @DisplayName("Result should be equals to 18 when player rolls 3 dice each 5 and 2 different ")
    void shouldReturnResult18_afterRolls3x5And2DifferentDice(){
        Map<Integer, Integer> thrownDice = Map.of(1,5, 2,5, 3,5, 4,2, 5,1);
        Assertions.assertThat(game.getScoreOfRound(thrownDice)).isEqualTo(18);
    }

    @Test
    @DisplayName("Result should be equals to 21 when player rolls 3 dice each 6 and 2 different ")
    void shouldReturnResult21_afterRolls3x6And2DifferentDice(){
        Map<Integer, Integer> thrownDice = Map.of(1,6, 2,6, 3,6, 4,2, 5,1);
        Assertions.assertThat(game.getScoreOfRound(thrownDice)).isEqualTo(21);
    }


    @Test
    @DisplayName("Result should be equals to sum of all dice when player rolls 4 the same and 1 different ")
    void shouldReturnResultSumOfDice_afterRolls4TheSameAnd1DifferentDice(){
        Map<Integer, Integer> thrownDice = Map.of(1,5, 2,5, 3,5, 4,5, 5,4);
        Assertions.assertThat(game.getScoreOfRound(thrownDice)).isEqualTo(24);
    }

    // TODO: repair method that calculate FULL
    @Test
    @DisplayName("Result should be equals to 25 when player rolls full")
    void shouldReturnResult25_afterRollsFull(){
        Map<Integer, Integer> thrownDice = Map.of(1,5, 2,5, 3,5, 4,2, 5,2);
        Assertions.assertThat(game.getScoreOfRound(thrownDice)).isEqualTo(25);
    }


    @Test
    @DisplayName("Result should be equals to 30 when player rolls small strit")
    void shouldReturnResult30_afterRollsSMallStrit(){
        Map<Integer, Integer> thrownDice = Map.of(1,2, 2,2, 3,3, 4,4, 5,5);
        Assertions.assertThat(game.getScoreOfRound(thrownDice)).isEqualTo(30);
    }

    @Test
    @DisplayName("Result should be equals to 40 when player rolls large strit")
    void shouldReturnResult40_afterRollsLargeStrit(){
        Map<Integer, Integer> thrownDice = Map.of(1,2, 2,3, 3,4, 4,5, 5,6);
        Assertions.assertThat(game.getScoreOfRound(thrownDice)).isEqualTo(40);
    }

}
