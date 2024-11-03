package lotto;

import java.util.Optional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class WinningPrizeTest {

    @Test
    void 당첨_1등() {
        //given
        Optional<WinningPrize> winningPrize = WinningPrize.determineWinningPrize(6, false);
        //when
        WinningPrize expectWinningPrize = WinningPrize.FIRST;
        //then
        Assertions.assertThat(winningPrize.get()).isEqualTo(expectWinningPrize);
    }

    @Test
    void 당첨_2등() {
        //given
        Optional<WinningPrize> winningPrize = WinningPrize.determineWinningPrize(5, true);
        //when
        WinningPrize expectWinningPrize = WinningPrize.SECOND;
        //then
        Assertions.assertThat(winningPrize.get()).isEqualTo(expectWinningPrize);
    }

    @Test
    void 당첨_3등() {
        //given
        Optional<WinningPrize> winningPrize = WinningPrize.determineWinningPrize(5, false);
        //when
        WinningPrize expectWinningPrize = WinningPrize.THIRD;
        //then
        Assertions.assertThat(winningPrize.get()).isEqualTo(expectWinningPrize);
    }

    @Test
    void 당첨_4등() {
        //given
        Optional<WinningPrize> winningPrize = WinningPrize.determineWinningPrize(4, false);
        //when
        WinningPrize expectWinningPrize = WinningPrize.FOURTH;
        //then
        Assertions.assertThat(winningPrize.get()).isEqualTo(expectWinningPrize);
    }

    @Test
    void 당첨_5등() {
        //given
        Optional<WinningPrize> winningPrize = WinningPrize.determineWinningPrize(3, false);
        //when
        WinningPrize expectWinningPrize = WinningPrize.FIFTH;
        //then
        Assertions.assertThat(winningPrize.get()).isEqualTo(expectWinningPrize);
    }

    @Test
    void 당첨_실패() {
        //given
        Optional<WinningPrize> winningPrize = WinningPrize.determineWinningPrize(2, false);
        //when, then
        Assertions.assertThat(winningPrize.isEmpty()).isEqualTo(true);
    }
}