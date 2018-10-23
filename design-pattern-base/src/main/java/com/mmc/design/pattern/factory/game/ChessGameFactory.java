package com.mmc.design.pattern.factory.game;

/**
 * @packageName：com.mmc.design.pattern.factory.game
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-23 17:51
 * @history: (version) author date desc
 */
public class ChessGameFactory implements GameFactory {
    @Override
    public Game creatGame() {
        return new ChessGame();
    }
}
