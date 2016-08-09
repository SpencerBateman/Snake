package Model;

/**
 * Created by spencer on 8/7/16.
 */
public class ModelImpl implements Model{

  private Board board;
  private Train snake;








  @Override
  public Board getBoard() {
    return this.board;
  }

  @Override
  public Train getTrain() {
    return this.snake;
  }

  @Override
  public void setDirect(Direction dir) {
    snake.direction = dir;
  }

  /**
   * PROGRESSES THE snake one space, checks to see if food is eaten
   * checks to see if direction changes
   * updates the rest of the snake
   * grows the snake if nessesary
   */
  @Override
  public void updateSnake() {
    //TODO
    // make sure this method gets filled out correctly





  }
}
