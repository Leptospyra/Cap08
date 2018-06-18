public class Date {
    //fields
    private int year;
    private int month;
    private int day;
    int[] daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};

    //Constructs a new Date object to represent the given date.
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //Moves this Date object forward in time by the given number of days.
    public void addDays(int days){
        //this.day += days;
        int nDaysInYear = days;
        nDaysInYear += daysTo(this);

        int i=0;
        while (nDaysInYear >0){
            nDaysInYear -= daysInMonths[i];
            i++;
        }
    }

    //Moves this Date object forward in time by the given number of seven-day weeks.
    public void addWeeks(int weeks){
        this.day+=7;
    }

    //Returns the number of days that this Date must be adjusted to make it equal to the given other Date.
    public int daysTo(Date other){
        int soma = 0;
        for (int i=0;i<other.month;i++){
            soma+=daysInMonths[i-1];
            soma+=other.day;
        }
        return soma;
    }

    //Returns the day value of this date; for example, for the date 2006/07/22, returns 22.
    public int getDay(){
        return this.day;

    }

    //Returns the month value of this date; for example, for the date 2006/07/22, returns 7.
    public int getMonth(){
        return this.month;
    }

    //Returns the year value of this date; for example, for the date 2006/07/22, returns 2006.
    public int getYear(){
        return this.year;
    }

    //Returns true if year of this date is a leap year. A leap year occurs every four years, except for multiples of 100
    //that are not multiples of 400. For example, 1956, 1844, 1600, and 2000 are leap years, but 1983, 2002, 1700, and
    //1900 are not.
    public boolean isLeapYear(){
        return false;
    }
    //Returns a String representation of this date in year/month/day order, such as "2006/07/22".
    public String toString(){
        return (year+"/"+month+"/"+day);
    }

}
