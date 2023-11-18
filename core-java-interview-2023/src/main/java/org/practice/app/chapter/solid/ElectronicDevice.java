package org.practice.app.chapter.solid;

/**
 * In this design, all electronic devices, including smartphones, televisions, and music players, are forced to implement all these methods.
 * However, different types of devices have different capabilities, and some methods may not be applicable to all devices.
 *
 * To adhere to the Interface Segregation Principle, you can split the interface into more specific interfaces that match the functionalities
 * relevant to different types of devices
 *
 * iPod/SmartPhones - turnOff/turnOn , adjustVolume, playMedia
 * Television - turnOff/turnOn , adjustVolume
 * Torch - turnOff/turnOn
 *
 *
 * */
public interface ElectronicDevice {
    void turnOff();
    void turnOn();
    void adjustVolume();
    void playMedia();

}
