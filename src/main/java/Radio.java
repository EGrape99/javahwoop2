public class Radio {
    private int currentStation;
    private int currentVolume;
    private int size = 10;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int size) {
        this.size = size;
        maxStation = minStation + size - 1;
    }

    public Radio() {
    }

    public int getSize() {
        return size;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setToMaxStation() {
        currentStation = maxStation;
    }

    public void setToMinStation() {
        currentStation = minStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            setToMaxStation();
            return;
        }
        if (newCurrentStation > maxStation) {
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

    public void setToMaxVolume() {
        currentVolume = maxVolume;
    }

    public void setToMinVolume() {
        currentVolume = minVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            setToMinVolume();
            return;
        }
        if (newCurrentVolume > maxVolume) {
            setToMaxVolume();
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
