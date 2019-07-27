package els;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class KeyControl extends KeyAdapter {
	//引用ground
	Ground ground;
	public void setGround(Ground c) {
		ground = c;
	}
    //引用gamePanel
	GamePanel gamePanel;
	public void setGamePanel(GamePanel b) {
		gamePanel = b;
	}
	//引用block
	Block block;
	public void setBlock(Block a) {
		block = a;
	}
	/**
	 * @param e 按键对象
	 */
	public void keyPressed(KeyEvent e) {
		int a = e.getKeyCode();
		switch (a) {
		case 38:
			// 变方向
			ArrayList list = block.BLK[block.m];
			if (block.n == 0) {
				block.n = 1;
			} else if (block.n == 1) {
				block.n = 2;
			} else if (block.n == 2) {
				block.n = 3;
			} else if (block.n == 3) {
				block.n = 0;
			}
			block.now_block = (int[]) list.get(block.n);
			break;
		case 37:
			// 左
			gamePanel.repaint();
			boolean k = false;
			for (int i = 0; i < block.now_block.length; i++) {
				int x = block.block_x + i % 4;
				int y = block.block_y + i / 4;
				if (block.now_block[i] == 1 && x == 0) {
					k = true;
					break;
				}
			}
			if (k == false) {
				block.block_x--;
			}
			break;
		case 39:
			// 右
			gamePanel.repaint();
			boolean q = false;
			for (int i = 0; i < block.now_block.length; i++) {
				int x = block.block_x + i % 4;
				int y = block.block_y + i / 4;
				if (block.now_block[i] == 1 && x == GamePanel.width) {
					q = true;
					break;
				}
			}
			if (q == false) {
				block.block_x++;
			}
			break;
		case 40:
			// 下
			block.block_y++;
			break;
		case 32:
			// 急落
			boolean c = true;
			while (c) {
				block.block_y++;
				boolean b = false;
				for (int i = 0; i < block.now_block.length; i++) {
					int x = block.block_x + i % 4;
					int y = block.block_y + i / 4;
					if (block.now_block[i] == 1 && y == GamePanel.height - 1) {
						b = true;
						break;
					}
				}

				for (int i = 0; i < block.now_block.length; i++) {
					int x = block.block_x + i % 4;
					int y = block.block_y + i / 4;
					if (block.now_block[i] == 1) {
						for (int m = 0; m < ground.ground.length; m++) {
							for (int n = 0; n < ground.ground[m].length; n++) {
								if (ground.ground[m][n] == 1 && y + 1 == m
										&& x == n) {
									b = true;
									break;
								}
							}
						}
					}
				}
				if (b == true) {
					for (int i = 0; i < block.now_block.length; i++) {
						int x = block.block_x + i % 4;
						int y = block.block_y + i / 4;
						if (block.now_block[i] == 1) {
							ground.ground[y][x] = 1;
						}
					}
					block.makeBlock();
					c = false;
				}
			}
			break;
		default:
			break;
		}
	}
}
