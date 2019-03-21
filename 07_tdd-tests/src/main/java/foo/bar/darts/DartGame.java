package foo.bar.darts;

import java.util.Random;

public class DartGame {

    private int points = 501;
    private int[] board = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25, 50};
    private static final Random RANDOM = new Random();


    public int scoreOfOneSeries() {
        int shots = 3;
        int score = 0;
        int sumOfScore = 0;
        for (int i = 0; i < shots; i++) {
            score = board[RANDOM.nextInt(board.length - 1)];
            int ringOfBoard = RANDOM.nextInt(3);
            if (ringOfBoard == 1) {
                sumOfScore = sumOfScore + score;
            }else if(ringOfBoard==2){
                sumOfScore = sumOfScore + score*2;
            }else if(ringOfBoard==3){
                sumOfScore = sumOfScore + score*3;
            }
        }
        return sumOfScore;
    }

    public int sumaryCalulation(int value){
        value = scoreOfOneSeries();
        points = points - value;

        return points;
    }


}
