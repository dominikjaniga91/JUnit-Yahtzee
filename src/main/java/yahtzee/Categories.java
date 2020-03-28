package yahtzee;

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
    };


    abstract int getSumOfDice(Map<Integer, Integer> thrownDice);
}
