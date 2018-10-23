package com.mmc.design.pattern.factory.game;

/**
 * @packageName：com.mmc.design.pattern.factory.game
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-23 17:49
 * @history: (version) author date desc
 */
public class ChessGame implements Game {

    private int moves = 0;
    private static final int MOVES = 4;

    @Override
    public boolean move() {
        System.out.println("Chess move " + moves);
        return (++moves != MOVES);
    }
}
