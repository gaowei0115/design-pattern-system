package com.mmc.design.pattern.factory.game;

/**
 * @packageName：com.mmc.design.pattern.factory.game
 * @desrciption: 西洋跳棋游戏工厂
 * @author: gaowei
 * @date： 2018-10-23 17:48
 * @history: (version) author date desc
 */
public class CheckersGameFactory implements GameFactory {


    @Override
    public Game creatGame() {
        return new CheckersGame();
    }
}
