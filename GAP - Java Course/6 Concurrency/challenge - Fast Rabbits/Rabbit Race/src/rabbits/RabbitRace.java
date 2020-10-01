package rabbits;

class RabbitRace {

  public Thread createThreadRabbit(int i) {
    /*TODO_1*/ return null;
  }

  public Thread createRunnableRabbit(int i) {
    /*TODO_2*/ return null;
  }

  public Thread getCorrespondingRabbitImplementation(int startPosition) {
    /*TODO_3*/ return null;
  }

  public void makeTheRabbitRun(Thread rabbit) {
    /*TODO_4*/
  }

  public void race() {
    for (int i = 0; i < 10; i++) {
      Thread rabbit = getCorrespondingRabbitImplementation(i);
      makeTheRabbitRun(rabbit);
    }
  }

}