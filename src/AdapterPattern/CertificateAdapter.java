package AdapterPattern;

import FactoryPattern.Food;

public class CertificateAdapter implements Food {
    ICertificate certificate;

    public CertificateAdapter(ICertificate certificate) {
        this.certificate = certificate;
    }

    @Override
    public String getName() {
        return certificate.getName();
    }

    @Override
    public double getPrice() {
        return certificate.getPrice();
    }
}
