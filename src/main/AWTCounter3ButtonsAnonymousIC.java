package main;

import java.awt.*;
import java.awt.event.*;

public class AWTCounter3ButtonsAnonymousIC extends Frame {
	private TextField tfCount;
	private Button btnCountUp, btnCountDown, btnReset;
	private int count = 0;

	public AWTCounter3ButtonsAnonymousIC() {

		setLayout(new FlowLayout());
		add(new Label("Counter"));
		tfCount = new TextField("0", 10);
		tfCount.setEditable(false);
		add(tfCount);

		btnCountUp = new Button("Count Up");
		add(btnCountUp);
		btnCountDown = new Button("Count Down");
		add(btnCountDown);
		btnReset = new Button("Reset");
		add(btnReset);

		AllButtonsListener listener = new AllButtonsListener();
		btnCountUp.addActionListener(listener);
		btnCountDown.addActionListener(listener);
		btnReset.addActionListener(listener);

		setTitle("AWT Counter");
		setSize(400, 100);
		setVisible(true);

	}

	public static void main(String[] args) {
		new AWTCounter3ButtonsAnonymousIC();
	}

	private class AllButtonsListener implements ActionListener {

		public void actionPerformed(ActionEvent evt) {

			String btnLabel = evt.getActionCommand();

			if (btnLabel.equals("Count Up")) {
				++count;
			} else if (btnLabel.equals("Count Down")) {
				--count;
			} else {
				count = 0;
			}

			tfCount.setText(count + "");
		}
	}
}