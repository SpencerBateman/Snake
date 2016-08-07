package Model;

/**
 * Created by spencer on 8/6/16.
 */
public interface Model {


  /**
   *
   * @return the playing board
   */
  Board getBoard();


  Train getTrain();


  /**
   * Sets the direction that the snake is going to move next
   * @param dir The direction that the snake is now going to move
   */
  void setDirect(Direction dir);


}
