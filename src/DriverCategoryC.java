
class DriverCategoryC extends Driver{

    String driverLicenseCategory;

    public String getDriverLicenseCategory() {
        return driverLicenseCategory;
    }

    public DriverCategoryC(String driverName, boolean haveDriverLicense, int driverExperience) {
        super(driverName, haveDriverLicense, driverExperience);


        this.driverLicenseCategory = null;
    }

    public DriverCategoryC(String driverName, boolean haveDriverLicense, int driverExperience, String driverLicenseCategory) {
        super(driverName, haveDriverLicense, driverExperience);


        this.driverLicenseCategory = driverLicenseCategory;
    }

}
