package week4;

public abstract class Phone {

    void call() {
        System.out.println("Calling from device");
    }

    abstract void setChargerType();

    abstract void setOperationSystem();

    abstract void setApplicationStore();


}
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
