package com.moon.admin.po;

public class HoseLoadWithBLOBs extends HoseLoad {
    private String censusadrress;

    private String adrress;

    private String company;

    private String loanusage;

    private String houseadress;

    public String getCensusadrress() {
        return censusadrress;
    }

    public void setCensusadrress(String censusadrress) {
        this.censusadrress = censusadrress == null ? null : censusadrress.trim();
    }

    public String getAdrress() {
        return adrress;
    }

    public void setAdrress(String adrress) {
        this.adrress = adrress == null ? null : adrress.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getLoanusage() {
        return loanusage;
    }

    public void setLoanusage(String loanusage) {
        this.loanusage = loanusage == null ? null : loanusage.trim();
    }

    public String getHouseadress() {
        return houseadress;
    }

    public void setHouseadress(String houseadress) {
        this.houseadress = houseadress == null ? null : houseadress.trim();
    }
}