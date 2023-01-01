public class Driver {       //У всякого водителя есть имя, лецензия и водительский опыт

    final String driverName;
    boolean haveDriverLicense;
    int driverExperience;


    public String getDriverName() {
        return driverName;
    }

    public boolean isHaveDriverLicense() {
        return haveDriverLicense;
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverName='" + driverName + '\'' +
                ", haveDriverLicense=" + haveDriverLicense +
                ", driverExperience=" + driverExperience +
                '}';
    }

    public Driver(String driverName, boolean haveDriverLicense, int driverExperience) {     //Конструктор для класса "водитель"
        this.driverName = driverName;
        this.haveDriverLicense = haveDriverLicense;
        this.driverExperience = driverExperience;
    }

    //Методы водителя, начало движения, остановка и заправка.

    public void driverStartMoving() {

        System.out.println("Водитель " + driverName + " начинает движение.");

    }

    public void driverStopMoving() {

        System.out.println("Водитель " + driverName + " прекращает движение.");

    }

    public void driverFuelRefill() {

        System.out.println("Водитель " + driverName + " заправляет автомобиль.");

    }

}