package View;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

/**
 * Created by spencer on 8/11/16.
 */
public interface GuiView {

  /**
   * Intialize rendering
   *
   */
  void intialize();

  void addKeyListener(KeyListener keyHandler);

  void addMouseListener(MouseListener mouseHandler);

  void tick();
}
