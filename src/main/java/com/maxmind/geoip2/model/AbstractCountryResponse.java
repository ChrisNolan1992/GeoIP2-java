package com.maxmind.geoip2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.maxmind.geoip2.record.Continent;
import com.maxmind.geoip2.record.Country;
import com.maxmind.geoip2.record.MaxMind;
import com.maxmind.geoip2.record.RepresentedCountry;
import com.maxmind.geoip2.record.Traits;

abstract class AbstractCountryResponse extends AbstractResponse {
    @JsonProperty
    private Continent continent = new Continent();

    @JsonProperty
    private Country country = new Country();

    @JsonProperty("registered_country")
    private Country registeredCountry = new Country();

    @JsonProperty("maxmind")
    private MaxMind maxmind = new MaxMind();

    @JsonProperty("represented_country")
    private RepresentedCountry representedCountry = new RepresentedCountry();

    @JsonProperty
    private Traits traits = new Traits();

    /**
     * @return Continent record for the requested IP address.
     */
    public Continent getContinent() {
        return this.continent;
    }

    /**
     * @return Country record for the requested IP address. This object
     *         represents the country where MaxMind believes the end user is
     *         located.
     */
    public Country getCountry() {
        return this.country;
    }

    /**
     * @return MaxMind record containing data related to your account.
     */
    @JsonProperty("maxmind")
    public MaxMind getMaxMind() {
        return this.maxmind;
    }

    /**
     * @return Registered country record for the requested IP address. This
     *         record represents the country where the ISP has registered a
     *         given IP block and may differ from the user's country.
     */
    public Country getRegisteredCountry() {
        return this.registeredCountry;
    }

    /**
     * @return Represented country record for the requested IP address. The
     *         represented country is used for things like military bases.
     *         It is only present when the represented country differs from
     *         the country.
     */
    public RepresentedCountry getRepresentedCountry() {
        return this.representedCountry;
    }

    /**
     * @return Record for the traits of the requested IP address.
     */
    public Traits getTraits() {
        return this.traits;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Country ["
                + (this.getContinent() != null ? "getContinent()="
                        + this.getContinent() + ", " : "")
                + (this.getCountry() != null ? "getCountry()="
                        + this.getCountry() + ", " : "")
                + (this.getRegisteredCountry() != null ? "getRegisteredCountry()="
                        + this.getRegisteredCountry() + ", "
                        : "")
                + (this.getRepresentedCountry() != null ? "getRepresentedCountry()="
                        + this.getRepresentedCountry() + ", "
                        : "")
                + (this.getTraits() != null ? "getTraits()=" + this.getTraits()
                        : "") + "]";
    }
}
