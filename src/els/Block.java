package els;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class Block {
	//起点坐标
	int block_x = GamePanel.width / 2;
	int block_y = 0;

	int[] a1 = { 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 };
	int[] a3 = { 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0 };
	int[] a2 = { 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0 };
	int[] a4 = { 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0 };

	ArrayList A = new ArrayList();

	int[] b1 = { 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0 };
	int[] b2 = { 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0 };
	int[] b3 = { 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0 };
	int[] b4 = { 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0 };

	ArrayList B = new ArrayList();

	int[] c1 = { 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0 };
	int[] c2 = { 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0 };
	int[] c3 = { 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0 };
	int[] c4 = { 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0 };

	ArrayList C = new ArrayList();

	int[] d1 = { 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0 };
	int[] d2 = { 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0 };
	int[] d3 = { 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0 };
	int[] d4 = { 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0 };

	ArrayList D = new ArrayList();

	int[] e1 = { 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0 };
	int[] e2 = { 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0 };
	int[] e3 = { 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 };
	int[] e4 = { 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0 };

	ArrayList E = new ArrayList();

	int[] f1 = { 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0 };
	int[] f2 = { 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 };
	int[] f3 = { 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0 };
	int[] f4 = { 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 };

	ArrayList F = new ArrayList();

	int[] g1 = { 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0 };
	int[] g2 = { 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0 };
	int[] g3 = { 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0 };
	int[] g4 = { 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0 };

	ArrayList G = new ArrayList();

	ArrayList[] BLK = new ArrayList[7];
	int[] now_block;//当前坐标

	public Block() {
		A.add(a1);
		A.add(a2);
		A.add(a3);
		A.add(a4);

		B.add(b1);
		B.add(b2);
		B.add(b3);
		B.add(b4);

		C.add(c1);
		C.add(c2);
		C.add(c3);
		C.add(c4);

		D.add(d1);
		D.add(d2);
		D.add(d3);
		D.add(d4);

		E.add(e1);
		E.add(e2);
		E.add(e3);
		E.add(e4);

		F.add(f1);
		F.add(f2);
		F.add(f3);
		F.add(f4);

		G.add(g1);
		G.add(g2);
		G.add(g3);
		G.add(g4);

		BLK[0] = A;
		BLK[1] = B;
		BLK[2] = C;
		BLK[3] = D;
		BLK[4] = E;
		BLK[5] = F;
		BLK[6] = G;

		makeBlock();
	}

	int m;
	int n;

	public void makeBlock() {
		block_x = GamePanel.width / 2;
		block_y = 0;
		//产生随机数组
		Random r = new Random();
		m = r.nextInt(7);
		n = r.nextInt(4);
		if (m >= 0 && m < 7 && n >= 0 && n < 4) {
			ArrayList list = BLK[m];
			now_block = (int[]) list.get(n);
		} else {
			makeBlock();
		}

	}
    //画形状
	public void drawBlock(Graphics g) {
		g.setColor(Color.red);
		for (int i = 0; i < now_block.length; i++) {
			int x = block_x + i % 4;
			int y = block_y + i / 4;
			if (now_block[i] == 1) {
				g.fill3DRect(GamePanel.cell * x, GamePanel.cell * y,
						GamePanel.cell, GamePanel.cell, true);
			}
		}
	}
    //引用ground
	Ground ground;
	public void setGround(Ground a) {
		ground = a;
	}
    //形成障碍物
	public void toGround() {
		boolean b = false;
		//形状到达底部形成障碍物
		for (int i = 0; i < now_block.length; i++) {
			int x = block_x + i % 4;
			int y = block_y + i / 4;
			if (now_block[i] == 1 && y == GamePanel.height - 1) {
				b = true;
				break;
			}
		}
        //形状碰上形状形成障碍物
		for (int i = 0; i < now_block.length; i++) {
			int x = block_x + i % 4;
			int y = block_y + i / 4;
			if (now_block[i] == 1) {
				for (int m = 0; m < ground.ground.length; m++) {
					for (int n = 0; n < ground.ground[m].length; n++) {
						if (ground.ground[m][n] == 1 && y + 1 == m && x == n) {
							b = true;
							break;
						}
					}
				}
			}
		}

		if (b == true) {
			for (int i = 0; i < now_block.length; i++) {
				int x = block_x + i % 4;
				int y = block_y + i / 4;
				if (now_block[i] == 1) {
					ground.ground[y][x] = 1;
				}
			}
			makeBlock();
		}
	}

}
