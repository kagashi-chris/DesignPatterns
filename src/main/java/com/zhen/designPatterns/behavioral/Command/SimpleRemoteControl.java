package com.zhen.designPatterns.behavioral.Command;

import java.util.Stack;

public class SimpleRemoteControl {

    Command[] commands = new Command[2];
    Stack<Command> commandHistoryStack = new Stack<>();

    public SimpleRemoteControl() {
    }

    public void setCommand(Button button, Command command)
    {
        commands[button.ordinal()] = command;
    }

    public void buttonWasPressed(Button button)
    {
        commands[button.ordinal()].execute();
        commandHistoryStack.push(commands[button.ordinal()]);
    }

    public void undoButtonWasPressed()
    {
        commandHistoryStack.pop().undo();
    }

}
