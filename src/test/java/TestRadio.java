import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {
    @Test
    void setNextStation() {
        Radio radio = new Radio();

        int expected = 1;

        radio.Next();

        int actual = radio.stationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setNextStation2() {
        Radio radio = new Radio();
        radio.stationNumber = 9;

        int expected = 0;

        radio.Next();

        int actual = radio.stationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setPrevStation() {
        Radio radio = new Radio();

        int expected = 9;

        radio.Prev();

        int actual = radio.stationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setPrevStation2() {
        Radio radio = new Radio();
        radio.stationNumber = 6;

        int expected = 5;

        radio.Prev();

        int actual = radio.stationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setStation() {
        Radio radio = new Radio();

        int expected = 2;

        radio.SetStation(2);

        int actual = radio.stationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setStation2() {
        Radio radio = new Radio();

        int expected = 0;

        radio.SetStation(10);

        int actual = radio.stationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setVolumeUp() {
        Radio radio = new Radio();

        int expected = 1;

        radio.VolumeUp();

        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setVolumeUp2() {
        Radio radio = new Radio();
        radio.volume = 100;

        int expected = 100;

        radio.VolumeUp();

        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setVolumeDown() {
        Radio radio = new Radio();

        int expected = 0;

        radio.VolumeDown();

        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setVolumeDown2() {
        Radio radio = new Radio();
        radio.volume = 50;

        int expected = 49;

        radio.VolumeDown();

        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }
}
