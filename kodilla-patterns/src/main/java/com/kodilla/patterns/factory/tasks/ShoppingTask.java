package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    final String taskName;
    boolean isDone = false;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Task " + taskName + " : need to buy " + whatToBuy + " in an amount " + quantity);
        isDone = true;

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isDone;
    }
}
