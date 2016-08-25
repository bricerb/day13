package tiy.pink;

import java.util.ArrayList;

/**
 * Created by Brice on 8/24/16.
 */
public class ChocolateSolver {

    private int result;
    private ArrayList<Integer> smallThenBig = new ArrayList<Integer>();

    //uses bigs first(5), then smalls(1), try to get goal.

    public int makeChocolate(int small, int big, int goal) {
        int bigKilos = (big * 5);

        if (big < 0 || small < 0 || goal < 0) {
            System.out.println("Invalid Input.");
            setResult(-1);
            smallThenBig.add(0,-1);
        }

        if (big > 0) {
            atLeastOneBig(small, big, goal, bigKilos);
        } else if (big == 0) {
            NoBigs(small, goal);
        }
            return result;
    }



    public void atLeastOneBig (int small, int big, int goal, int bigKilos) {
        int bigByGoal = ((goal % bigKilos));
        boolean isDivisibleByFive = (bigByGoal % 5) == 0;

        if (bigKilos > goal || bigKilos == goal) {
            if (isDivisibleByFive) {
                setResult(0);
            } else {
                if (small < bigByGoal) {
                    setResult(-1);
                    smallThenBig.add(0,-1);
                } else if (small == bigByGoal) {
                    setResult(bigKilos + small);
                } else if (small > bigByGoal) {
                    setResult((goal - bigKilos));
                    smallThenBig.add();
                }
            }
        }
    }

    public void NoBigs (int small, int goal) {
        if (small == goal || small > goal) {
            setResult(goal);
            smallThenBig.add(goal,0);
        } else if (small == 0 || small < goal) {
            setResult(-1);
            smallThenBig.add(0,-1);
        }
    }


    public void setResult(int result) {
        this.result = result;
    }
}
