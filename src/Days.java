public class Days  {
    DaysOfTheWeek monday=DaysOfTheWeek.MONDAY;
    DaysOfTheWeek thursday=DaysOfTheWeek.THURSDAY;
    DaysOfTheWeek wednesday=DaysOfTheWeek.WEDNESDAY;
    DaysOfTheWeek tuesday=DaysOfTheWeek.TUESDAY;
    DaysOfTheWeek friday=DaysOfTheWeek.FRIDAY;
    DaysOfTheWeek sunday=DaysOfTheWeek.SUNDAY;
    DaysOfTheWeek saturday=DaysOfTheWeek.SATURDAY;

    @Override
    public String toString() {
        System.out.println(monday+" Рабочий день ");
        System.out.println(thursday+" Рабочий день ");
        System.out.println(wednesday+"Рабочий день ");
        System.out.println(tuesday+" Рабочий день ");
        System.out.println(friday+" Рабочий день ");
        System.out.println(sunday+" Выходной ");
        System.out.println(saturday+" Выходной ");

        return null;
    }
}
