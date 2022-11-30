package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    OutputView outputView = new OutputView();

    // 구입금액 입력
    public int inputPurchase(int purchase) {
        outputView.startLotto();
        purchase = Integer.parseInt(Console.readLine());
        outputView.blank();

        return purchase;
    }

}
