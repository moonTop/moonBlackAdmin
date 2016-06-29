package com.moon.admin.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CarloadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarloadExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAppnoIsNull() {
            addCriterion("APPNO is null");
            return (Criteria) this;
        }

        public Criteria andAppnoIsNotNull() {
            addCriterion("APPNO is not null");
            return (Criteria) this;
        }

        public Criteria andAppnoEqualTo(String value) {
            addCriterion("APPNO =", value, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoNotEqualTo(String value) {
            addCriterion("APPNO <>", value, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoGreaterThan(String value) {
            addCriterion("APPNO >", value, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoGreaterThanOrEqualTo(String value) {
            addCriterion("APPNO >=", value, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoLessThan(String value) {
            addCriterion("APPNO <", value, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoLessThanOrEqualTo(String value) {
            addCriterion("APPNO <=", value, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoLike(String value) {
            addCriterion("APPNO like", value, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoNotLike(String value) {
            addCriterion("APPNO not like", value, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoIn(List<String> values) {
            addCriterion("APPNO in", values, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoNotIn(List<String> values) {
            addCriterion("APPNO not in", values, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoBetween(String value1, String value2) {
            addCriterion("APPNO between", value1, value2, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoNotBetween(String value1, String value2) {
            addCriterion("APPNO not between", value1, value2, "appno");
            return (Criteria) this;
        }

        public Criteria andLoanpersonnameIsNull() {
            addCriterion("LOANPERSONNAME is null");
            return (Criteria) this;
        }

        public Criteria andLoanpersonnameIsNotNull() {
            addCriterion("LOANPERSONNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoanpersonnameEqualTo(String value) {
            addCriterion("LOANPERSONNAME =", value, "loanpersonname");
            return (Criteria) this;
        }

        public Criteria andLoanpersonnameNotEqualTo(String value) {
            addCriterion("LOANPERSONNAME <>", value, "loanpersonname");
            return (Criteria) this;
        }

        public Criteria andLoanpersonnameGreaterThan(String value) {
            addCriterion("LOANPERSONNAME >", value, "loanpersonname");
            return (Criteria) this;
        }

        public Criteria andLoanpersonnameGreaterThanOrEqualTo(String value) {
            addCriterion("LOANPERSONNAME >=", value, "loanpersonname");
            return (Criteria) this;
        }

        public Criteria andLoanpersonnameLessThan(String value) {
            addCriterion("LOANPERSONNAME <", value, "loanpersonname");
            return (Criteria) this;
        }

        public Criteria andLoanpersonnameLessThanOrEqualTo(String value) {
            addCriterion("LOANPERSONNAME <=", value, "loanpersonname");
            return (Criteria) this;
        }

        public Criteria andLoanpersonnameLike(String value) {
            addCriterion("LOANPERSONNAME like", value, "loanpersonname");
            return (Criteria) this;
        }

        public Criteria andLoanpersonnameNotLike(String value) {
            addCriterion("LOANPERSONNAME not like", value, "loanpersonname");
            return (Criteria) this;
        }

        public Criteria andLoanpersonnameIn(List<String> values) {
            addCriterion("LOANPERSONNAME in", values, "loanpersonname");
            return (Criteria) this;
        }

        public Criteria andLoanpersonnameNotIn(List<String> values) {
            addCriterion("LOANPERSONNAME not in", values, "loanpersonname");
            return (Criteria) this;
        }

        public Criteria andLoanpersonnameBetween(String value1, String value2) {
            addCriterion("LOANPERSONNAME between", value1, value2, "loanpersonname");
            return (Criteria) this;
        }

        public Criteria andLoanpersonnameNotBetween(String value1, String value2) {
            addCriterion("LOANPERSONNAME not between", value1, value2, "loanpersonname");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCARD =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCARD <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCARD >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCARD <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCARD <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCARD like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCARD not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCARD in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCARD not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCARD between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCARD not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("AGE not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNull() {
            addCriterion("MARRIAGE is null");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNotNull() {
            addCriterion("MARRIAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageEqualTo(String value) {
            addCriterion("MARRIAGE =", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotEqualTo(String value) {
            addCriterion("MARRIAGE <>", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThan(String value) {
            addCriterion("MARRIAGE >", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThanOrEqualTo(String value) {
            addCriterion("MARRIAGE >=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThan(String value) {
            addCriterion("MARRIAGE <", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThanOrEqualTo(String value) {
            addCriterion("MARRIAGE <=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLike(String value) {
            addCriterion("MARRIAGE like", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotLike(String value) {
            addCriterion("MARRIAGE not like", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageIn(List<String> values) {
            addCriterion("MARRIAGE in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotIn(List<String> values) {
            addCriterion("MARRIAGE not in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageBetween(String value1, String value2) {
            addCriterion("MARRIAGE between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotBetween(String value1, String value2) {
            addCriterion("MARRIAGE not between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("TELEPHONE =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("TELEPHONE <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("TELEPHONE >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("TELEPHONE >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("TELEPHONE <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("TELEPHONE <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("TELEPHONE like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("TELEPHONE not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("TELEPHONE in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("TELEPHONE not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("TELEPHONE between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("TELEPHONE not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("POST is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("POST is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("POST =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("POST <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("POST >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("POST >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("POST <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("POST <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("POST like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("POST not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("POST in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("POST not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("POST between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("POST not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneIsNull() {
            addCriterion("COMPANYPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneIsNotNull() {
            addCriterion("COMPANYPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneEqualTo(String value) {
            addCriterion("COMPANYPHONE =", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneNotEqualTo(String value) {
            addCriterion("COMPANYPHONE <>", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneGreaterThan(String value) {
            addCriterion("COMPANYPHONE >", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYPHONE >=", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneLessThan(String value) {
            addCriterion("COMPANYPHONE <", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneLessThanOrEqualTo(String value) {
            addCriterion("COMPANYPHONE <=", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneLike(String value) {
            addCriterion("COMPANYPHONE like", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneNotLike(String value) {
            addCriterion("COMPANYPHONE not like", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneIn(List<String> values) {
            addCriterion("COMPANYPHONE in", values, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneNotIn(List<String> values) {
            addCriterion("COMPANYPHONE not in", values, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneBetween(String value1, String value2) {
            addCriterion("COMPANYPHONE between", value1, value2, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneNotBetween(String value1, String value2) {
            addCriterion("COMPANYPHONE not between", value1, value2, "companyphone");
            return (Criteria) this;
        }

        public Criteria andSencodcontactIsNull() {
            addCriterion("SENCODCONTACT is null");
            return (Criteria) this;
        }

        public Criteria andSencodcontactIsNotNull() {
            addCriterion("SENCODCONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andSencodcontactEqualTo(String value) {
            addCriterion("SENCODCONTACT =", value, "sencodcontact");
            return (Criteria) this;
        }

        public Criteria andSencodcontactNotEqualTo(String value) {
            addCriterion("SENCODCONTACT <>", value, "sencodcontact");
            return (Criteria) this;
        }

        public Criteria andSencodcontactGreaterThan(String value) {
            addCriterion("SENCODCONTACT >", value, "sencodcontact");
            return (Criteria) this;
        }

        public Criteria andSencodcontactGreaterThanOrEqualTo(String value) {
            addCriterion("SENCODCONTACT >=", value, "sencodcontact");
            return (Criteria) this;
        }

        public Criteria andSencodcontactLessThan(String value) {
            addCriterion("SENCODCONTACT <", value, "sencodcontact");
            return (Criteria) this;
        }

        public Criteria andSencodcontactLessThanOrEqualTo(String value) {
            addCriterion("SENCODCONTACT <=", value, "sencodcontact");
            return (Criteria) this;
        }

        public Criteria andSencodcontactLike(String value) {
            addCriterion("SENCODCONTACT like", value, "sencodcontact");
            return (Criteria) this;
        }

        public Criteria andSencodcontactNotLike(String value) {
            addCriterion("SENCODCONTACT not like", value, "sencodcontact");
            return (Criteria) this;
        }

        public Criteria andSencodcontactIn(List<String> values) {
            addCriterion("SENCODCONTACT in", values, "sencodcontact");
            return (Criteria) this;
        }

        public Criteria andSencodcontactNotIn(List<String> values) {
            addCriterion("SENCODCONTACT not in", values, "sencodcontact");
            return (Criteria) this;
        }

        public Criteria andSencodcontactBetween(String value1, String value2) {
            addCriterion("SENCODCONTACT between", value1, value2, "sencodcontact");
            return (Criteria) this;
        }

        public Criteria andSencodcontactNotBetween(String value1, String value2) {
            addCriterion("SENCODCONTACT not between", value1, value2, "sencodcontact");
            return (Criteria) this;
        }

        public Criteria andSencodphoneIsNull() {
            addCriterion("SENCODPHONE is null");
            return (Criteria) this;
        }

        public Criteria andSencodphoneIsNotNull() {
            addCriterion("SENCODPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andSencodphoneEqualTo(String value) {
            addCriterion("SENCODPHONE =", value, "sencodphone");
            return (Criteria) this;
        }

        public Criteria andSencodphoneNotEqualTo(String value) {
            addCriterion("SENCODPHONE <>", value, "sencodphone");
            return (Criteria) this;
        }

        public Criteria andSencodphoneGreaterThan(String value) {
            addCriterion("SENCODPHONE >", value, "sencodphone");
            return (Criteria) this;
        }

        public Criteria andSencodphoneGreaterThanOrEqualTo(String value) {
            addCriterion("SENCODPHONE >=", value, "sencodphone");
            return (Criteria) this;
        }

        public Criteria andSencodphoneLessThan(String value) {
            addCriterion("SENCODPHONE <", value, "sencodphone");
            return (Criteria) this;
        }

        public Criteria andSencodphoneLessThanOrEqualTo(String value) {
            addCriterion("SENCODPHONE <=", value, "sencodphone");
            return (Criteria) this;
        }

        public Criteria andSencodphoneLike(String value) {
            addCriterion("SENCODPHONE like", value, "sencodphone");
            return (Criteria) this;
        }

        public Criteria andSencodphoneNotLike(String value) {
            addCriterion("SENCODPHONE not like", value, "sencodphone");
            return (Criteria) this;
        }

        public Criteria andSencodphoneIn(List<String> values) {
            addCriterion("SENCODPHONE in", values, "sencodphone");
            return (Criteria) this;
        }

        public Criteria andSencodphoneNotIn(List<String> values) {
            addCriterion("SENCODPHONE not in", values, "sencodphone");
            return (Criteria) this;
        }

        public Criteria andSencodphoneBetween(String value1, String value2) {
            addCriterion("SENCODPHONE between", value1, value2, "sencodphone");
            return (Criteria) this;
        }

        public Criteria andSencodphoneNotBetween(String value1, String value2) {
            addCriterion("SENCODPHONE not between", value1, value2, "sencodphone");
            return (Criteria) this;
        }

        public Criteria andLoanamountIsNull() {
            addCriterion("LOANAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLoanamountIsNotNull() {
            addCriterion("LOANAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLoanamountEqualTo(BigDecimal value) {
            addCriterion("LOANAMOUNT =", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotEqualTo(BigDecimal value) {
            addCriterion("LOANAMOUNT <>", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountGreaterThan(BigDecimal value) {
            addCriterion("LOANAMOUNT >", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOANAMOUNT >=", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLessThan(BigDecimal value) {
            addCriterion("LOANAMOUNT <", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOANAMOUNT <=", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountIn(List<BigDecimal> values) {
            addCriterion("LOANAMOUNT in", values, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotIn(List<BigDecimal> values) {
            addCriterion("LOANAMOUNT not in", values, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOANAMOUNT between", value1, value2, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOANAMOUNT not between", value1, value2, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanlimitIsNull() {
            addCriterion("LOANLIMIT is null");
            return (Criteria) this;
        }

        public Criteria andLoanlimitIsNotNull() {
            addCriterion("LOANLIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andLoanlimitEqualTo(Integer value) {
            addCriterion("LOANLIMIT =", value, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitNotEqualTo(Integer value) {
            addCriterion("LOANLIMIT <>", value, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitGreaterThan(Integer value) {
            addCriterion("LOANLIMIT >", value, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOANLIMIT >=", value, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitLessThan(Integer value) {
            addCriterion("LOANLIMIT <", value, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitLessThanOrEqualTo(Integer value) {
            addCriterion("LOANLIMIT <=", value, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitIn(List<Integer> values) {
            addCriterion("LOANLIMIT in", values, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitNotIn(List<Integer> values) {
            addCriterion("LOANLIMIT not in", values, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitBetween(Integer value1, Integer value2) {
            addCriterion("LOANLIMIT between", value1, value2, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("LOANLIMIT not between", value1, value2, "loanlimit");
            return (Criteria) this;
        }

        public Criteria andLoanlimitbeginIsNull() {
            addCriterion("LOANLIMITBEGIN is null");
            return (Criteria) this;
        }

        public Criteria andLoanlimitbeginIsNotNull() {
            addCriterion("LOANLIMITBEGIN is not null");
            return (Criteria) this;
        }

        public Criteria andLoanlimitbeginEqualTo(Date value) {
            addCriterionForJDBCDate("LOANLIMITBEGIN =", value, "loanlimitbegin");
            return (Criteria) this;
        }

        public Criteria andLoanlimitbeginNotEqualTo(Date value) {
            addCriterionForJDBCDate("LOANLIMITBEGIN <>", value, "loanlimitbegin");
            return (Criteria) this;
        }

        public Criteria andLoanlimitbeginGreaterThan(Date value) {
            addCriterionForJDBCDate("LOANLIMITBEGIN >", value, "loanlimitbegin");
            return (Criteria) this;
        }

        public Criteria andLoanlimitbeginGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LOANLIMITBEGIN >=", value, "loanlimitbegin");
            return (Criteria) this;
        }

        public Criteria andLoanlimitbeginLessThan(Date value) {
            addCriterionForJDBCDate("LOANLIMITBEGIN <", value, "loanlimitbegin");
            return (Criteria) this;
        }

        public Criteria andLoanlimitbeginLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LOANLIMITBEGIN <=", value, "loanlimitbegin");
            return (Criteria) this;
        }

        public Criteria andLoanlimitbeginIn(List<Date> values) {
            addCriterionForJDBCDate("LOANLIMITBEGIN in", values, "loanlimitbegin");
            return (Criteria) this;
        }

        public Criteria andLoanlimitbeginNotIn(List<Date> values) {
            addCriterionForJDBCDate("LOANLIMITBEGIN not in", values, "loanlimitbegin");
            return (Criteria) this;
        }

        public Criteria andLoanlimitbeginBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LOANLIMITBEGIN between", value1, value2, "loanlimitbegin");
            return (Criteria) this;
        }

        public Criteria andLoanlimitbeginNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LOANLIMITBEGIN not between", value1, value2, "loanlimitbegin");
            return (Criteria) this;
        }

        public Criteria andLoanlimitendIsNull() {
            addCriterion("LOANLIMITEND is null");
            return (Criteria) this;
        }

        public Criteria andLoanlimitendIsNotNull() {
            addCriterion("LOANLIMITEND is not null");
            return (Criteria) this;
        }

        public Criteria andLoanlimitendEqualTo(Date value) {
            addCriterionForJDBCDate("LOANLIMITEND =", value, "loanlimitend");
            return (Criteria) this;
        }

        public Criteria andLoanlimitendNotEqualTo(Date value) {
            addCriterionForJDBCDate("LOANLIMITEND <>", value, "loanlimitend");
            return (Criteria) this;
        }

        public Criteria andLoanlimitendGreaterThan(Date value) {
            addCriterionForJDBCDate("LOANLIMITEND >", value, "loanlimitend");
            return (Criteria) this;
        }

        public Criteria andLoanlimitendGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LOANLIMITEND >=", value, "loanlimitend");
            return (Criteria) this;
        }

        public Criteria andLoanlimitendLessThan(Date value) {
            addCriterionForJDBCDate("LOANLIMITEND <", value, "loanlimitend");
            return (Criteria) this;
        }

        public Criteria andLoanlimitendLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LOANLIMITEND <=", value, "loanlimitend");
            return (Criteria) this;
        }

        public Criteria andLoanlimitendIn(List<Date> values) {
            addCriterionForJDBCDate("LOANLIMITEND in", values, "loanlimitend");
            return (Criteria) this;
        }

        public Criteria andLoanlimitendNotIn(List<Date> values) {
            addCriterionForJDBCDate("LOANLIMITEND not in", values, "loanlimitend");
            return (Criteria) this;
        }

        public Criteria andLoanlimitendBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LOANLIMITEND between", value1, value2, "loanlimitend");
            return (Criteria) this;
        }

        public Criteria andLoanlimitendNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LOANLIMITEND not between", value1, value2, "loanlimitend");
            return (Criteria) this;
        }

        public Criteria andPayrateIsNull() {
            addCriterion("PAYRATE is null");
            return (Criteria) this;
        }

        public Criteria andPayrateIsNotNull() {
            addCriterion("PAYRATE is not null");
            return (Criteria) this;
        }

        public Criteria andPayrateEqualTo(String value) {
            addCriterion("PAYRATE =", value, "payrate");
            return (Criteria) this;
        }

        public Criteria andPayrateNotEqualTo(String value) {
            addCriterion("PAYRATE <>", value, "payrate");
            return (Criteria) this;
        }

        public Criteria andPayrateGreaterThan(String value) {
            addCriterion("PAYRATE >", value, "payrate");
            return (Criteria) this;
        }

        public Criteria andPayrateGreaterThanOrEqualTo(String value) {
            addCriterion("PAYRATE >=", value, "payrate");
            return (Criteria) this;
        }

        public Criteria andPayrateLessThan(String value) {
            addCriterion("PAYRATE <", value, "payrate");
            return (Criteria) this;
        }

        public Criteria andPayrateLessThanOrEqualTo(String value) {
            addCriterion("PAYRATE <=", value, "payrate");
            return (Criteria) this;
        }

        public Criteria andPayrateLike(String value) {
            addCriterion("PAYRATE like", value, "payrate");
            return (Criteria) this;
        }

        public Criteria andPayrateNotLike(String value) {
            addCriterion("PAYRATE not like", value, "payrate");
            return (Criteria) this;
        }

        public Criteria andPayrateIn(List<String> values) {
            addCriterion("PAYRATE in", values, "payrate");
            return (Criteria) this;
        }

        public Criteria andPayrateNotIn(List<String> values) {
            addCriterion("PAYRATE not in", values, "payrate");
            return (Criteria) this;
        }

        public Criteria andPayrateBetween(String value1, String value2) {
            addCriterion("PAYRATE between", value1, value2, "payrate");
            return (Criteria) this;
        }

        public Criteria andPayrateNotBetween(String value1, String value2) {
            addCriterion("PAYRATE not between", value1, value2, "payrate");
            return (Criteria) this;
        }

        public Criteria andCarloantypeIsNull() {
            addCriterion("CARLOANTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCarloantypeIsNotNull() {
            addCriterion("CARLOANTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCarloantypeEqualTo(String value) {
            addCriterion("CARLOANTYPE =", value, "carloantype");
            return (Criteria) this;
        }

        public Criteria andCarloantypeNotEqualTo(String value) {
            addCriterion("CARLOANTYPE <>", value, "carloantype");
            return (Criteria) this;
        }

        public Criteria andCarloantypeGreaterThan(String value) {
            addCriterion("CARLOANTYPE >", value, "carloantype");
            return (Criteria) this;
        }

        public Criteria andCarloantypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARLOANTYPE >=", value, "carloantype");
            return (Criteria) this;
        }

        public Criteria andCarloantypeLessThan(String value) {
            addCriterion("CARLOANTYPE <", value, "carloantype");
            return (Criteria) this;
        }

        public Criteria andCarloantypeLessThanOrEqualTo(String value) {
            addCriterion("CARLOANTYPE <=", value, "carloantype");
            return (Criteria) this;
        }

        public Criteria andCarloantypeLike(String value) {
            addCriterion("CARLOANTYPE like", value, "carloantype");
            return (Criteria) this;
        }

        public Criteria andCarloantypeNotLike(String value) {
            addCriterion("CARLOANTYPE not like", value, "carloantype");
            return (Criteria) this;
        }

        public Criteria andCarloantypeIn(List<String> values) {
            addCriterion("CARLOANTYPE in", values, "carloantype");
            return (Criteria) this;
        }

        public Criteria andCarloantypeNotIn(List<String> values) {
            addCriterion("CARLOANTYPE not in", values, "carloantype");
            return (Criteria) this;
        }

        public Criteria andCarloantypeBetween(String value1, String value2) {
            addCriterion("CARLOANTYPE between", value1, value2, "carloantype");
            return (Criteria) this;
        }

        public Criteria andCarloantypeNotBetween(String value1, String value2) {
            addCriterion("CARLOANTYPE not between", value1, value2, "carloantype");
            return (Criteria) this;
        }

        public Criteria andCarbrandstyleIsNull() {
            addCriterion("CARBRANDSTYLE is null");
            return (Criteria) this;
        }

        public Criteria andCarbrandstyleIsNotNull() {
            addCriterion("CARBRANDSTYLE is not null");
            return (Criteria) this;
        }

        public Criteria andCarbrandstyleEqualTo(String value) {
            addCriterion("CARBRANDSTYLE =", value, "carbrandstyle");
            return (Criteria) this;
        }

        public Criteria andCarbrandstyleNotEqualTo(String value) {
            addCriterion("CARBRANDSTYLE <>", value, "carbrandstyle");
            return (Criteria) this;
        }

        public Criteria andCarbrandstyleGreaterThan(String value) {
            addCriterion("CARBRANDSTYLE >", value, "carbrandstyle");
            return (Criteria) this;
        }

        public Criteria andCarbrandstyleGreaterThanOrEqualTo(String value) {
            addCriterion("CARBRANDSTYLE >=", value, "carbrandstyle");
            return (Criteria) this;
        }

        public Criteria andCarbrandstyleLessThan(String value) {
            addCriterion("CARBRANDSTYLE <", value, "carbrandstyle");
            return (Criteria) this;
        }

        public Criteria andCarbrandstyleLessThanOrEqualTo(String value) {
            addCriterion("CARBRANDSTYLE <=", value, "carbrandstyle");
            return (Criteria) this;
        }

        public Criteria andCarbrandstyleLike(String value) {
            addCriterion("CARBRANDSTYLE like", value, "carbrandstyle");
            return (Criteria) this;
        }

        public Criteria andCarbrandstyleNotLike(String value) {
            addCriterion("CARBRANDSTYLE not like", value, "carbrandstyle");
            return (Criteria) this;
        }

        public Criteria andCarbrandstyleIn(List<String> values) {
            addCriterion("CARBRANDSTYLE in", values, "carbrandstyle");
            return (Criteria) this;
        }

        public Criteria andCarbrandstyleNotIn(List<String> values) {
            addCriterion("CARBRANDSTYLE not in", values, "carbrandstyle");
            return (Criteria) this;
        }

        public Criteria andCarbrandstyleBetween(String value1, String value2) {
            addCriterion("CARBRANDSTYLE between", value1, value2, "carbrandstyle");
            return (Criteria) this;
        }

        public Criteria andCarbrandstyleNotBetween(String value1, String value2) {
            addCriterion("CARBRANDSTYLE not between", value1, value2, "carbrandstyle");
            return (Criteria) this;
        }

        public Criteria andCartrademarkIsNull() {
            addCriterion("CARTRADEMARK is null");
            return (Criteria) this;
        }

        public Criteria andCartrademarkIsNotNull() {
            addCriterion("CARTRADEMARK is not null");
            return (Criteria) this;
        }

        public Criteria andCartrademarkEqualTo(String value) {
            addCriterion("CARTRADEMARK =", value, "cartrademark");
            return (Criteria) this;
        }

        public Criteria andCartrademarkNotEqualTo(String value) {
            addCriterion("CARTRADEMARK <>", value, "cartrademark");
            return (Criteria) this;
        }

        public Criteria andCartrademarkGreaterThan(String value) {
            addCriterion("CARTRADEMARK >", value, "cartrademark");
            return (Criteria) this;
        }

        public Criteria andCartrademarkGreaterThanOrEqualTo(String value) {
            addCriterion("CARTRADEMARK >=", value, "cartrademark");
            return (Criteria) this;
        }

        public Criteria andCartrademarkLessThan(String value) {
            addCriterion("CARTRADEMARK <", value, "cartrademark");
            return (Criteria) this;
        }

        public Criteria andCartrademarkLessThanOrEqualTo(String value) {
            addCriterion("CARTRADEMARK <=", value, "cartrademark");
            return (Criteria) this;
        }

        public Criteria andCartrademarkLike(String value) {
            addCriterion("CARTRADEMARK like", value, "cartrademark");
            return (Criteria) this;
        }

        public Criteria andCartrademarkNotLike(String value) {
            addCriterion("CARTRADEMARK not like", value, "cartrademark");
            return (Criteria) this;
        }

        public Criteria andCartrademarkIn(List<String> values) {
            addCriterion("CARTRADEMARK in", values, "cartrademark");
            return (Criteria) this;
        }

        public Criteria andCartrademarkNotIn(List<String> values) {
            addCriterion("CARTRADEMARK not in", values, "cartrademark");
            return (Criteria) this;
        }

        public Criteria andCartrademarkBetween(String value1, String value2) {
            addCriterion("CARTRADEMARK between", value1, value2, "cartrademark");
            return (Criteria) this;
        }

        public Criteria andCartrademarkNotBetween(String value1, String value2) {
            addCriterion("CARTRADEMARK not between", value1, value2, "cartrademark");
            return (Criteria) this;
        }

        public Criteria andCarregcityIsNull() {
            addCriterion("CARREGCITY is null");
            return (Criteria) this;
        }

        public Criteria andCarregcityIsNotNull() {
            addCriterion("CARREGCITY is not null");
            return (Criteria) this;
        }

        public Criteria andCarregcityEqualTo(String value) {
            addCriterion("CARREGCITY =", value, "carregcity");
            return (Criteria) this;
        }

        public Criteria andCarregcityNotEqualTo(String value) {
            addCriterion("CARREGCITY <>", value, "carregcity");
            return (Criteria) this;
        }

        public Criteria andCarregcityGreaterThan(String value) {
            addCriterion("CARREGCITY >", value, "carregcity");
            return (Criteria) this;
        }

        public Criteria andCarregcityGreaterThanOrEqualTo(String value) {
            addCriterion("CARREGCITY >=", value, "carregcity");
            return (Criteria) this;
        }

        public Criteria andCarregcityLessThan(String value) {
            addCriterion("CARREGCITY <", value, "carregcity");
            return (Criteria) this;
        }

        public Criteria andCarregcityLessThanOrEqualTo(String value) {
            addCriterion("CARREGCITY <=", value, "carregcity");
            return (Criteria) this;
        }

        public Criteria andCarregcityLike(String value) {
            addCriterion("CARREGCITY like", value, "carregcity");
            return (Criteria) this;
        }

        public Criteria andCarregcityNotLike(String value) {
            addCriterion("CARREGCITY not like", value, "carregcity");
            return (Criteria) this;
        }

        public Criteria andCarregcityIn(List<String> values) {
            addCriterion("CARREGCITY in", values, "carregcity");
            return (Criteria) this;
        }

        public Criteria andCarregcityNotIn(List<String> values) {
            addCriterion("CARREGCITY not in", values, "carregcity");
            return (Criteria) this;
        }

        public Criteria andCarregcityBetween(String value1, String value2) {
            addCriterion("CARREGCITY between", value1, value2, "carregcity");
            return (Criteria) this;
        }

        public Criteria andCarregcityNotBetween(String value1, String value2) {
            addCriterion("CARREGCITY not between", value1, value2, "carregcity");
            return (Criteria) this;
        }

        public Criteria andCarenginenoIsNull() {
            addCriterion("CARENGINENO is null");
            return (Criteria) this;
        }

        public Criteria andCarenginenoIsNotNull() {
            addCriterion("CARENGINENO is not null");
            return (Criteria) this;
        }

        public Criteria andCarenginenoEqualTo(String value) {
            addCriterion("CARENGINENO =", value, "carengineno");
            return (Criteria) this;
        }

        public Criteria andCarenginenoNotEqualTo(String value) {
            addCriterion("CARENGINENO <>", value, "carengineno");
            return (Criteria) this;
        }

        public Criteria andCarenginenoGreaterThan(String value) {
            addCriterion("CARENGINENO >", value, "carengineno");
            return (Criteria) this;
        }

        public Criteria andCarenginenoGreaterThanOrEqualTo(String value) {
            addCriterion("CARENGINENO >=", value, "carengineno");
            return (Criteria) this;
        }

        public Criteria andCarenginenoLessThan(String value) {
            addCriterion("CARENGINENO <", value, "carengineno");
            return (Criteria) this;
        }

        public Criteria andCarenginenoLessThanOrEqualTo(String value) {
            addCriterion("CARENGINENO <=", value, "carengineno");
            return (Criteria) this;
        }

        public Criteria andCarenginenoLike(String value) {
            addCriterion("CARENGINENO like", value, "carengineno");
            return (Criteria) this;
        }

        public Criteria andCarenginenoNotLike(String value) {
            addCriterion("CARENGINENO not like", value, "carengineno");
            return (Criteria) this;
        }

        public Criteria andCarenginenoIn(List<String> values) {
            addCriterion("CARENGINENO in", values, "carengineno");
            return (Criteria) this;
        }

        public Criteria andCarenginenoNotIn(List<String> values) {
            addCriterion("CARENGINENO not in", values, "carengineno");
            return (Criteria) this;
        }

        public Criteria andCarenginenoBetween(String value1, String value2) {
            addCriterion("CARENGINENO between", value1, value2, "carengineno");
            return (Criteria) this;
        }

        public Criteria andCarenginenoNotBetween(String value1, String value2) {
            addCriterion("CARENGINENO not between", value1, value2, "carengineno");
            return (Criteria) this;
        }

        public Criteria andCarframenoIsNull() {
            addCriterion("CARFRAMENO is null");
            return (Criteria) this;
        }

        public Criteria andCarframenoIsNotNull() {
            addCriterion("CARFRAMENO is not null");
            return (Criteria) this;
        }

        public Criteria andCarframenoEqualTo(String value) {
            addCriterion("CARFRAMENO =", value, "carframeno");
            return (Criteria) this;
        }

        public Criteria andCarframenoNotEqualTo(String value) {
            addCriterion("CARFRAMENO <>", value, "carframeno");
            return (Criteria) this;
        }

        public Criteria andCarframenoGreaterThan(String value) {
            addCriterion("CARFRAMENO >", value, "carframeno");
            return (Criteria) this;
        }

        public Criteria andCarframenoGreaterThanOrEqualTo(String value) {
            addCriterion("CARFRAMENO >=", value, "carframeno");
            return (Criteria) this;
        }

        public Criteria andCarframenoLessThan(String value) {
            addCriterion("CARFRAMENO <", value, "carframeno");
            return (Criteria) this;
        }

        public Criteria andCarframenoLessThanOrEqualTo(String value) {
            addCriterion("CARFRAMENO <=", value, "carframeno");
            return (Criteria) this;
        }

        public Criteria andCarframenoLike(String value) {
            addCriterion("CARFRAMENO like", value, "carframeno");
            return (Criteria) this;
        }

        public Criteria andCarframenoNotLike(String value) {
            addCriterion("CARFRAMENO not like", value, "carframeno");
            return (Criteria) this;
        }

        public Criteria andCarframenoIn(List<String> values) {
            addCriterion("CARFRAMENO in", values, "carframeno");
            return (Criteria) this;
        }

        public Criteria andCarframenoNotIn(List<String> values) {
            addCriterion("CARFRAMENO not in", values, "carframeno");
            return (Criteria) this;
        }

        public Criteria andCarframenoBetween(String value1, String value2) {
            addCriterion("CARFRAMENO between", value1, value2, "carframeno");
            return (Criteria) this;
        }

        public Criteria andCarframenoNotBetween(String value1, String value2) {
            addCriterion("CARFRAMENO not between", value1, value2, "carframeno");
            return (Criteria) this;
        }

        public Criteria andCarbuytimeIsNull() {
            addCriterion("CARBUYTIME is null");
            return (Criteria) this;
        }

        public Criteria andCarbuytimeIsNotNull() {
            addCriterion("CARBUYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCarbuytimeEqualTo(Date value) {
            addCriterionForJDBCDate("CARBUYTIME =", value, "carbuytime");
            return (Criteria) this;
        }

        public Criteria andCarbuytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CARBUYTIME <>", value, "carbuytime");
            return (Criteria) this;
        }

        public Criteria andCarbuytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CARBUYTIME >", value, "carbuytime");
            return (Criteria) this;
        }

        public Criteria andCarbuytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CARBUYTIME >=", value, "carbuytime");
            return (Criteria) this;
        }

        public Criteria andCarbuytimeLessThan(Date value) {
            addCriterionForJDBCDate("CARBUYTIME <", value, "carbuytime");
            return (Criteria) this;
        }

        public Criteria andCarbuytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CARBUYTIME <=", value, "carbuytime");
            return (Criteria) this;
        }

        public Criteria andCarbuytimeIn(List<Date> values) {
            addCriterionForJDBCDate("CARBUYTIME in", values, "carbuytime");
            return (Criteria) this;
        }

        public Criteria andCarbuytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CARBUYTIME not in", values, "carbuytime");
            return (Criteria) this;
        }

        public Criteria andCarbuytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CARBUYTIME between", value1, value2, "carbuytime");
            return (Criteria) this;
        }

        public Criteria andCarbuytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CARBUYTIME not between", value1, value2, "carbuytime");
            return (Criteria) this;
        }

        public Criteria andCarpriceIsNull() {
            addCriterion("CARPRICE is null");
            return (Criteria) this;
        }

        public Criteria andCarpriceIsNotNull() {
            addCriterion("CARPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCarpriceEqualTo(BigDecimal value) {
            addCriterion("CARPRICE =", value, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceNotEqualTo(BigDecimal value) {
            addCriterion("CARPRICE <>", value, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceGreaterThan(BigDecimal value) {
            addCriterion("CARPRICE >", value, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CARPRICE >=", value, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceLessThan(BigDecimal value) {
            addCriterion("CARPRICE <", value, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CARPRICE <=", value, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceIn(List<BigDecimal> values) {
            addCriterion("CARPRICE in", values, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceNotIn(List<BigDecimal> values) {
            addCriterion("CARPRICE not in", values, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARPRICE between", value1, value2, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARPRICE not between", value1, value2, "carprice");
            return (Criteria) this;
        }

        public Criteria andEvaluatepriceIsNull() {
            addCriterion("EVALUATEPRICE is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatepriceIsNotNull() {
            addCriterion("EVALUATEPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatepriceEqualTo(BigDecimal value) {
            addCriterion("EVALUATEPRICE =", value, "evaluateprice");
            return (Criteria) this;
        }

        public Criteria andEvaluatepriceNotEqualTo(BigDecimal value) {
            addCriterion("EVALUATEPRICE <>", value, "evaluateprice");
            return (Criteria) this;
        }

        public Criteria andEvaluatepriceGreaterThan(BigDecimal value) {
            addCriterion("EVALUATEPRICE >", value, "evaluateprice");
            return (Criteria) this;
        }

        public Criteria andEvaluatepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EVALUATEPRICE >=", value, "evaluateprice");
            return (Criteria) this;
        }

        public Criteria andEvaluatepriceLessThan(BigDecimal value) {
            addCriterion("EVALUATEPRICE <", value, "evaluateprice");
            return (Criteria) this;
        }

        public Criteria andEvaluatepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EVALUATEPRICE <=", value, "evaluateprice");
            return (Criteria) this;
        }

        public Criteria andEvaluatepriceIn(List<BigDecimal> values) {
            addCriterion("EVALUATEPRICE in", values, "evaluateprice");
            return (Criteria) this;
        }

        public Criteria andEvaluatepriceNotIn(List<BigDecimal> values) {
            addCriterion("EVALUATEPRICE not in", values, "evaluateprice");
            return (Criteria) this;
        }

        public Criteria andEvaluatepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EVALUATEPRICE between", value1, value2, "evaluateprice");
            return (Criteria) this;
        }

        public Criteria andEvaluatepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EVALUATEPRICE not between", value1, value2, "evaluateprice");
            return (Criteria) this;
        }

        public Criteria andEvaluatorIsNull() {
            addCriterion("EVALUATOR is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatorIsNotNull() {
            addCriterion("EVALUATOR is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatorEqualTo(String value) {
            addCriterion("EVALUATOR =", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorNotEqualTo(String value) {
            addCriterion("EVALUATOR <>", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorGreaterThan(String value) {
            addCriterion("EVALUATOR >", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorGreaterThanOrEqualTo(String value) {
            addCriterion("EVALUATOR >=", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorLessThan(String value) {
            addCriterion("EVALUATOR <", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorLessThanOrEqualTo(String value) {
            addCriterion("EVALUATOR <=", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorLike(String value) {
            addCriterion("EVALUATOR like", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorNotLike(String value) {
            addCriterion("EVALUATOR not like", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorIn(List<String> values) {
            addCriterion("EVALUATOR in", values, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorNotIn(List<String> values) {
            addCriterion("EVALUATOR not in", values, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorBetween(String value1, String value2) {
            addCriterion("EVALUATOR between", value1, value2, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorNotBetween(String value1, String value2) {
            addCriterion("EVALUATOR not between", value1, value2, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeIsNull() {
            addCriterion("EVALUATETIME is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeIsNotNull() {
            addCriterion("EVALUATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("EVALUATETIME =", value, "evaluatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("EVALUATETIME <>", value, "evaluatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("EVALUATETIME >", value, "evaluatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EVALUATETIME >=", value, "evaluatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeLessThan(Date value) {
            addCriterionForJDBCDate("EVALUATETIME <", value, "evaluatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EVALUATETIME <=", value, "evaluatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("EVALUATETIME in", values, "evaluatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("EVALUATETIME not in", values, "evaluatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EVALUATETIME between", value1, value2, "evaluatetime");
            return (Criteria) this;
        }

        public Criteria andEvaluatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EVALUATETIME not between", value1, value2, "evaluatetime");
            return (Criteria) this;
        }

        public Criteria andLiableperson1IsNull() {
            addCriterion("LIABLEPERSON1 is null");
            return (Criteria) this;
        }

        public Criteria andLiableperson1IsNotNull() {
            addCriterion("LIABLEPERSON1 is not null");
            return (Criteria) this;
        }

        public Criteria andLiableperson1EqualTo(String value) {
            addCriterion("LIABLEPERSON1 =", value, "liableperson1");
            return (Criteria) this;
        }

        public Criteria andLiableperson1NotEqualTo(String value) {
            addCriterion("LIABLEPERSON1 <>", value, "liableperson1");
            return (Criteria) this;
        }

        public Criteria andLiableperson1GreaterThan(String value) {
            addCriterion("LIABLEPERSON1 >", value, "liableperson1");
            return (Criteria) this;
        }

        public Criteria andLiableperson1GreaterThanOrEqualTo(String value) {
            addCriterion("LIABLEPERSON1 >=", value, "liableperson1");
            return (Criteria) this;
        }

        public Criteria andLiableperson1LessThan(String value) {
            addCriterion("LIABLEPERSON1 <", value, "liableperson1");
            return (Criteria) this;
        }

        public Criteria andLiableperson1LessThanOrEqualTo(String value) {
            addCriterion("LIABLEPERSON1 <=", value, "liableperson1");
            return (Criteria) this;
        }

        public Criteria andLiableperson1Like(String value) {
            addCriterion("LIABLEPERSON1 like", value, "liableperson1");
            return (Criteria) this;
        }

        public Criteria andLiableperson1NotLike(String value) {
            addCriterion("LIABLEPERSON1 not like", value, "liableperson1");
            return (Criteria) this;
        }

        public Criteria andLiableperson1In(List<String> values) {
            addCriterion("LIABLEPERSON1 in", values, "liableperson1");
            return (Criteria) this;
        }

        public Criteria andLiableperson1NotIn(List<String> values) {
            addCriterion("LIABLEPERSON1 not in", values, "liableperson1");
            return (Criteria) this;
        }

        public Criteria andLiableperson1Between(String value1, String value2) {
            addCriterion("LIABLEPERSON1 between", value1, value2, "liableperson1");
            return (Criteria) this;
        }

        public Criteria andLiableperson1NotBetween(String value1, String value2) {
            addCriterion("LIABLEPERSON1 not between", value1, value2, "liableperson1");
            return (Criteria) this;
        }

        public Criteria andLiableperson2IsNull() {
            addCriterion("LIABLEPERSON2 is null");
            return (Criteria) this;
        }

        public Criteria andLiableperson2IsNotNull() {
            addCriterion("LIABLEPERSON2 is not null");
            return (Criteria) this;
        }

        public Criteria andLiableperson2EqualTo(String value) {
            addCriterion("LIABLEPERSON2 =", value, "liableperson2");
            return (Criteria) this;
        }

        public Criteria andLiableperson2NotEqualTo(String value) {
            addCriterion("LIABLEPERSON2 <>", value, "liableperson2");
            return (Criteria) this;
        }

        public Criteria andLiableperson2GreaterThan(String value) {
            addCriterion("LIABLEPERSON2 >", value, "liableperson2");
            return (Criteria) this;
        }

        public Criteria andLiableperson2GreaterThanOrEqualTo(String value) {
            addCriterion("LIABLEPERSON2 >=", value, "liableperson2");
            return (Criteria) this;
        }

        public Criteria andLiableperson2LessThan(String value) {
            addCriterion("LIABLEPERSON2 <", value, "liableperson2");
            return (Criteria) this;
        }

        public Criteria andLiableperson2LessThanOrEqualTo(String value) {
            addCriterion("LIABLEPERSON2 <=", value, "liableperson2");
            return (Criteria) this;
        }

        public Criteria andLiableperson2Like(String value) {
            addCriterion("LIABLEPERSON2 like", value, "liableperson2");
            return (Criteria) this;
        }

        public Criteria andLiableperson2NotLike(String value) {
            addCriterion("LIABLEPERSON2 not like", value, "liableperson2");
            return (Criteria) this;
        }

        public Criteria andLiableperson2In(List<String> values) {
            addCriterion("LIABLEPERSON2 in", values, "liableperson2");
            return (Criteria) this;
        }

        public Criteria andLiableperson2NotIn(List<String> values) {
            addCriterion("LIABLEPERSON2 not in", values, "liableperson2");
            return (Criteria) this;
        }

        public Criteria andLiableperson2Between(String value1, String value2) {
            addCriterion("LIABLEPERSON2 between", value1, value2, "liableperson2");
            return (Criteria) this;
        }

        public Criteria andLiableperson2NotBetween(String value1, String value2) {
            addCriterion("LIABLEPERSON2 not between", value1, value2, "liableperson2");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateidIsNull() {
            addCriterion("CREATEID is null");
            return (Criteria) this;
        }

        public Criteria andCreateidIsNotNull() {
            addCriterion("CREATEID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateidEqualTo(String value) {
            addCriterion("CREATEID =", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotEqualTo(String value) {
            addCriterion("CREATEID <>", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidGreaterThan(String value) {
            addCriterion("CREATEID >", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEID >=", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLessThan(String value) {
            addCriterion("CREATEID <", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLessThanOrEqualTo(String value) {
            addCriterion("CREATEID <=", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLike(String value) {
            addCriterion("CREATEID like", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotLike(String value) {
            addCriterion("CREATEID not like", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidIn(List<String> values) {
            addCriterion("CREATEID in", values, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotIn(List<String> values) {
            addCriterion("CREATEID not in", values, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidBetween(String value1, String value2) {
            addCriterion("CREATEID between", value1, value2, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotBetween(String value1, String value2) {
            addCriterion("CREATEID not between", value1, value2, "createid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdateidIsNull() {
            addCriterion("UPDATEID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateidIsNotNull() {
            addCriterion("UPDATEID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateidEqualTo(String value) {
            addCriterion("UPDATEID =", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotEqualTo(String value) {
            addCriterion("UPDATEID <>", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidGreaterThan(String value) {
            addCriterion("UPDATEID >", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEID >=", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidLessThan(String value) {
            addCriterion("UPDATEID <", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidLessThanOrEqualTo(String value) {
            addCriterion("UPDATEID <=", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidLike(String value) {
            addCriterion("UPDATEID like", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotLike(String value) {
            addCriterion("UPDATEID not like", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidIn(List<String> values) {
            addCriterion("UPDATEID in", values, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotIn(List<String> values) {
            addCriterion("UPDATEID not in", values, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidBetween(String value1, String value2) {
            addCriterion("UPDATEID between", value1, value2, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotBetween(String value1, String value2) {
            addCriterion("UPDATEID not between", value1, value2, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}