https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package robot.ascii.impl;

import com.googlecode.lanterna.terminal.swing.SwingTerminalFrame;

import robot.RobotMovement;

public class Arm implements RobotMovement, Drawable {
	private int height;
	private int width;
	private int depth;

	
	public Arm(int height, int width, int depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
		
	}

	@Override
	public void draw(SwingTerminalFrame terminalFrame) {

		int maxRow = terminalFrame.getTerminalSize().getRows() - 1;
		int maxCol = terminalFrame.getTerminalSize().getColumns() - 1;
		
		terminalFrame.setForegroundColor(Drawable.ARM_COLOR_FG);
		terminalFrame.setBackgroundColor(Drawable.ARM_COLOR_BG);
		

		int rowPos = maxRow;
		int colPos = maxCol;
		int armX=0;
		
		// height
		for (int barSize = 0; barSize < height; barSize++) {
			terminalFrame.setCursorPosition(armX, rowPos);
			terminalFrame.putCharacter(Drawable.BAR_CHAR);
			rowPos--;
		}
		// weight
		for (int barSize = 0; barSize < width; barSize++) {
			terminalFrame.setCursorPosition(armX+1, rowPos+1);
			terminalFrame.putCharacter(Drawable.BAR_CHAR);
			armX++;
		}
		//depth
		for (int barSize = 0; barSize < depth; barSize++) {
			terminalFrame.setCursorPosition(width, rowPos+1);
			terminalFrame.putCharacter(Drawable.BAR_CHAR);
			rowPos++;
		} 
		
	}

	@Override
	public void pick() {

	}

	@Override
	public void drop() {

	}

	@Override
	public void up() {
		
		height++;
	}

	@Override
	public void down() {
		height--;
	}

	@Override
	public void contract() {
		width--;
	}

	@Override
	public void extend( ) {
		width++;
	}

	@Override
	public void lower() {
		depth++;
	}

	@Override
	public void raise() {
		depth--;

	}
}
