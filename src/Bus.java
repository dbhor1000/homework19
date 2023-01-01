public class Bus extends Transport implements Transport.Competitor, Transport.DriverAndCarInformation {


    enum BusTypes {
        Особо_малая("До 10 мест"),
        Малая("До 25 мест"),
        Средняя("40-50 мест"),
        Большая("60-80 мест"),
        Особо_большая("100-120 мест");


        private String busType;

        BusTypes(String busType) {
            this.busType = busType;
        }

        public static void busTypesToString(){

            Bus.BusTypes[] bus = Bus.BusTypes.values();
            for(int i = 0; i < bus.length; i++){

                System.out.println(bus[i]);
            }
            System.out.println();
        }
    }


    DriverCategoryD driver;
    BusTypes type;



    public <T extends DriverCategoryD> Bus(String model, String subModel, double engineSize, T driver, BusTypes type) {

        super(model, subModel, engineSize);
        this.driver = driver;
        this.type = type;

    }

    public <T extends DriverCategoryD> Bus(String model, String subModel, double engineSize, T driver) {

        super(model, subModel, engineSize);
        this.driver = driver;
        this.type = null;

    }

    public DriverCategoryD getDriver() {
        return driver;
    }

    public BusTypes getType() {
        return type;
    }

    public void setType(BusTypes type) {
        this.type = type;
    }

    @Override
    public void pitStop() {

        System.out.println(model + " " + subModel + " ушёл на питстоп.");
        System.out.println();

    }

    @Override
    public void bestTime() {

        System.out.println("Лучшее время круга " + model + " " + subModel + " :" + ((Math.random()*((180-140)+1))+140));

    }

    @Override
    public void maxSpeedOnLap() {

        System.out.println("Наибольшая скорость " + model + " " + subModel + " на круге: " + ((Math.random()*((160-100)+1))+100));

    }

    @Override
    public void requestDriverAndCarInformation() {

        System.out.println("Водитель " + driver.getDriverName() + " управляет автомобилем " + model + " " + subModel + " и будет участвовать в заезде. " );

    }

    @Override
    public void undergoDiagnostic() {}

    @Override
    public void printType() {

        System.out.println(model + " " + subModel + " :");

        if(type == null){
            System.out.println("Данных по ТС не достаточно.");
        } else {

            switch (type) {
                case  Особо_малая:
                    System.out.println("Вместимость: до 10 мест.");
                    break;
                case Малая:
                    System.out.println("Вместимость: до 25 мест");
                    break;

                case Средняя:
                    System.out.println("Вместимость: от 40 до 50 мест.");
                    break;

                case Большая:
                    System.out.println("Вместимость: от 60 до 80 мест.");
                    break;

                case Особо_большая:
                    System.out.println("Вместимость: от 100 до 120 мест.");
                    break;
            }
        }

        System.out.println();
    }

}

