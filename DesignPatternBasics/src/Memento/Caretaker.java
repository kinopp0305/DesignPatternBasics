package Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private final Originator originator;
    private final List<Object> mementoList = new ArrayList<>();
    private final List<Object> redoList = new ArrayList<>();

    public Caretaker(Originator originator) {
        this.originator = originator;
    }

    public void createSnapShot() {
        // undoの作業が一旦切れるのでredoリストを一旦リセット
        if (!redoList.isEmpty()) {
            redoList.clear();
        }
        this.mementoList.add(this.originator.createMemento());
    }

    public void undo() {
        int index = mementoList.size();
        if (index > 1) {
            System.out.println("undo実施");
            redoList.add(mementoList.get(index - 1));
            mementoList.remove(index - 1);
            Object memento = this.getLastMemento();
            originator.restoreMemento(memento);
        }
    }

    public void redo() {
        int index = redoList.size();
        if (index > 0) {
            System.out.println("redo実施");
            Object memento = this.getLastRedo();
            originator.restoreMemento(memento);
            redoList.remove(index - 1);
            // やり直した内容を、再びundoできるようundo履歴にも戻しておく
            mementoList.add(memento);
        }
    }

    // 直近のMementoを取得
    private Object getLastMemento() {
        int index = mementoList.size();
        if (index < 1) {
            return null;
        }
        return mementoList.get(index - 1);
    }

    // 直近のRedoListを取得
    private Object getLastRedo() {
        int index = redoList.size();
        if (index < 1) {
            return null;
        }
        return redoList.get(index - 1);
    }
}