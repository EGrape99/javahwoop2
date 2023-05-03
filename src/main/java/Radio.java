public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            setToMaxStation();
            return;
        }
        if (newCurrentStation > 9) {
            setToMinStation();
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        int target = currentStation + 1;
        setCurrentStation(target);
    }

    public void prevStation() {
        int target = currentStation - 1;
        setCurrentStation(target);
    }

    public void setToMaxStation() {
        currentStation = 9;
    }

    public void setToMinStation() {
        currentStation = 0;
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            setToMinVolume();
            return;
        }
        if (newCurrentVolume > 100) {
            setToMaxVolume();
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
