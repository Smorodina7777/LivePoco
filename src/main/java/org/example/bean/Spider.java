package org.example.bean;

public class Spider {
    private Snake snake;

    public Spider(Snake snake) {
        this.snake = snake;
    }

    @Override
    public String toString() {
        return "паука съела змея," + snake.toString();
    }
}
