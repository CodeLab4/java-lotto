package lotto.view;

public enum LottoConstant {

    BuyLotto("구입금액을 입력해 주세요."),
    BoughtLotto("개를 구매했습니다."),
    InputWinnerLotto("당첨 번호를 입력해주세요"),
    InputBonusLotto("보너스 번호를 입력해주세요."),
    StatisticsLotto("당첨 통계"),
    Stick("---"),
    Fifth("3개 일치 (5,000원) - "),
    Fourth("4개 일치 (50,000원) - "),
    Third("5개 일치 (1,500,000원) - "),
    Second("5개 일치, 보너스 볼 일치 (30,000,000원) - "),
    First("6개 일치 (2,000,000,000원) - "),

    Count("개"),
    RateOfReturn("총 수익률은 "),
    ReturnResult("%입니다.");


    private final String value;

    LottoConstant(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
