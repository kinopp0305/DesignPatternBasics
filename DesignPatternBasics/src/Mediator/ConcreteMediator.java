package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private List<Colleague> colleagueList = new ArrayList<>();

    @Override
    public void addColleague(Colleague colleague) {
        colleagueList.add(colleague);
        // このMediatorを、Colleague側にも覚えておいてもらう
        colleague.setMediator(this);
    }

    @Override
    public void colleagueChanged() {
        int unUsedCount = 0;
        for (Colleague colleague : colleagueList) {
            if (colleague.getStatus().equals("未使用")) {
                unUsedCount += 1;
            }
        }

        String message;
        if (unUsedCount == 0) {    // 「未使用」が1つもない場合
            message = "もういっぱいです";
        } else {                   // 「未使用」がある場合
            message = "まだ使えます";
        }

        // Colleagueへメッセージを渡す
        for (Colleague colleague : colleagueList) {
            colleague.controlColleague(message);
        }
    }
}