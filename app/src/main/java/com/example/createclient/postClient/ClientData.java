package com.example.createclient.postClient;

import com.google.gson.annotations.SerializedName;

public class ClientData {
    @SerializedName("is_company")
    String isCompany;

    @SerializedName("name")
    String name;

    @SerializedName("client_discount")
    String clientDiscount;

    @SerializedName("number_fiscal")
    String numberFiscal;

    @SerializedName("number_busniess")
    String numberBusiness;

    @SerializedName("number_vat")
    String numberVat;

    @SerializedName("address")
    String address;

    @SerializedName("village")
    String village;

    @SerializedName("city")
    String city;

    @SerializedName("zip")
    String zip;

    @SerializedName("state")
    String state;

    @SerializedName("phone")
    String phone;

    @SerializedName("fax")
    String fax;

    @SerializedName("email")
    String email;

    @SerializedName("web")
    String web;

    @SerializedName("account_client")
    String accountClient;

    @SerializedName("currency")
    String currency;

    @SerializedName("data_since")
    String dataSince;

    @SerializedName("note")
    String note;

    @SerializedName("payment_deadline")
    String paymentDeadline;

    @SerializedName("limit_balance")
    String limitBalance;

    @SerializedName("category")
    String category;

    @SerializedName("price_category")
    String priceCategory;

    @SerializedName("stations")
    Station[] stations;

    public ClientData(String isCompany, String name, String clientDiscount, String numberFiscal, String numberBusiness, String numberVat, String address, String village, String city, String zip, String state, String phone, String fax, String email, String web, String accountClient, String currency, String dataSince, String note, String paymentDeadline, String limitBalance, String category, String priceCategory, Station[] stations) {
        this.isCompany = isCompany;
        this.name = name;
        this.clientDiscount = clientDiscount;
        this.numberFiscal = numberFiscal;
        this.numberBusiness = numberBusiness;
        this.numberVat = numberVat;
        this.address = address;
        this.village = village;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.web = web;
        this.accountClient = accountClient;
        this.currency = currency;
        this.dataSince = dataSince;
        this.note = note;
        this.paymentDeadline = paymentDeadline;
        this.limitBalance = limitBalance;
        this.category = category;
        this.priceCategory = priceCategory;
        this.stations = stations;
    }

    public ClientData() {

    }

    public String getIsCompany() {
        return isCompany;
    }

    public String getName() {
        return name;
    }

    public String getClientDiscount() {
        return clientDiscount;
    }

    public String getNumberFiscal() {
        return numberFiscal;
    }

    public String getNumberBusiness() {
        return numberBusiness;
    }

    public String getNumberVat() {
        return numberVat;
    }

    public String getAddress() {
        return address;
    }

    public String getVillage() {
        return village;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public String getState() {
        return state;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public void setIsCompany(String isCompany) {
        this.isCompany = isCompany;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClientDiscount(String clientDiscount) {
        this.clientDiscount = clientDiscount;
    }

    public void setNumberFiscal(String numberFiscal) {
        this.numberFiscal = numberFiscal;
    }

    public void setNumberBusiness(String numberBusiness) {
        this.numberBusiness = numberBusiness;
    }

    public void setNumberVat(String numberVat) {
        this.numberVat = numberVat;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getAccountClient() {
        return accountClient;
    }

    public void setAccountClient(String accountClient) {
        this.accountClient = accountClient;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDataSince() {
        return dataSince;
    }

    public void setDataSince(String dataSince) {
        this.dataSince = dataSince;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPaymentDeadline() {
        return paymentDeadline;
    }

    public void setPaymentDeadline(String paymentDeadline) {
        this.paymentDeadline = paymentDeadline;
    }

    public String getLimitBalance() {
        return limitBalance;
    }

    public void setLimitBalance(String limitBalance) {
        this.limitBalance = limitBalance;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }

    public Station[] getStations() {
        return stations;
    }

    public void setStations(Station[] stations) {
        this.stations = stations;
    }
}
