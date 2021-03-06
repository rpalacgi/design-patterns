package ua.cn.dmitrykrivenko.command;

/**
 * Invoker.
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class RemoteControl {

	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	public RemoteControl() {
		onCommands = new Command[5];
		offCommands = new Command[5];

		Command noCommand = new NoCommand();

		for (int i = 0; i < 5; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}

	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
}
