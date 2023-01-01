class DriverCategoryD extends Driver{

    String driverLicenseCategory;

    public String getDriverLicenseCategory() {
        return driverLicenseCategory;
    }

    public DriverCategoryD(String driverName, boolean haveDriverLicense, int driverExperience) {
        super(driverName, haveDriverLicense, driverExperience);

        this.driverLicenseCategory = null;
    }

    public DriverCategoryD(String driverName, boolean haveDriverLicense, int driverExperience, String driverLicenseCategory) {
        super(driverName, haveDriverLicense, driverExperience);

        this.driverLicenseCategory = driverLicenseCategory;
    }

}
