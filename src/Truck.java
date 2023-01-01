public class Truck extends Transport implements Transport.Competitor, Transport.DriverAndCarInformation {

    enum TruckTypes {         //Перечисления с типами для класса Car
        N1("С полной массой до 3,5 тонн"),
        N2("с полной массой свыше 3,5 до 12 тонн"),
        N3("с полной массой свыше 12 тонн");


        private String truckType;

        TruckTypes(String truckType) {

            this.truckType = truckType;
        }

        public static void truckTypesToString() {

            Truck.TruckTypes[] trucks = Truck.TruckTypes.values();
            for (int i = 0; i < trucks.length; i++) {

                System.out.println(trucks[i]);
            }

            System.out.println();

        }
    }


    DriverCategoryC driver;
    TruckTypes type;

    public <T extends DriverCategoryC> Truck(String model, String subModel, double engineSize, T driver, TruckTypes type) {

        super(model, subModel, engineSize);
        this.driver = driver;
        this.type = type;


    }

    public <T extends DriverCategoryC> Truck(String model, String subModel, double engineSize, T driver) {

        super(model, subModel, engineSize);
        this.driver = driver;
        this.type = null;


    }

    public DriverCategoryC getDriver() {
        return driver;
    }


    @Override
    public void pitStop() {

        System.out.println(model + " " + subModel + " ушёл на питстоп.");
        System.out.println();

    }

    @Override
    public void bestTime() {

        System.out.println("Лучшее время круга " + model + " " + subModel + " :" + ((Math.random() * ((130 - 75) + 1)) + 75));

    }

    @Override
    public void maxSpeedOnLap() {

        System.out.println("Наибольшая скорость " + model + " " + subModel + " на круге: " + ((Math.random() * ((180 - 120) + 1)) + 120));

    }

    @Override
    public void requestDriverAndCarInformation() {

        System.out.println("Водитель " + driver.getDriverName() + " управляет автомобилем " + model + " " + subModel + " и будет участвовать в заезде. ");

    }

    @Override
    public void undergoDiagnostic() throws DriverLicenseException {

        if (driver.getDriverLicenseCategory() == "C") {
            System.out.println("Грузовик " + model + " " + subModel + " проходит диагностику.");
        } else {
            throw new DriverLicenseException("У водителя " + model + " " + subModel + " неподходящая категория прав " + driver.getDriverLicenseCategory() + " .");
        }
    }


    @Override
    public void printType() {

        System.out.println(model + " " + subModel + " :");

        if (type == null) {
            System.out.println("Данных по ТС не достаточно.");
        } else {

            switch (type) {
                case N1:
                    System.out.println("Грузоподъемность: до 3,5 тонн.");
                    break;
                case N2:
                    System.out.println("Грузоподъемность: от 3,5 до 12 тонн");
                    break;

                case N3:
                    System.out.println("Грузоподъемность: свыше 12 тонн.");
                    break;
            }


        }

        System.out.println();

    }

}
