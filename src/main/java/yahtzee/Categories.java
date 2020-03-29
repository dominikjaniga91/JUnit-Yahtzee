package yahtzee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public enum Categories {


    ONES {
        @Override
        int getSumOfDice(Map<Integer, Integer> thrownDice) {
            return thrownDice.values()
                    .stream()
                    .filter(number -> number==1)
                    .reduce(0,Integer::sum);
        }
    },
    TWOS {
        @Override
        int getSumOfDice(Map<Integer, Integer> thrownDice) {
            return thrownDice.values()
                    .stream()
                    .filter(number -> number==2)
                    .reduce(0,Integer::sum);
        }
    },
    THREES {
        @Override
        int getSumOfDice(Map<Integer, Integer> thrownDice) {
            return thrownDice.values()
                    .stream()
                    .filter(number -> number==3)
                    .reduce(0,Integer::sum);
        }
    },
    FOURS {
        @Override
        int getSumOfDice(Map<Integer, Integer> thrownDice) {
            return thrownDice.values()
                    .stream()
                    .filter(number -> number==4)
                    .reduce(0,Integer::sum);
        }
    },

    FIVES {
        @Override
        int getSumOfDice(Map<Integer, Integer> thrownDice) {
            return thrownDice.values()
                    .stream()
                    .filter(number -> number==5)
                    .reduce(0,Integer::sum);
        }
    },

    SIXES {
        @Override
        int getSumOfDice(Map<Integer, Integer> thrownDice) {
            return thrownDice.values()
                    .stream()
                    .filter(number -> number==6)
                    .reduce(0,Integer::sum);
        }
    },

    THREE_THE_SAME {
        @Override
        int getSumOfDice(Map<Integer, Integer> thrownDice) {

            List<Integer> elementOfDice = List.of(1, 2, 3, 4, 5, 6);
            int score = 0;
            for (int element : elementOfDice) {

                long theSameNumber = thrownDice.values()
                        .stream().filter(number -> number == element).count();

                if (theSameNumber == 3) {
                    score = thrownDice.values().stream().reduce(0, Integer::sum);
                    break;
                } else {
                    score = 0;
                }
            }
            return score;
        }
    },

    FOUR_THE_SAME {
        @Override
        int getSumOfDice(Map<Integer, Integer> thrownDice) {

            List<Integer> elementOfDice = List.of(1,2,3,4,5,6);
            int score = 0;
            for (int element: elementOfDice) {

                long theSameNumber =thrownDice.values()
                        .stream().filter(number -> number == element).count();

                if(theSameNumber == 4){
                    score = thrownDice.values().stream().reduce(0,Integer::sum);
                    break;
                }else{
                    score = 0;
                }
            }
            return score;
        }
    };


    abstract int getSumOfDice(Map<Integer, Integer> thrownDice);
}
