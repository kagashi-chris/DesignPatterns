package com.zhen.designPatterns.behavioral.Command;

import java.util.ArrayList;
import java.util.List;

public class SimpleRemoteControl {

    Command[] commands = new Command[2];
    List<Command> commandList = new ArrayList<>();

    public SimpleRemoteControl() {
    }

    public void setCommand(int buttonNumber, Command command)
    {
        if(buttonNumber > 2)
        {
            System.out.println("There are only 2 buttons!");
            return;
        }
        else if(buttonNumber < 1)
        {
            System.out.println("That's not a real button!");
            return;
        }
        commands[buttonNumber-1] = command;

    }

    public void buttonWasPressed(int buttonNumber)
    {

        commands[buttonNumber-1].execute();
        commandList.add(commands[buttonNumber-1]);
    }

    public void undoButtonWasPressed()
    {
        int lastIndex = commandList.size()-1;
        commandList.get(lastIndex).undo();
        commandList.remove(lastIndex);
    }

}
