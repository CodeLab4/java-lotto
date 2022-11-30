package lotto.controller;

import java.util.ArrayList;
import java.util.List;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {

    private int lottoInput;
    private int lottoCount;
    private List<Integer> winnerLotto = new ArrayList<>();
    private int bonusNumber;

    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void startGame() {
        lottoInput = inputView.inputPurchase(lottoInput);
        lottoCount = calculateLottoCount(lottoInput);

        outputView.purchaseLotto(lottoCount);
    }

    public int calculateLottoCount(int lottoPurchase) {
        int lottoCount = lottoPurchase / 1000;

        return lottoCount;
    }
}
