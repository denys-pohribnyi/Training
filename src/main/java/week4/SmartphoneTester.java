package week4;

public class SmartphoneTester {
    public static void main(String[] args) {
        IosSmartphone iphone = new IosSmartphone();
        iphone.call();
        String iOSTechnicalInfo = "This device's operation system is " + iphone.getOsIOS() +
                " and it's charging interface is " + iphone.getChargerIOS() +
                " and applications for this device can be uploaded from " + iphone.getApplicationStoreIOS();
        System.out.println(iOSTechnicalInfo);

        AndroidSmartphone samsung = new AndroidSmartphone();
        samsung.call();
        String androidTechnicalInfo = "This device's operation system is " + samsung.getOsAOS() +
                " and it's charging interface is " + samsung.getChagrerAOS() +
                " and applications for this device can be uploaded from " + samsung.getApplicationStoreAOS();
        System.out.println(androidTechnicalInfo);
    }
}
//Calling from device
//This device's operation system is iOS 14.6 and it's charging interface is Lightning and applications for this device can be uploaded from AppStore
//Calling from device
//This device's operation system is Android 10 and it's charging interface is TypeC and applications for this device can be uploaded from Google Play Market
/*
3. Создать абстрактный класс телефон (у него метод
набор номера с реализацией (просто выводит в консоль что выполняется набор
телефона), а методы
- Операционная Система (setChargerType()), - абстрактный
- Интерфейс Зарядки (setOperationSystem())и абстрактный
- Магазин Приложений (setApplicationStore()) ---- абстрактный)
у класса Phone будет 2 наследника - iOSSmartphone and
AndroidSmartphone - они реализуют абстрактные методы суперкласса (можно
явно передать значения) реализованные методы сетят поля класса
В классе SmartphoneTester создать ссылки на объекты телефонов и вывести в консоль
техническую информацию об устройстве с помощью геттеров.
Для примера у IOSSmartphone есть приватное поле String os, в методе
setOperationSystem() сетится его значение, потом этот метод вызываем а
конструкторе после этого в классе SmartphoneTester создаем ссылку и
вызываем getOperationSystem() После этого выводим в консоль
*/