package com.moon.admin.po;

import java.math.BigDecimal;
import java.util.Date;

public class Carload {
    private String id;

    private String appno;

    private String loanpersonname;

    private String idcard;

    private String gender;

    private Integer age;

    private String marriage;

    private String telephone;

    private String post;

    private String companyphone;

    private String sencodcontact;

    private String sencodphone;

    private BigDecimal loanamount;

    private Integer loanlimit;

    private Date loanlimitbegin;

    private Date loanlimitend;

    private String payrate;

    private String carloantype;

    private String carbrandstyle;

    private String cartrademark;

    private String carregcity;

    private String carengineno;

    private String carframeno;

    private Date carbuytime;

    private BigDecimal carprice;

    private BigDecimal evaluateprice;

    private String evaluator;

    private Date evaluatetime;

    private String liableperson1;

    private String liableperson2;

    private String status;

    private String createid;

    private Date createtime;

    private String updateid;

    private Date updatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAppno() {
        return appno;
    }

    public void setAppno(String appno) {
        this.appno = appno == null ? null : appno.trim();
    }

    public String getLoanpersonname() {
        return loanpersonname;
    }

    public void setLoanpersonname(String loanpersonname) {
        this.loanpersonname = loanpersonname == null ? null : loanpersonname.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage == null ? null : marriage.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getCompanyphone() {
        return companyphone;
    }

    public void setCompanyphone(String companyphone) {
        this.companyphone = companyphone == null ? null : companyphone.trim();
    }

    public String getSencodcontact() {
        return sencodcontact;
    }

    public void setSencodcontact(String sencodcontact) {
        this.sencodcontact = sencodcontact == null ? null : sencodcontact.trim();
    }

    public String getSencodphone() {
        return sencodphone;
    }

    public void setSencodphone(String sencodphone) {
        this.sencodphone = sencodphone == null ? null : sencodphone.trim();
    }

    public BigDecimal getLoanamount() {
        return loanamount;
    }

    public void setLoanamount(BigDecimal loanamount) {
        this.loanamount = loanamount;
    }

    public Integer getLoanlimit() {
        return loanlimit;
    }

    public void setLoanlimit(Integer loanlimit) {
        this.loanlimit = loanlimit;
    }

    public Date getLoanlimitbegin() {
        return loanlimitbegin;
    }

    public void setLoanlimitbegin(Date loanlimitbegin) {
        this.loanlimitbegin = loanlimitbegin;
    }

    public Date getLoanlimitend() {
        return loanlimitend;
    }

    public void setLoanlimitend(Date loanlimitend) {
        this.loanlimitend = loanlimitend;
    }

    public String getPayrate() {
        return payrate;
    }

    public void setPayrate(String payrate) {
        this.payrate = payrate == null ? null : payrate.trim();
    }

    public String getCarloantype() {
        return carloantype;
    }

    public void setCarloantype(String carloantype) {
        this.carloantype = carloantype == null ? null : carloantype.trim();
    }

    public String getCarbrandstyle() {
        return carbrandstyle;
    }

    public void setCarbrandstyle(String carbrandstyle) {
        this.carbrandstyle = carbrandstyle == null ? null : carbrandstyle.trim();
    }

    public String getCartrademark() {
        return cartrademark;
    }

    public void setCartrademark(String cartrademark) {
        this.cartrademark = cartrademark == null ? null : cartrademark.trim();
    }

    public String getCarregcity() {
        return carregcity;
    }

    public void setCarregcity(String carregcity) {
        this.carregcity = carregcity == null ? null : carregcity.trim();
    }

    public String getCarengineno() {
        return carengineno;
    }

    public void setCarengineno(String carengineno) {
        this.carengineno = carengineno == null ? null : carengineno.trim();
    }

    public String getCarframeno() {
        return carframeno;
    }

    public void setCarframeno(String carframeno) {
        this.carframeno = carframeno == null ? null : carframeno.trim();
    }

    public Date getCarbuytime() {
        return carbuytime;
    }

    public void setCarbuytime(Date carbuytime) {
        this.carbuytime = carbuytime;
    }

    public BigDecimal getCarprice() {
        return carprice;
    }

    public void setCarprice(BigDecimal carprice) {
        this.carprice = carprice;
    }

    public BigDecimal getEvaluateprice() {
        return evaluateprice;
    }

    public void setEvaluateprice(BigDecimal evaluateprice) {
        this.evaluateprice = evaluateprice;
    }

    public String getEvaluator() {
        return evaluator;
    }

    public void setEvaluator(String evaluator) {
        this.evaluator = evaluator == null ? null : evaluator.trim();
    }

    public Date getEvaluatetime() {
        return evaluatetime;
    }

    public void setEvaluatetime(Date evaluatetime) {
        this.evaluatetime = evaluatetime;
    }

    public String getLiableperson1() {
        return liableperson1;
    }

    public void setLiableperson1(String liableperson1) {
        this.liableperson1 = liableperson1 == null ? null : liableperson1.trim();
    }

    public String getLiableperson2() {
        return liableperson2;
    }

    public void setLiableperson2(String liableperson2) {
        this.liableperson2 = liableperson2 == null ? null : liableperson2.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCreateid() {
        return createid;
    }

    public void setCreateid(String createid) {
        this.createid = createid == null ? null : createid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUpdateid() {
        return updateid;
    }

    public void setUpdateid(String updateid) {
        this.updateid = updateid == null ? null : updateid.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}