package model;

import java.util.LinkedList;
import java.util.List;

public class HistoryManager {
  private static final Logger logger = Logger.getInstance();

  public List<DocMemento> states = new LinkedList<DocMemento>();
  private Integer index = 0;

  public void saveMemento(DocMemento memento) {
    for(Integer i = index; i < states.size(); i++) {
      states.remove(i.intValue());
    }

    states.add(index, memento);
    index++;
  }

  public DocMemento undo() {
    Integer i = index - 2;

    if(i >= 0 && i < states.size()) {
      index = i + 1;
      return states.get(i);
    }

    return null;
  }

  public DocMemento redo() {
    if(index < states.size()) {
      logger.log(HistoryManager.class, "Redo: " + states.get(index).getState());

      DocMemento nextState = states.get(index);
      index++;
      return nextState;
    }

    return null;
  }
}
