public class CleanCodeTest {


    public static void main(String[] args) {
        // 검색하기 쉬운 이름을 사용하라

        // case 1
        int[] t = new int[34];
        int s = 0;
        for (int j = 0; j < 34; j++) {
            s += (t[j] * 4) / 5;
        }

        // case 2
        int realDayPerIdealDay = 4;
        int WORK_DAYS_PER_WEEK = 5;
        int NUMBER_OF_TASKS = 34;
        int[] taskEstimate = new int[NUMBER_OF_TASKS];
        int sum = 0;
        for (int i = 0; i < NUMBER_OF_TASKS; i++) {
            int realTaskDays = taskEstimate[i] * realDayPerIdealDay;
            int realTaskWeeks = realTaskDays / WORK_DAYS_PER_WEEK;
            sum += realTaskWeeks;
        }
    }
}
