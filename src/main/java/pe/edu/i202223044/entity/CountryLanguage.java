package pe.edu.i202223044.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "countrylanguage")
public class CountryLanguage {
    @EmbeddedId
    private CountryLanguageId id;
    private String isOfficial;
    private Double percentage;
    @ManyToOne
    @MapsId("countryCode")
    @JoinColumn(name = "CountryCode",insertable = false,updatable = false)
    private Country country;

    //Constructor
    public CountryLanguage() {
    }

    public CountryLanguage(CountryLanguageId id, String isOfficial, Double percentage, Country country) {
        this.id = id;
        this.isOfficial = isOfficial;
        this.percentage = percentage;
        this.country = country;
    }

    //GETTERS Y SETTERS
    public Country getCountry() {
        return country;
    }
    public void setCountry(Country country) {
        this.country = country;
    }
    public Double getPercentage() {
        return percentage;
    }
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
    public String getOfficial() {
        return isOfficial;
    }
    public void setOfficial(String official) {
        isOfficial = official;
    }
    public CountryLanguageId getId() {
        return id;
    }
    public void setId(CountryLanguageId id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CountryLanguage{" +
                "id=" + id +
                ", isOfficial=" + isOfficial +
                ", percentage=" + percentage +
                ", country=" + country +
                '}';
    }
}