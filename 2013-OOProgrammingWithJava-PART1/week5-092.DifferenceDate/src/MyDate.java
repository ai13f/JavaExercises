public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears (MyDate comparedDate){

        if ( this.year < comparedDate.year){

            int _day = this.day;
            int _month = this.month;
            int _year = this.year;

            day = comparedDate.day;
            month = comparedDate.month;
            year = comparedDate.year;

            comparedDate.day = _day;
            comparedDate.month = _month;
            comparedDate.year = _year;
        }

       int result;

       if ((this.month < comparedDate.month) || (this.month == comparedDate.month && this.day < comparedDate.day))
          result = (Math.abs(this.year - comparedDate.year) - 1);

       else
           result = Math.abs(this.year - comparedDate.year);

        return result;
    }


}
