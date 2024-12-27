package simula.runtime;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Vector;

import javax.swing.JFrame;

/**
 * RTS Frame used by RTS_Drawing and RTS_ConsolePanel
 */
@SuppressWarnings("serial")
public class RTS_Frame extends JFrame {
	private static Vector<JFrame> openFrames;
	
	/**
	 * Create a new RTS_Frame
	 */
	public RTS_Frame() {
		addWindowListener(this);
		if(openFrames == null) openFrames = new Vector<JFrame>();
		openFrames.add(this);
	}

	private void close() {
		openFrames.remove(this);
//		System.out.println("Close Frame "+frame);
//		popUpError("openFrames.size="+openFrames.size());
		if(openFrames.size() == 0) {
			System.exit(0);
		}
	}
	
	private static void addWindowListener(RTS_Frame frame) {
		frame.addWindowListener(new WindowListener() {
			@Override public void windowOpened(WindowEvent e) {}
			@Override public void windowClosed(WindowEvent e) {}
			@Override public void windowIconified(WindowEvent e) {}
			@Override public void windowDeiconified(WindowEvent e) {}
			@Override public void windowActivated(WindowEvent e) {}
			@Override public void windowDeactivated(WindowEvent e) {}

			@Override
			public void windowClosing(WindowEvent e) {
				if (e.getID() == WindowEvent.WINDOW_CLOSING) {
					frame.close();
				}
			}
		});
	}

}
