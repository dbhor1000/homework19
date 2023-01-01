public abstract class Transport {        //У всякого транспорта имеется марка, модель и двигатель некоторого объёма

    final String model;
    final String subModel;
    double engineSize;

    public Transport(String model, String subModel, double engineSize) {    //Конструктор для класса транспорт
        this.model = model;
        this.subModel = subModel;
        this.engineSize = engineSize;
    }

    //Геттеры и сеттеры для транспорта

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public String getModel() {
        return model;
    }

    public String getSubModel() {
        return subModel;
    }


    //Методы для остановки и начала движения(класс транспорт)
    public void startMoving() {

        System.out.println(model + " " + subModel + " начал движение.");

    }

    public void stopMoving() {

        System.out.println(model + " " + subModel + " закончил движение.");

    }



    interface Competitor {      //Интерфейс с методами для участия в гонках, методы переопределены в подклассах транспорта

        void pitStop();

        void bestTime();

        void maxSpeedOnLap();

    }

    interface DriverAndCarInformation {

        void requestDriverAndCarInformation();

    }

    public abstract void printType(); //Абстрактный метод для вывода типа ТС, HW18

    public abstract void undergoDiagnostic() throws DriverLicenseException; //Абстрактный метод для диагностики (легковые и грузовые автомобили)

}
