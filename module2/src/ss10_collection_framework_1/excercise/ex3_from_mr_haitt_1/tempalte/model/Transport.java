package ss10_collection_framework_1.excercise.ex3_from_mr_haitt_1.tempalte.model;

public class Transport {
    private String licensePlates;
    private String production;
    private String productiveYears;
    private String proprietor;

    public Transport() {
    }

    public Transport(String licensePlates, String production, String productiveYears, String proprietor) {
        this.licensePlates = licensePlates;
        this.production = production;
        this.productiveYears = productiveYears;
        this.proprietor = proprietor;
    }

    public Transport(String licensePlates) {
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getProductiveYears() {
        return productiveYears;
    }

    public void setProductiveYears(String productiveYears) {
        this.productiveYears = productiveYears;
    }

    public String getProprietor() {
        return proprietor;
    }

    public void setProprietor(String proprietor) {
        this.proprietor = proprietor;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "licensePlates='" + licensePlates + '\'' +
                ", production='" + production + '\'' +
                ", productiveYears='" + productiveYears + '\'' +
                ", proprietor='" + proprietor + '\'' +
                '}';
    }
}
