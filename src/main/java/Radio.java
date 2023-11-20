public class Radio {
    int minStation = 0;
    int maxStation = 9;
    int minVolume = 0;
    int maxVolume = 100;
    int stationNumber = minStation;
    int volume = minVolume;
    void Next(){
        if (stationNumber < maxStation) {
            stationNumber = stationNumber + 1;
        }
        else {
            stationNumber = minStation;
        }
    }
    void Prev(){
        if (stationNumber > minStation) {
            stationNumber = stationNumber - 1;
        }
        else {
            stationNumber = maxStation;
        }
    }
    void SetStation(int number){
        if (number >= minStation && number <= maxStation) {
            stationNumber = number;
        }
    }
    void VolumeUp(){
        if (volume < maxVolume) {
            volume = volume + 1;
        }
    }
    void VolumeDown(){
        if (volume > minVolume) {
            volume = volume - 1;
        }
    }
}
