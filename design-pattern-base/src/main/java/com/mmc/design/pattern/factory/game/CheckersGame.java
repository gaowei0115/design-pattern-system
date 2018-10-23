package com.mmc.design.pattern.factory.game;

/**
 * @packageName：com.mmc.design.pattern.factory.game
 * @desrciption: 西洋跳棋游戏
 * @author: gaowei
 * @date： 2018-10-23 17:45
 * @history: (version) author date desc
 */
public class CheckersGame implements Game {

    private int moves = 0;
    private static final int MOVES = 3;


    @Override
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return (++moves != MOVES);
    }
}
