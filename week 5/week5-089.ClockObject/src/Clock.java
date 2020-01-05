public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
    
    
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours = new BoundedCounter(23);
        this.hours.setValue(hoursAtBeginning);
        this.minutes = new BoundedCounter(59);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds = new BoundedCounter(59);
        this.seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() {
        seconds.next();
        if(seconds.getValue() == 0){
            minutes.next();
        }
        if(minutes.getValue() == 0 && seconds.getValue() == 0){
            hours.next();
        }
    }
    
    @Override
    public String toString() {
        return hours +":" + minutes +":"+seconds;
    }
}
