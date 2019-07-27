package els;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WinControl extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);//关闭游戏窗体
	}

}
