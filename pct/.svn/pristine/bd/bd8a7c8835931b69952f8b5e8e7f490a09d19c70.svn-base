package com.acube.common.domain;

import java.util.Locale;

public class CountryLocale {
	private Locale locale ;
	private String country;
	private String language;
	private String displayCountry;
	private String displayLanguage ;
	/**
	 * 
	 */
	public CountryLocale(Locale locale) {
		this.locale = locale;
		this.country = locale.getCountry();
		this.language = locale.getLanguage();
		this.displayCountry = locale.getDisplayCountry(locale);
		this.displayLanguage = locale.getDisplayLanguage(locale);
	}
	public Locale getLocale() {
		return locale;
	}
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDisplayCountry() {
		return displayCountry;
	}
	public void setDisplayCountry(String displayCountry) {
		this.displayCountry = displayCountry;
	}
	public String getDisplayLanguage() {
		return displayLanguage;
	}
	public void setDisplayLanguage(String displayLanguage) {
		this.displayLanguage = displayLanguage;
	}
}
