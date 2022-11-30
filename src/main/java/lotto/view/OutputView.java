package lotto.view;

import java.util.List;
import java.util.function.LongToDoubleFunction;
import lotto.controller.LottoController;

public class OutputView {

    // 로또 구입 금액을 입력해주세요
    public void startLotto() {
        System.out.println(LottoConstant.BuyLotto.getValue());
    }

    // 개를 구입했습니다.
    public void purchaseLotto(int lottoCount) {
        System.out.println(lottoCount + LottoConstant.BoughtLotto.getValue());
    }

    // 당첨번호를 입력해주세요
    public void putWinnerNumber() {
        System.out.println(LottoConstant.InputWinnerLotto.getValue());
    }

    // 보너스 번호를 입력해주세요
    public void putBonusNumber() {
        System.out.println(LottoConstant.InputBonusLotto.getValue());
    }

    // 당첨통계
    public void printResult() {
        System.out.println(LottoConstant.StatisticsLotto.getValue());
        System.out.println(LottoConstant.Stick.getValue());
    }

    // 당첨통계 내용
    public void printResultBody(int fifth, int fourth, int third, int second, int first, int rateOfReturn) {
        System.out.println(LottoConstant.Fifth.getValue() + fifth + LottoConstant.Count.getValue());
        System.out.println(LottoConstant.Fourth.getValue() + fourth + LottoConstant.Count.getValue());
        System.out.println(LottoConstant.Third.getValue() + third + LottoConstant.Count.getValue());
        System.out.println(LottoConstant.Second.getValue() + second + LottoConstant.Count.getValue());
        System.out.println(LottoConstant.First.getValue() + first + LottoConstant.Count.getValue());
        System.out.println(LottoConstant.RateOfReturn.getValue() + rateOfReturn + LottoConstant.ReturnResult.getValue());

    }

    public void blank() {
        System.out.println();
    }

}
