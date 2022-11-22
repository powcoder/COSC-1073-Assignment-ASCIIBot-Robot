https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package robot.ascii;

import com.googlecode.lanterna.terminal.swing.SwingTerminalFrame;

import control.RobotControl;
import robot.Robot;
import robot.ascii.impl.Arm;
import robot.ascii.impl.Bar;
import robot.ascii.impl.Block;
import robot.ascii.impl.Drawable;
import robot.impl.RobotImpl;
import robot.impl.RobotInitException;

public class ASCIIBot extends AbstractASCIIBot implements Robot {
	private Arm arm;
	private Bar bar;
	private Block block;
	public static void main(String[] args) {
		new RobotControl().control(new ASCIIBot(), null, null);
	}

	// MUST CALL DEFAULT SUPERCLASS CONSTRUCTOR!
	public ASCIIBot() {
		super();
	}

	@Override
	public void init(int[] barHeights, int[] blockHeights, int height, int width, int depth) {
		// in addition to validating init params this also sets up keyboard support for
		// the ASCIIBot!
		try {
			RobotImpl.validateInitParams(this, barHeights, blockHeights, height, width, depth);
		} catch (RobotInitException e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}
		// write init code here to place bars, blocks and initial arm position
		// suggest writing a separate method e.g. initImpl()

		// clears previous frame/screen
		terminalFrame.clearScreen();
		// demo drawing method (for example purposes only)
		arm = new Arm(height, width, depth);
		arm.draw(terminalFrame);

		bar = new Bar(barHeights);
		bar.draw(terminalFrame);

		block = new robot.ascii.impl.Block(blockHeights);
		block.draw(terminalFrame);

		// call this to delay/animate and write out contents after draw
		// (i.e. after each robot move)
		// call this to delay/animate and write out contents after draw
		// (i.e. after each robot move)
		delayAnimation();
	}

	// simple demo draw method
	/*private void demoDraw() {
		// (0 index for terminal) hence -1
		int maxRow = terminalFrame.getTerminalSize().getRows() - 1;
		int maxCol = terminalFrame.getTerminalSize().getColumns() - 1;

		terminalFrame.setForegroundColor(Drawable.BAR_COLOR_FG);
		terminalFrame.setBackgroundColor(Drawable.BAR_COLOR_BG);

		// hard coded for demo purposes only
		int barHeight = 7;

		// draw a 'bar' of height "draw_height" in middle column with scaling
		// NOTE: we translate to terminal co-ordinates where 0,0 is top left!
		int rowPos = maxRow;
		for (int barSize = 0; barSize < barHeight; barSize++) {
			terminalFrame.setCursorPosition(maxCol / 2, rowPos);
			terminalFrame.putCharacter(Drawable.BAR_CHAR);
			rowPos--;
		}
	}*/

	@Override
	public void pick() {
		// implement methods to draw robot environment using your implementation of
		// Arm.draw(), Bar.draw() etc.
		System.out.println("pick()");
		terminalFrame.clearScreen();
		arm.pick();
		arm.draw(terminalFrame);
		bar.draw(terminalFrame);
		block.draw(terminalFrame);
		delayAnimation();
	}
	
	
	@Override
	public void drop() {
		System.out.println("drop()");
		terminalFrame.clearScreen();
		arm.drop();
		arm.draw(terminalFrame);
		bar.draw(terminalFrame);
		block.draw(terminalFrame);
		delayAnimation();
	}

	@Override
	public void up() {
		System.out.println("up()");
		terminalFrame.clearScreen();
		arm.up();
		arm.draw(terminalFrame);
		bar.draw(terminalFrame);
		block.draw(terminalFrame);
		delayAnimation();
	}

	@Override
	public void down() {
		System.out.println("down()");
		terminalFrame.clearScreen();
		arm.down();
		arm.draw(terminalFrame);
		bar.draw(terminalFrame);
		block.draw(terminalFrame);
		delayAnimation();
	}

	@Override
	public void contract() {
		System.out.println("contract()");
		terminalFrame.clearScreen();
		arm.contract();
		arm.draw(terminalFrame);
		bar.draw(terminalFrame);
		block.draw(terminalFrame);
		delayAnimation();
	}

	@Override
	public void extend( ) {
		System.out.println("extend()");
		terminalFrame.clearScreen();
		arm.extend();
		arm.draw(terminalFrame);
		bar.draw(terminalFrame);
		block.draw(terminalFrame);
		delayAnimation();
	}

	@Override
	public void lower() {
		System.out.println("lower()");
		terminalFrame.clearScreen();
		arm.lower();
		arm.draw(terminalFrame);
		bar.draw(terminalFrame);
		block.draw(terminalFrame);
		delayAnimation();
	}

	@Override
	public void raise() {
		System.out.println("raise()");
		terminalFrame.clearScreen();
		arm.raise();
		arm.draw(terminalFrame);
		bar.draw(terminalFrame);
		block.draw(terminalFrame);
		delayAnimation();
		
	}
}
