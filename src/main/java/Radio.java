public class Radio {


    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0) {
            if (currentStation < 10) {
                this.currentStation = currentStation;
            }

        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0) {
            if (currentVolume <= 10) {
                this.currentVolume = currentVolume;
            }

        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else return;
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else return;
    }

    public void next() {
        if (currentStation == 9) {
            this.currentStation = 0;
        } else
            this.currentStation = this.currentStation + 1;
    }

    public void prev() {
        if (currentStation == 0) {
            this.currentStation = 9;
        } else
            this.currentStation = this.currentStation - 1;
    }

}