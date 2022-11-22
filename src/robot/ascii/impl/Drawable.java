https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package robot.ascii.impl;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.terminal.swing.SwingTerminalFrame;

public interface Drawable
{
	// set robot speed to 0 initially? (for testing)
	public static final boolean START_PAUSED=false;
	
	public static final char BAR_CHAR=' ';
	
	public static final TextColor.ANSI[] BLOCK_COLORS_FG = new TextColor.ANSI[]
	{ TextColor.ANSI.YELLOW, TextColor.ANSI.RED, TextColor.ANSI.BLUE };
	public static final TextColor.ANSI[] BLOCK_COLORS_BG = new TextColor.ANSI[]
	{ TextColor.ANSI.YELLOW, TextColor.ANSI.RED, TextColor.ANSI.BLUE };
	public static final TextColor ARM_COLOR_FG = TextColor.ANSI.WHITE;
	public static final TextColor ARM_COLOR_BG = TextColor.ANSI.WHITE;
	public static final TextColor BAR_COLOR_FG = TextColor.ANSI.GREEN;
	public static final TextColor BAR_COLOR_BG = TextColor.ANSI.GREEN;
	
	public abstract void draw(SwingTerminalFrame terminalFrame);
}
