package arquiteturas.designPatterns.command;

//Concrete Command
class ConcreteCommand implements Command {
 private Receiver receiver;

 public ConcreteCommand(Receiver receiver) {
     this.receiver = receiver;
 }

 @Override
 public void execute() {
     receiver.performAction();
 }
}
