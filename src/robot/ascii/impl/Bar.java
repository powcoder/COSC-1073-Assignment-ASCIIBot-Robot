https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package robot.ascii.impl;

import com.googlecode.lanterna.terminal.swing.SwingTerminalFrame;

public class Bar implements Drawable
{
	private int barHeights[];
	public Bar(int barHeights[]) {
		this.barHeights = barHeights;
		
	}
	@Override
	public void draw(SwingTerminalFrame terminalFrame)
	{
		
		int maxRow = terminalFrame.getTerminalSize().getRows() - 1;
		int maxCol = terminalFrame.getTerminalSize().getColumns() - 1;

		terminalFrame.setForegroundColor(Drawable.BAR_COLOR_FG);
		terminalFrame.setBackgroundColor(Drawable.BAR_COLOR_BG);

	

		int barX = 2;
		int rowPos = maxRow;
		for (int i = 0; i < 8; ++i) {
			for (int barSize = 0; barSize < barHeights[i]; barSize++) {
				terminalFrame.setCursorPosition(barX, rowPos);
				terminalFrame.putCharacter(Drawable.BAR_CHAR);
				rowPos--;
			}
			barX += 1;
			rowPos = maxRow;
		}
		
	}
}
