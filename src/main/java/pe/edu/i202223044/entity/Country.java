package pe.edu.i202223044.entity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "country")
public class Country {
    @Id
    private String code;
    private String name;
    private String continent;
    private String region;
    private Double surfaceArea;
    private Integer indepYear;
    private Integer population;
    private Integer lifeExpectancy;
    private Double gnp;
    private Double gnpOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private Integer capital;
    private String code2;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<City> cities;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<CountryLanguage> languages;

    //Constructor
    public Country() {
    }

    public Country(String code, String name, String continent, String region, Double surfaceArea, Integer indepYear, Integer population, Integer lifeExpectancy, Double gnp, Double gnpOld, String localName, String governmentForm, String headOfState, Integer capital, String code2, List<City> cities, List<CountryLanguage> languages) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.surfaceArea = surfaceArea;
        this.indepYear = indepYear;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        this.gnp = gnp;
        this.gnpOld = gnpOld;
        this.localName = localName;
        this.governmentForm = governmentForm;
        this.headOfState = headOfState;
        this.capital = capital;
        this.code2 = code2;
        this.cities = cities;
        this.languages = languages;
    }

    //GETTERS Y SETTERS
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContinent() {
        return continent;
    }
    public void setContinent(String continent) {
        this.continent = continent;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public Double getSurfaceArea() {
        return surfaceArea;
    }
    public void setSurfaceArea(Double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }
    public Integer getIndepYear() {
        return indepYear;
    }
    public void setIndepYear(Integer indepYear) {
        this.indepYear = indepYear;
    }
    public Integer getPopulation() {
        return population;
    }
    public void setPopulation(Integer population) {
        this.population = population;
    }
    public Integer getLifeExpectancy() {
        return lifeExpectancy;
    }
    public void setLifeExpectancy(Integer lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }
    public Double getGnp() {
        return gnp;
    }
    public void setGnp(Double gnp) {
        this.gnp = gnp;
    }
    public Double getGnpOld() {
        return gnpOld;
    }
    public void setGnpOld(Double gnpOld) {
        this.gnpOld = gnpOld;
    }
    public String getLocalName() {
        return localName;
    }
    public void setLocalName(String localName) {
        this.localName = localName;
    }
    public String getGovernmentForm() {
        return governmentForm;
    }
    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }
    public String getHeadOfState() {
        return headOfState;
    }
    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }
    public Integer getCapital() {
        return capital;
    }
    public void setCapital(Integer capital) {
        this.capital = capital;
    }
    public String getCode2() {
        return code2;
    }
    public void setCode2(String code2) {
        this.code2 = code2;
    }
    public List<City> getCities() {
        return cities;
    }
    public void setCities(List<City> cities) {
        this.cities = cities;
    }
    public List<CountryLanguage> getLanguages() {
        return languages;
    }
    public void setLanguages(List<CountryLanguage> languages) {
        this.languages = languages;
    }


    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", surfaceArea=" + surfaceArea +
                ", indepYear=" + indepYear +
                ", population=" + population +
                ", lifeExpectancy=" + lifeExpectancy +
                ", gnp=" + gnp +
                ", gnpOld=" + gnpOld +
                ", localName='" + localName + '\'' +
                ", governmentForm='" + governmentForm + '\'' +
                ", headOfState='" + headOfState + '\'' +
                ", capital=" + capital +
                ", code2='" + code2 + '\'' +
                ", cities=" + cities +
                ", languages=" + languages +
                '}';
    }
}
