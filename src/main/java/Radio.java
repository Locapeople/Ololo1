public class Radio {
    private static final int minStation = 0;
    private int maxStation;
    private static final int minVolume = 0;
    private static final int maxVolume = 100;
    private int stationNumber = minStation;
    private int volume = minVolume;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int numStations) {
        this.maxStation = numStations - 1;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void next() {
        if (stationNumber < maxStation) {
            stationNumber = stationNumber + 1;
        } else {
            stationNumber = minStation;
        }
    }

    public void prev() {
        if (stationNumber > minStation) {
            stationNumber = stationNumber - 1;
        } else {
            stationNumber = maxStation;
        }
    }

    public void setStation(int number) {
        if (number >= minStation && number <= maxStation) {
            stationNumber = number;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void volumeUp() {
        if (volume < maxVolume) {
            volume = volume + 1;
        }
    }

    public void volumeDown() {
        if (volume > minVolume) {
            volume = volume - 1;
        }
    }
}
