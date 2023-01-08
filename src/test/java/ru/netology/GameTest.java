package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void test1 (){
        Game game = new Game();
        Player1 Vasiliy = new Player1(1, "Vasiliy", 70);
        Player1 Dmitry = new Player1(2, "Dmitry", 68);
        game.register(Vasiliy);
        game.register(Dmitry);

        int actual = game.round("Vasiliy", "Dmitry");
        int expected = 1;

        Assertions.assertEquals(expected, actual);

        Assertions.assertEquals(1, Vasiliy.getId());
        Assertions.assertEquals(2, Dmitry.getId());

    }
    @Test
    public void test2 (){
        Game game = new Game();
        Player1 Vasiliy = new Player1(1, "Vasiliy", 70);
        Player1 Dmitry = new Player1(2, "Dmitry", 700);
        game.register(Vasiliy);
        game.register(Dmitry);

        int actual = game.round("Vasiliy", "Dmitry");
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void test3 (){
        Game game = new Game();
        Player1 Vasiliy = new Player1(1, "Vasiliy", 70);
        Player1 Dmitry = new Player1(2, "Dmitry", 70);
        game.register(Vasiliy);
        game.register(Dmitry);

        int actual = game.round("Vasiliy", "Dmitry");
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void test4 (){
        Game game = new Game();
        Player1 Vasiliy = new Player1(1, "Vasiliy", 70);
        game.register(Vasiliy);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Vasiliy", null);
        });

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round(null, "Vasiliy");
        });


        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round(null, null);
        });
    }


}
