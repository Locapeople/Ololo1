import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {
    @Test
    void setNextStation() {
        Radio radio = new Radio();

        int expected = 1;

        radio.next();

        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setNextStation2() {
        Radio radio = new Radio();
        radio.setStation(9);

        int expected = 0;

        radio.next();

        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setPrevStation() {
        Radio radio = new Radio();

        int expected = 9;

        radio.prev();

        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setPrevStation2() {
        Radio radio = new Radio();
        radio.setStation(6);

        int expected = 5;

        radio.prev();

        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setStation() {
        Radio radio = new Radio();

        int expected = 2;

        radio.setStation(2);

        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setStation2() {
        Radio radio = new Radio();

        int expected = 0;

        radio.setStation(10);

        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setStation3() {
        Radio radio = new Radio();

        int expected = 0;

        radio.setStation(-10);

        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setVolumeUp() {
        Radio radio = new Radio();

        int expected = 1;

        radio.volumeUp();

        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setVolumeUp2() {
        Radio radio = new Radio();
        for (int i = 0; i < 100; i++) {
            radio.volumeUp();
        }
        int expected = 100;

        radio.volumeUp();

        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setVolumeDown() {
        Radio radio = new Radio();

        int expected = 0;

        radio.volumeDown();

        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setVolumeDown2() {
        Radio radio = new Radio();
        for (int i = 0; i < 50; i++) {
            radio.volumeUp();
        }
        int expected = 49;

        radio.volumeDown();

        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
