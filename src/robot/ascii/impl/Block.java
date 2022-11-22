https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package robot.ascii.impl;

import com.googlecode.lanterna.terminal.swing.SwingTerminalFrame;

public class Block implements Drawable {
	
	private int blockHeights[];
	public Block(int blockHeights[]) {
		this.blockHeights = blockHeights;
		
	}
	
	@Override
	public void draw(SwingTerminalFrame terminalFrame) {
		int maxRow = terminalFrame.getTerminalSize().getRows() - 1;
		int maxCol = terminalFrame.getTerminalSize().getColumns() - 1;

	/*	terminalFrame.setForegroundColor(Drawable.BLOCK_COLORS_FG[0]);
		terminalFrame.setBackgroundColor(Drawable.BLOCK_COLORS_BG[0]);
		terminalFrame.setForegroundColor(Drawable.BLOCK_COLORS_FG[1]);
		terminalFrame.setBackgroundColor(Drawable.BLOCK_COLORS_BG[1]);
		terminalFrame.setForegroundColor(Drawable.BLOCK_COLORS_FG[2]);
		terminalFrame.setBackgroundColor(Drawable.BLOCK_COLORS_BG[2]); */

		

		int x1 = 1;
	
		int y1 = maxRow;
		int y2 = maxRow;
		int blockNum = blockHeights.length;

	
		
		
		for (int i = 0; i < blockNum; i++) {
			switch(blockHeights[i]){
			case 1 :
				terminalFrame.setForegroundColor(Drawable.BLOCK_COLORS_FG[0]);
				terminalFrame.setBackgroundColor(Drawable.BLOCK_COLORS_BG[0]);
				break;
			case 2 :
				terminalFrame.setForegroundColor(Drawable.BLOCK_COLORS_FG[1]);
				terminalFrame.setBackgroundColor(Drawable.BLOCK_COLORS_BG[1]);
				break;
			case 3 :
				terminalFrame.setForegroundColor(Drawable.BLOCK_COLORS_FG[2]);
				terminalFrame.setBackgroundColor(Drawable.BLOCK_COLORS_BG[2]);
			}
			if(i%2==1) {
			for (int barSize = 0; barSize < blockHeights[i]; barSize++) {
				terminalFrame.setCursorPosition(x1, y1);
				terminalFrame.putCharacter(Drawable.BAR_CHAR);
				y1--;
			}}else{
				for (int barSize = 0; barSize < blockHeights[i]; barSize++) {
					terminalFrame.setCursorPosition(x1+9, y2);	
					terminalFrame.putCharacter(Drawable.BAR_CHAR);
					y2--;
				}
			}
			
		
		}
		
	}
	
}
