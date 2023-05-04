/********************************************************
 *
 *  Project :  GameOfLife
 *  File    :  GameofLife.java
 *  Name    :  [Redacted]
 *  Date    :  February 21, 2021
 *
 *  Description : To simulate a board game
 *
 *    The purpose is to create a game within java with the use of Counter
 *    Techniques used in this code is take advantage of the Counter method
 *    and use incrementation to stack up tally value. I used the Counter.java
 *    file in order to use to the counter method.
 *
 ********************************************************/

import flips.Counter;
import java.util.Scanner;

/****************************************************

* Method : Main/GameOfLife
*
* Purpose : To create a game based on Counter/dice/math.random
* and use Counter/increment methods from Counter.java
*
* Parameters : Counter, ints, String
*
* Returns : Simulate a game which returns certain values of a "dice"
* until it has hit max designated value.
*
****************************************************/

public class GameOfLife {

    public static void main(String[] args) {
        Counter me = new Counter("UncleBen");
        Counter computer = new Counter("Computer");

        final int Num_Of_Spaces = 30;
        final int PAY_DAY_1 = 6;
        final int PAY_DAY_2 = 23;
        final int EXPRESS_LINE = 13;

        Scanner scan = new Scanner(System.in);
        Counter whoseTurn = computer;

        System.out.println("So it begins...");

        for (int i = 0; whoseTurn.tally() < Num_Of_Spaces; i++) {
            whoseTurn = switchUsers(whoseTurn, me, computer);
            if (whoseTurn == me) {
                System.out.println("Your turn. Press Enter to spin:");
                scan.nextLine();
            } else {
                System.out.println("Computer's turn");
            }

            int spinner = 1 + (int) (Math.random() * ((10 - 1) + 1));
            increment(whoseTurn, spinner);
            System.out.println("The spinner shows: " + spinner);
            if (whoseTurn == me) {
                System.out.println(me + " is on spot " + me.tally() + "!");
            }
            if (whoseTurn == computer) {
                System.out.println(computer + " is on spot " + computer.tally() + "!");
            }

            if (whoseTurn.tally() == PAY_DAY_1 || whoseTurn.tally() == PAY_DAY_2) {

                increment(whoseTurn, spinner);
                System.out.println(whoseTurn + " landed on Payday!");

            }
            if (whoseTurn.tally() == EXPRESS_LINE) {
                increment(whoseTurn, 8);
                System.out.println(whoseTurn + "went up the Express Line!");
            }

        }

        if (me.tally() > 30) {
            System.out.println(me + " won the game!");
        } else {
            System.out.println(computer + "won the game!");
        }

    }

    public static void increment(Counter c, int num) {
        for (int i = 0; i < num; i++) {
            c.increment();
        }
    }

    public static Counter switchUsers(Counter who, Counter me, Counter computer) {
        if (who == me) {
            who = computer;
        } else {
            who = me;
        }
        return who;
    }
}
