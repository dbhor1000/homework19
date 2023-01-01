import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {



        //Водители, участвующие в гонках

        DriverCategoryB driver1 = new DriverCategoryB("Иван", true, 8, "B");
        DriverCategoryB driver2 = new DriverCategoryB("Сергей", true, 5, "С");
        DriverCategoryB driver3 = new DriverCategoryB("Артур", true, 6, "B");
        DriverCategoryB driver4 = new DriverCategoryB("Арсен", true, 3, "B");

        DriverCategoryC driver5 = new DriverCategoryC("Фёдор", true, 3, "D");
        DriverCategoryC driver6 = new DriverCategoryC("Михаэль", true, 5, "C");
        DriverCategoryC driver7 = new DriverCategoryC("Александр", true, 7, "C");
        DriverCategoryC driver8 = new DriverCategoryC("Дмитрий", true, 7, "C");

        DriverCategoryD driver9 = new DriverCategoryD("Пётр", true, 10, "D");
        DriverCategoryD driver10 = new DriverCategoryD("Святослав", true, 12, "D");
        DriverCategoryD driver11 = new DriverCategoryD("Денис", true, 8, "D");
        DriverCategoryD driver12 = new DriverCategoryD("Арсений", true, 13, "C");

        //Транспортные средства, участвующие в гонках

        Car car1 = new Car("Форд", "Фокус", 1.6, driver1);
        Car car2 = new Car("Форд", "Мустанг", 2.6, driver2, Car.CarTypes.Универсал);
        Car car3 = new Car("Ауди", "A8", 1.6, driver3, Car.CarTypes.Внедорожник);
        Car car4 = new Car("Лада", "Калина", 3.4, driver4, Car.CarTypes.Кроссовер);


        Truck truck1 = new Truck("Скания", "Model 1", 4.6, driver5, Truck.TruckTypes.N2);
        Truck truck2 = new Truck("Джип", "Гладиатор", 5.6, driver6, Truck.TruckTypes.N1);
        Truck truck3 = new Truck("Тойота", "Такома", 4.0, driver7);
        Truck truck4 = new Truck("Шевроле", "Колорадо", 4.2, driver8);


        Bus bus1 = new Bus("Вольво", "B11R", 3.6, driver9, Bus.BusTypes.Средняя);
        Bus bus2 = new Bus("MAN", "Bus1", 3.7, driver10);
        Bus bus3 = new Bus("Marcopolo", "Multego", 3.6, driver11);
        Bus bus4 = new Bus("King Long", "XMQ6996Y", 4.0, driver12);




        //Сводка по каждому транспортному средству:

        car1.requestDriverAndCarInformation();
        car1.bestTime();
        car1.maxSpeedOnLap();
        car1.pitStop();

        car1.requestDriverAndCarInformation();
        car2.bestTime();
        car2.maxSpeedOnLap();
        car2.pitStop();

        car1.requestDriverAndCarInformation();
        car3.bestTime();
        car3.maxSpeedOnLap();
        car3.pitStop();

        car1.requestDriverAndCarInformation();
        car4.bestTime();
        car4.maxSpeedOnLap();
        car4.pitStop();

        truck1.requestDriverAndCarInformation();
        truck1.bestTime();
        truck1.maxSpeedOnLap();
        truck1.pitStop();

        truck2.requestDriverAndCarInformation();
        truck2.bestTime();
        truck2.maxSpeedOnLap();
        truck2.pitStop();

        truck3.requestDriverAndCarInformation();
        truck3.bestTime();
        truck3.maxSpeedOnLap();
        truck3.pitStop();

        truck4.requestDriverAndCarInformation();
        truck4.bestTime();
        truck4.maxSpeedOnLap();
        truck4.pitStop();

        bus1.requestDriverAndCarInformation();
        bus1.bestTime();
        bus1.maxSpeedOnLap();
        bus1.pitStop();

        bus2.requestDriverAndCarInformation();
        bus2.bestTime();
        bus2.maxSpeedOnLap();
        bus2.pitStop();

        bus3.requestDriverAndCarInformation();
        bus3.bestTime();
        bus3.maxSpeedOnLap();
        bus3.pitStop();

        bus4.requestDriverAndCarInformation();
        bus4.bestTime();
        bus4.maxSpeedOnLap();
        bus4.pitStop();


        //Вывод всех имеющихся типов различных авто:

        Car.CarTypes.carTypesToString();
        Bus.BusTypes.busTypesToString();
        Truck.TruckTypes.truckTypesToString();

        //Вывод типов транспортных средств по интересующим критериям:

        car1.printType(); //Тип не указан
        bus1.printType();
        truck1.printType();
        car2.printType();


        //ДЗ от 28 декабря. С Новым Годом! Добавлены геттеры в правах всех трёх категория, класс для ошибки при проверке водительских прав машин и грузовиков.
        //В класс transport добавлен абстрактный метод undergoDiagnostic, переопределён в классе для машин и грузовиков. В классе мейн добавлена проверка с помощью
        //добавленного метода и обработка исключений.

        try {
            car1.undergoDiagnostic();       //Указан верный тип прав.
        } catch (DriverLicenseException e) {
            System.out.println(e.getMessage());
            System.out.println("Необходимо указать тип прав.");
        }

        System.out.println();

        try {
            truck1.undergoDiagnostic();     //Тип прав указан ошибочно.
        } catch (DriverLicenseException e) {
            System.out.println(e.getMessage());
            System.out.println("Необходимо указать тип прав.");
        }

        bus1.undergoDiagnostic();       //Автобусам не нужна диагностика, сообщение не выводится.

        System.out.println();

        try {
            car2.undergoDiagnostic();       //Тип прав указан ошибочно.
        } catch (DriverLicenseException e) {
            System.out.println(e.getMessage());
            System.out.println("Необходимо указать тип прав.");
        }

    }
}