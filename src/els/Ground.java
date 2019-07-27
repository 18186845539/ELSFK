package els;

import java.awt.Color;
import java.awt.Graphics;

public class Ground {
	int ground[][] = new int[GamePanel.height][GamePanel.width];

	public void drawGround(Graphics g) {
		g.setColor(Color.blue);
		for (int i = 0; i < ground.length; i++) {
			for (int j = 0; j < ground[i].length; j++) {
				if (ground[i][j] == 1) {
					g.fill3DRect(j * GamePanel.cell, i * GamePanel.cell,
							GamePanel.cell, GamePanel.cell, true);
				}
			}
		}
	}
    //清除一整行障碍物
	/**
	 * 清除一整行障碍物
	 */
	public void clear() {
		for (int i = 0; i < ground.length; i++) {
			int c = 0;
			for (int j = 0; j < ground[i].length; j++) {
				if (ground[i][j] == 1) {
					c++;
				}
			}
			if (c == GamePanel.width) {
				for (int k = i; k > 0; k--) {
					for (int m = 0; m < ground[k].length; m++) {
						ground[k][m] = ground[k - 1][m];
					}

				}
			}
		}
	}
    //结束游戏
	public void over() {
		for (int q = 0; q < ground.length; q++) {
			for (int w = 0; w < ground[q].length; w++) {
				if (ground[q][w] == 1 && q == 0) {
					for (int m = 0; m < ground.length; m++) {
						for (int n = 0; n < ground[q].length; n++) {
							ground[m][n] = 0;
						}
					}
				}
			}
		}
	}
}
