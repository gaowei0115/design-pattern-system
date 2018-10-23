package com.mmc.design.pattern.factory.game;

/**
 * @packageName：com.mmc.design.pattern.factory.game
 * @desrciption:
 * @author: gaowei
 * @date： 2018-10-23 17:51
 * @history: (version) author date desc
 */
public class GameApp {

    public static void playGame(GameFactory factory) {
        Game game = factory.creatGame();
        while (game.move()){
            ;
        }
    }

    public static void main(String[] args) {
        playGame(new CheckersGameFactory());
        playGame(new ChessGameFactory());
    }
}
