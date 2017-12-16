package mytimer.util;

import java.util.Arrays;
import java.util.List;

public class TimeCount {
    private int hour = 0, minute = 0, second = 0;

    public TimeCount countUpSeconds(int secDelta) {
        if(secDelta == 0) return this;

        second += secDelta;
        List<Integer> tmp = TimeCount.divmod(second, 60);
        if(tmp.get(0) == 0) return this;

        second = tmp.get(1);
        return countUpMinutes(tmp.get(0));
    }
    public TimeCount countUpMinutes(int minDelta) {
        if(minDelta == 0) return this;

        minute += minDelta;
        List<Integer> tmp = TimeCount.divmod(minute, 60);
        if(tmp.get(0) == 0) return this;

        minute = tmp.get(1);
        return countUpHours(tmp.get(0));
    }
    public TimeCount countUpHours(int hourDelta) {
        if(hourDelta == 0) return this;

        hour += hourDelta;
        return this;
    }

    // Python-like divmod
    private static List<Integer> divmod(int a, int b) {
        return Arrays.asList(a / b, a % b);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d.%02d", hour, minute, second);
    }
}