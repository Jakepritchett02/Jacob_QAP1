public class Time {
        private int hours, minutes, seconds;

        public Time() {
            hours = 0;
            minutes = 0;
            seconds = 0;
        }

        public Time( int hours, int minutes, int seconds) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }

        public int getHours() {return hours;}

        public void setHours(int hours) {this.hours = hours;}

        public int getMinutes(){return this.minutes;}

        public void setMinutes(int minutes) {this.minutes = minutes;}

        public int getSeconds() {return seconds;}

        public void setSeconds(int seconds) {this.seconds = seconds;}

        public void setTime(int hours, int minutes, int seconds) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }
        public void nextSecond(){
            this.seconds ++;
        }
        public void previousSecond(){
            this.seconds --;
        }
        public String toString() {

            String h = String.valueOf(this.hours);
            String m = String.valueOf(this.minutes);
            String s = String.valueOf(this.seconds);
            if(this.hours <10)
                h = ("0"+ this.hours);
            if(this.minutes<10)
                m = ("0"+ this.minutes);
            if(this.seconds<10)
                s =("0"+ this.seconds);
            return (h+":" + m+":" +s);
        }

    }


