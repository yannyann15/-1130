package com.company;

public class AlarmClock extends Clock {
    public String alarmTime;

    public AlarmClock(String time) {
        super(time);
    }

    public void setAlarm(String time) {
         alarmTime = time;
    }

    public void alarm() {
        if (this.time.equals(alarmTime)) {
            System.out.println("アラームが鳴りました!");
        }

    }


}
