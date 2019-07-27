package els;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
/**
 * @version 1.1.7
 * @author 耿美丽
 *
 */
public class GamePanel extends Frame {
	public static int width = 15;
	public static int height = 30;
	public static int cell = 20;
	Block block = new Block();
	Ground ground = new Ground();

	@Override//画整个窗体
	public void paint(Graphics g) {
		g.setColor(Color.yellow);
		g.fill3DRect(0, 0, width * cell, height * cell, true);
		block.drawBlock(g);
		ground.drawGround(g);
	}

	public static void main(String[] args) {
		GamePanel gamePanel = new GamePanel();
		gamePanel.setTitle("俄罗斯方块");
		gamePanel.setSize(width * cell, height * cell);
		
		WinControl win = new WinControl();
		gamePanel.addWindowListener(win);
		
		KeyControl key = new KeyControl();
		gamePanel.addKeyListener(key);
		key.setGround(gamePanel.ground);
		key.setBlock(gamePanel.block);
		key.setGamePanel(gamePanel);
	
		gamePanel.block.setGround(gamePanel.ground);
		gamePanel.setVisible(true);
		while (true) {
			gamePanel.repaint();
			try {
				Thread.sleep(1000);//停留时间
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			gamePanel.block.block_y++;
			gamePanel.block.toGround();
			gamePanel.ground.clear();
			gamePanel.ground.over();
		}
	}

}
