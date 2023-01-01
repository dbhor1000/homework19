class DriverCategoryB extends Driver{       //Подкласс водителей с правами категории Б

    String driverLicenseCategory;

    public String getDriverLicenseCategory() {
        return driverLicenseCategory;
    }

    public DriverCategoryB(String driverName, boolean haveDriverLicense, int driverExperience) {
        super(driverName, haveDriverLicense, driverExperience);


        this.driverLicenseCategory = null;

    }

    public DriverCategoryB(String driverName, boolean haveDriverLicense, int driverExperience, String driverLicenseCategory) {
        super(driverName, haveDriverLicense, driverExperience);


        this.driverLicenseCategory = driverLicenseCategory;

    }

}