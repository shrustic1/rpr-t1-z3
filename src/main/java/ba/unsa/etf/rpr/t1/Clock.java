package main.java.ba.unsa.etf.rpr.t1;

public class Clock {

    private int hours;
    private int minutes;
    private int seconds;

    Clock(int minutes, int minute, int sekunde) { set(hours,minutes,seconds); }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void set(int hours, int minute, int seconds) {
        this.hours=hours; this.minutes=minutes; this.seconds=seconds;
    }
    public void move() {
        this.seconds++;
        if (this.seconds==60) {
            this.seconds=0;
            this.minutes++;
        }
        if (this.minutes==60) {
            this.minutes=0;
            this.hours++;
        }
        if (this.hours==24)
            this.hours=0;
    }
    public void next(){
        this.seconds++;
        if (this.seconds==60) {
            this.minutes++;
            this.seconds=0;
        }
        if (this.minutes==60){
            this.minutes=0;
            this.hours++;
        }
        if (this.hours==24){
            this.hours=0;
        }
    }
    public void previous() {
        seconds--;
        if (seconds==-1) { seconds=59; minutes--; }
        if (minutes==-1) { minutes=59; hours--; }
        if (hours==-1) hours=23;
    }
    public void move(int seconds) {
        if (seconds>0) for (int i=0; i<seconds; i++) next();
		else for (int i=0; i<-seconds; i++) previous();
    }
    public String toString (){
        return new StringBuilder().append(this.hours).append(this.minutes).append(this.seconds).toString();
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public static void Main (String[] args){
        Clock s = new Clock(15,30,45);
        s.next();
        System.out.println(s);
        s.move(-48);
        System.out.println(s);
        s.set(0,0,0);
        System.out.println(s);
    }
}
