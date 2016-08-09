package Model;

/**
 * Created by spencer on 8/7/16.
 */
public class Tile {
  private Contents contents;

  Tile(){
    this.contents = Contents.EMPTY;
  }


  public Contents getContents() {
    return this.contents;
  }

  public void setFood() {
    this.contents = Contents.FOOD;


  }

  public void setEmpty() {
    this.contents = Contents.EMPTY;


  }

  public void setHead() {
    this.contents = Contents.HEAD;

  }

  public void setTail(){
    this.contents = Contents.TAIL;

  }

}
