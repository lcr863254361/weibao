package com.orient.weibao.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TotalCarryToolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TotalCarryToolExample() {
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

        public Criteria andSysDateTimeIsNull() {
            addCriterion("SYS_DATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSysDateTimeIsNotNull() {
            addCriterion("SYS_DATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSysDateTimeEqualTo(Date value) {
            addCriterion("SYS_DATE_TIME =", value, "sysDateTime");
            return (Criteria) this;
        }

        public Criteria andSysDateTimeNotEqualTo(Date value) {
            addCriterion("SYS_DATE_TIME <>", value, "sysDateTime");
            return (Criteria) this;
        }

        public Criteria andSysDateTimeGreaterThan(Date value) {
            addCriterion("SYS_DATE_TIME >", value, "sysDateTime");
            return (Criteria) this;
        }

        public Criteria andSysDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SYS_DATE_TIME >=", value, "sysDateTime");
            return (Criteria) this;
        }

        public Criteria andSysDateTimeLessThan(Date value) {
            addCriterion("SYS_DATE_TIME <", value, "sysDateTime");
            return (Criteria) this;
        }

        public Criteria andSysDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("SYS_DATE_TIME <=", value, "sysDateTime");
            return (Criteria) this;
        }

        public Criteria andSysDateTimeIn(List<Date> values) {
            addCriterion("SYS_DATE_TIME in", values, "sysDateTime");
            return (Criteria) this;
        }

        public Criteria andSysDateTimeNotIn(List<Date> values) {
            addCriterion("SYS_DATE_TIME not in", values, "sysDateTime");
            return (Criteria) this;
        }

        public Criteria andSysDateTimeBetween(Date value1, Date value2) {
            addCriterion("SYS_DATE_TIME between", value1, value2, "sysDateTime");
            return (Criteria) this;
        }

        public Criteria andSysDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("SYS_DATE_TIME not between", value1, value2, "sysDateTime");
            return (Criteria) this;
        }

        public Criteria andSysUsernameIsNull() {
            addCriterion("SYS_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andSysUsernameIsNotNull() {
            addCriterion("SYS_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSysUsernameEqualTo(String value) {
            addCriterion("SYS_USERNAME =", value, "sysUsername");
            return (Criteria) this;
        }

        public Criteria andSysUsernameNotEqualTo(String value) {
            addCriterion("SYS_USERNAME <>", value, "sysUsername");
            return (Criteria) this;
        }

        public Criteria andSysUsernameGreaterThan(String value) {
            addCriterion("SYS_USERNAME >", value, "sysUsername");
            return (Criteria) this;
        }

        public Criteria andSysUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_USERNAME >=", value, "sysUsername");
            return (Criteria) this;
        }

        public Criteria andSysUsernameLessThan(String value) {
            addCriterion("SYS_USERNAME <", value, "sysUsername");
            return (Criteria) this;
        }

        public Criteria andSysUsernameLessThanOrEqualTo(String value) {
            addCriterion("SYS_USERNAME <=", value, "sysUsername");
            return (Criteria) this;
        }

        public Criteria andSysUsernameLike(String value) {
            addCriterion("SYS_USERNAME like", value, "sysUsername");
            return (Criteria) this;
        }

        public Criteria andSysUsernameNotLike(String value) {
            addCriterion("SYS_USERNAME not like", value, "sysUsername");
            return (Criteria) this;
        }

        public Criteria andSysUsernameIn(List<String> values) {
            addCriterion("SYS_USERNAME in", values, "sysUsername");
            return (Criteria) this;
        }

        public Criteria andSysUsernameNotIn(List<String> values) {
            addCriterion("SYS_USERNAME not in", values, "sysUsername");
            return (Criteria) this;
        }

        public Criteria andSysUsernameBetween(String value1, String value2) {
            addCriterion("SYS_USERNAME between", value1, value2, "sysUsername");
            return (Criteria) this;
        }

        public Criteria andSysUsernameNotBetween(String value1, String value2) {
            addCriterion("SYS_USERNAME not between", value1, value2, "sysUsername");
            return (Criteria) this;
        }

        public Criteria andSysIsDeleteIsNull() {
            addCriterion("SYS_IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andSysIsDeleteIsNotNull() {
            addCriterion("SYS_IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andSysIsDeleteEqualTo(Long value) {
            addCriterion("SYS_IS_DELETE =", value, "sysIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysIsDeleteNotEqualTo(Long value) {
            addCriterion("SYS_IS_DELETE <>", value, "sysIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysIsDeleteGreaterThan(Long value) {
            addCriterion("SYS_IS_DELETE >", value, "sysIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysIsDeleteGreaterThanOrEqualTo(Long value) {
            addCriterion("SYS_IS_DELETE >=", value, "sysIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysIsDeleteLessThan(Long value) {
            addCriterion("SYS_IS_DELETE <", value, "sysIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysIsDeleteLessThanOrEqualTo(Long value) {
            addCriterion("SYS_IS_DELETE <=", value, "sysIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysIsDeleteIn(List<Long> values) {
            addCriterion("SYS_IS_DELETE in", values, "sysIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysIsDeleteNotIn(List<Long> values) {
            addCriterion("SYS_IS_DELETE not in", values, "sysIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysIsDeleteBetween(Long value1, Long value2) {
            addCriterion("SYS_IS_DELETE between", value1, value2, "sysIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysIsDeleteNotBetween(Long value1, Long value2) {
            addCriterion("SYS_IS_DELETE not between", value1, value2, "sysIsDelete");
            return (Criteria) this;
        }

        public Criteria andSysSecrecyIsNull() {
            addCriterion("SYS_SECRECY is null");
            return (Criteria) this;
        }

        public Criteria andSysSecrecyIsNotNull() {
            addCriterion("SYS_SECRECY is not null");
            return (Criteria) this;
        }

        public Criteria andSysSecrecyEqualTo(String value) {
            addCriterion("SYS_SECRECY =", value, "sysSecrecy");
            return (Criteria) this;
        }

        public Criteria andSysSecrecyNotEqualTo(String value) {
            addCriterion("SYS_SECRECY <>", value, "sysSecrecy");
            return (Criteria) this;
        }

        public Criteria andSysSecrecyGreaterThan(String value) {
            addCriterion("SYS_SECRECY >", value, "sysSecrecy");
            return (Criteria) this;
        }

        public Criteria andSysSecrecyGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_SECRECY >=", value, "sysSecrecy");
            return (Criteria) this;
        }

        public Criteria andSysSecrecyLessThan(String value) {
            addCriterion("SYS_SECRECY <", value, "sysSecrecy");
            return (Criteria) this;
        }

        public Criteria andSysSecrecyLessThanOrEqualTo(String value) {
            addCriterion("SYS_SECRECY <=", value, "sysSecrecy");
            return (Criteria) this;
        }

        public Criteria andSysSecrecyLike(String value) {
            addCriterion("SYS_SECRECY like", value, "sysSecrecy");
            return (Criteria) this;
        }

        public Criteria andSysSecrecyNotLike(String value) {
            addCriterion("SYS_SECRECY not like", value, "sysSecrecy");
            return (Criteria) this;
        }

        public Criteria andSysSecrecyIn(List<String> values) {
            addCriterion("SYS_SECRECY in", values, "sysSecrecy");
            return (Criteria) this;
        }

        public Criteria andSysSecrecyNotIn(List<String> values) {
            addCriterion("SYS_SECRECY not in", values, "sysSecrecy");
            return (Criteria) this;
        }

        public Criteria andSysSecrecyBetween(String value1, String value2) {
            addCriterion("SYS_SECRECY between", value1, value2, "sysSecrecy");
            return (Criteria) this;
        }

        public Criteria andSysSecrecyNotBetween(String value1, String value2) {
            addCriterion("SYS_SECRECY not between", value1, value2, "sysSecrecy");
            return (Criteria) this;
        }

        public Criteria andSysSchemaIsNull() {
            addCriterion("SYS_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andSysSchemaIsNotNull() {
            addCriterion("SYS_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andSysSchemaEqualTo(String value) {
            addCriterion("SYS_SCHEMA =", value, "sysSchema");
            return (Criteria) this;
        }

        public Criteria andSysSchemaNotEqualTo(String value) {
            addCriterion("SYS_SCHEMA <>", value, "sysSchema");
            return (Criteria) this;
        }

        public Criteria andSysSchemaGreaterThan(String value) {
            addCriterion("SYS_SCHEMA >", value, "sysSchema");
            return (Criteria) this;
        }

        public Criteria andSysSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_SCHEMA >=", value, "sysSchema");
            return (Criteria) this;
        }

        public Criteria andSysSchemaLessThan(String value) {
            addCriterion("SYS_SCHEMA <", value, "sysSchema");
            return (Criteria) this;
        }

        public Criteria andSysSchemaLessThanOrEqualTo(String value) {
            addCriterion("SYS_SCHEMA <=", value, "sysSchema");
            return (Criteria) this;
        }

        public Criteria andSysSchemaLike(String value) {
            addCriterion("SYS_SCHEMA like", value, "sysSchema");
            return (Criteria) this;
        }

        public Criteria andSysSchemaNotLike(String value) {
            addCriterion("SYS_SCHEMA not like", value, "sysSchema");
            return (Criteria) this;
        }

        public Criteria andSysSchemaIn(List<String> values) {
            addCriterion("SYS_SCHEMA in", values, "sysSchema");
            return (Criteria) this;
        }

        public Criteria andSysSchemaNotIn(List<String> values) {
            addCriterion("SYS_SCHEMA not in", values, "sysSchema");
            return (Criteria) this;
        }

        public Criteria andSysSchemaBetween(String value1, String value2) {
            addCriterion("SYS_SCHEMA between", value1, value2, "sysSchema");
            return (Criteria) this;
        }

        public Criteria andSysSchemaNotBetween(String value1, String value2) {
            addCriterion("SYS_SCHEMA not between", value1, value2, "sysSchema");
            return (Criteria) this;
        }

        public Criteria andSysOperateIsNull() {
            addCriterion("SYS_OPERATE is null");
            return (Criteria) this;
        }

        public Criteria andSysOperateIsNotNull() {
            addCriterion("SYS_OPERATE is not null");
            return (Criteria) this;
        }

        public Criteria andSysOperateEqualTo(String value) {
            addCriterion("SYS_OPERATE =", value, "sysOperate");
            return (Criteria) this;
        }

        public Criteria andSysOperateNotEqualTo(String value) {
            addCriterion("SYS_OPERATE <>", value, "sysOperate");
            return (Criteria) this;
        }

        public Criteria andSysOperateGreaterThan(String value) {
            addCriterion("SYS_OPERATE >", value, "sysOperate");
            return (Criteria) this;
        }

        public Criteria andSysOperateGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_OPERATE >=", value, "sysOperate");
            return (Criteria) this;
        }

        public Criteria andSysOperateLessThan(String value) {
            addCriterion("SYS_OPERATE <", value, "sysOperate");
            return (Criteria) this;
        }

        public Criteria andSysOperateLessThanOrEqualTo(String value) {
            addCriterion("SYS_OPERATE <=", value, "sysOperate");
            return (Criteria) this;
        }

        public Criteria andSysOperateLike(String value) {
            addCriterion("SYS_OPERATE like", value, "sysOperate");
            return (Criteria) this;
        }

        public Criteria andSysOperateNotLike(String value) {
            addCriterion("SYS_OPERATE not like", value, "sysOperate");
            return (Criteria) this;
        }

        public Criteria andSysOperateIn(List<String> values) {
            addCriterion("SYS_OPERATE in", values, "sysOperate");
            return (Criteria) this;
        }

        public Criteria andSysOperateNotIn(List<String> values) {
            addCriterion("SYS_OPERATE not in", values, "sysOperate");
            return (Criteria) this;
        }

        public Criteria andSysOperateBetween(String value1, String value2) {
            addCriterion("SYS_OPERATE between", value1, value2, "sysOperate");
            return (Criteria) this;
        }

        public Criteria andSysOperateNotBetween(String value1, String value2) {
            addCriterion("SYS_OPERATE not between", value1, value2, "sysOperate");
            return (Criteria) this;
        }

        public Criteria andSysFlowIsNull() {
            addCriterion("SYS_FLOW is null");
            return (Criteria) this;
        }

        public Criteria andSysFlowIsNotNull() {
            addCriterion("SYS_FLOW is not null");
            return (Criteria) this;
        }

        public Criteria andSysFlowEqualTo(String value) {
            addCriterion("SYS_FLOW =", value, "sysFlow");
            return (Criteria) this;
        }

        public Criteria andSysFlowNotEqualTo(String value) {
            addCriterion("SYS_FLOW <>", value, "sysFlow");
            return (Criteria) this;
        }

        public Criteria andSysFlowGreaterThan(String value) {
            addCriterion("SYS_FLOW >", value, "sysFlow");
            return (Criteria) this;
        }

        public Criteria andSysFlowGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_FLOW >=", value, "sysFlow");
            return (Criteria) this;
        }

        public Criteria andSysFlowLessThan(String value) {
            addCriterion("SYS_FLOW <", value, "sysFlow");
            return (Criteria) this;
        }

        public Criteria andSysFlowLessThanOrEqualTo(String value) {
            addCriterion("SYS_FLOW <=", value, "sysFlow");
            return (Criteria) this;
        }

        public Criteria andSysFlowLike(String value) {
            addCriterion("SYS_FLOW like", value, "sysFlow");
            return (Criteria) this;
        }

        public Criteria andSysFlowNotLike(String value) {
            addCriterion("SYS_FLOW not like", value, "sysFlow");
            return (Criteria) this;
        }

        public Criteria andSysFlowIn(List<String> values) {
            addCriterion("SYS_FLOW in", values, "sysFlow");
            return (Criteria) this;
        }

        public Criteria andSysFlowNotIn(List<String> values) {
            addCriterion("SYS_FLOW not in", values, "sysFlow");
            return (Criteria) this;
        }

        public Criteria andSysFlowBetween(String value1, String value2) {
            addCriterion("SYS_FLOW between", value1, value2, "sysFlow");
            return (Criteria) this;
        }

        public Criteria andSysFlowNotBetween(String value1, String value2) {
            addCriterion("SYS_FLOW not between", value1, value2, "sysFlow");
            return (Criteria) this;
        }

        public Criteria andCAirWeight3607IsNull() {
            addCriterion("C_AIR_WEIGHT_3607 is null");
            return (Criteria) this;
        }

        public Criteria andCAirWeight3607IsNotNull() {
            addCriterion("C_AIR_WEIGHT_3607 is not null");
            return (Criteria) this;
        }

        public Criteria andCAirWeight3607EqualTo(Double value) {
            addCriterion("C_AIR_WEIGHT_3607 =", value, "cAirWeight3607");
            return (Criteria) this;
        }

        public Criteria andCAirWeight3607NotEqualTo(Double value) {
            addCriterion("C_AIR_WEIGHT_3607 <>", value, "cAirWeight3607");
            return (Criteria) this;
        }

        public Criteria andCAirWeight3607GreaterThan(Double value) {
            addCriterion("C_AIR_WEIGHT_3607 >", value, "cAirWeight3607");
            return (Criteria) this;
        }

        public Criteria andCAirWeight3607GreaterThanOrEqualTo(Double value) {
            addCriterion("C_AIR_WEIGHT_3607 >=", value, "cAirWeight3607");
            return (Criteria) this;
        }

        public Criteria andCAirWeight3607LessThan(Double value) {
            addCriterion("C_AIR_WEIGHT_3607 <", value, "cAirWeight3607");
            return (Criteria) this;
        }

        public Criteria andCAirWeight3607LessThanOrEqualTo(Double value) {
            addCriterion("C_AIR_WEIGHT_3607 <=", value, "cAirWeight3607");
            return (Criteria) this;
        }

        public Criteria andCAirWeight3607In(List<Double> values) {
            addCriterion("C_AIR_WEIGHT_3607 in", values, "cAirWeight3607");
            return (Criteria) this;
        }

        public Criteria andCAirWeight3607NotIn(List<Double> values) {
            addCriterion("C_AIR_WEIGHT_3607 not in", values, "cAirWeight3607");
            return (Criteria) this;
        }

        public Criteria andCAirWeight3607Between(Double value1, Double value2) {
            addCriterion("C_AIR_WEIGHT_3607 between", value1, value2, "cAirWeight3607");
            return (Criteria) this;
        }

        public Criteria andCAirWeight3607NotBetween(Double value1, Double value2) {
            addCriterion("C_AIR_WEIGHT_3607 not between", value1, value2, "cAirWeight3607");
            return (Criteria) this;
        }

        public Criteria andCDewaterVolume3607IsNull() {
            addCriterion("C_DEWATER_VOLUME_3607 is null");
            return (Criteria) this;
        }

        public Criteria andCDewaterVolume3607IsNotNull() {
            addCriterion("C_DEWATER_VOLUME_3607 is not null");
            return (Criteria) this;
        }

        public Criteria andCDewaterVolume3607EqualTo(Double value) {
            addCriterion("C_DEWATER_VOLUME_3607 =", value, "cDewaterVolume3607");
            return (Criteria) this;
        }

        public Criteria andCDewaterVolume3607NotEqualTo(Double value) {
            addCriterion("C_DEWATER_VOLUME_3607 <>", value, "cDewaterVolume3607");
            return (Criteria) this;
        }

        public Criteria andCDewaterVolume3607GreaterThan(Double value) {
            addCriterion("C_DEWATER_VOLUME_3607 >", value, "cDewaterVolume3607");
            return (Criteria) this;
        }

        public Criteria andCDewaterVolume3607GreaterThanOrEqualTo(Double value) {
            addCriterion("C_DEWATER_VOLUME_3607 >=", value, "cDewaterVolume3607");
            return (Criteria) this;
        }

        public Criteria andCDewaterVolume3607LessThan(Double value) {
            addCriterion("C_DEWATER_VOLUME_3607 <", value, "cDewaterVolume3607");
            return (Criteria) this;
        }

        public Criteria andCDewaterVolume3607LessThanOrEqualTo(Double value) {
            addCriterion("C_DEWATER_VOLUME_3607 <=", value, "cDewaterVolume3607");
            return (Criteria) this;
        }

        public Criteria andCDewaterVolume3607In(List<Double> values) {
            addCriterion("C_DEWATER_VOLUME_3607 in", values, "cDewaterVolume3607");
            return (Criteria) this;
        }

        public Criteria andCDewaterVolume3607NotIn(List<Double> values) {
            addCriterion("C_DEWATER_VOLUME_3607 not in", values, "cDewaterVolume3607");
            return (Criteria) this;
        }

        public Criteria andCDewaterVolume3607Between(Double value1, Double value2) {
            addCriterion("C_DEWATER_VOLUME_3607 between", value1, value2, "cDewaterVolume3607");
            return (Criteria) this;
        }

        public Criteria andCDewaterVolume3607NotBetween(Double value1, Double value2) {
            addCriterion("C_DEWATER_VOLUME_3607 not between", value1, value2, "cDewaterVolume3607");
            return (Criteria) this;
        }

        public Criteria andCStockNumber3607IsNull() {
            addCriterion("C_STOCK_NUMBER_3607 is null");
            return (Criteria) this;
        }

        public Criteria andCStockNumber3607IsNotNull() {
            addCriterion("C_STOCK_NUMBER_3607 is not null");
            return (Criteria) this;
        }

        public Criteria andCStockNumber3607EqualTo(Long value) {
            addCriterion("C_STOCK_NUMBER_3607 =", value, "cStockNumber3607");
            return (Criteria) this;
        }

        public Criteria andCStockNumber3607NotEqualTo(Long value) {
            addCriterion("C_STOCK_NUMBER_3607 <>", value, "cStockNumber3607");
            return (Criteria) this;
        }

        public Criteria andCStockNumber3607GreaterThan(Long value) {
            addCriterion("C_STOCK_NUMBER_3607 >", value, "cStockNumber3607");
            return (Criteria) this;
        }

        public Criteria andCStockNumber3607GreaterThanOrEqualTo(Long value) {
            addCriterion("C_STOCK_NUMBER_3607 >=", value, "cStockNumber3607");
            return (Criteria) this;
        }

        public Criteria andCStockNumber3607LessThan(Long value) {
            addCriterion("C_STOCK_NUMBER_3607 <", value, "cStockNumber3607");
            return (Criteria) this;
        }

        public Criteria andCStockNumber3607LessThanOrEqualTo(Long value) {
            addCriterion("C_STOCK_NUMBER_3607 <=", value, "cStockNumber3607");
            return (Criteria) this;
        }

        public Criteria andCStockNumber3607In(List<Long> values) {
            addCriterion("C_STOCK_NUMBER_3607 in", values, "cStockNumber3607");
            return (Criteria) this;
        }

        public Criteria andCStockNumber3607NotIn(List<Long> values) {
            addCriterion("C_STOCK_NUMBER_3607 not in", values, "cStockNumber3607");
            return (Criteria) this;
        }

        public Criteria andCStockNumber3607Between(Long value1, Long value2) {
            addCriterion("C_STOCK_NUMBER_3607 between", value1, value2, "cStockNumber3607");
            return (Criteria) this;
        }

        public Criteria andCStockNumber3607NotBetween(Long value1, Long value2) {
            addCriterion("C_STOCK_NUMBER_3607 not between", value1, value2, "cStockNumber3607");
            return (Criteria) this;
        }

        public Criteria andCFreshWaterWeight3607IsNull() {
            addCriterion("C_FRESH_WATER_WEIGHT_3607 is null");
            return (Criteria) this;
        }

        public Criteria andCFreshWaterWeight3607IsNotNull() {
            addCriterion("C_FRESH_WATER_WEIGHT_3607 is not null");
            return (Criteria) this;
        }

        public Criteria andCFreshWaterWeight3607EqualTo(Double value) {
            addCriterion("C_FRESH_WATER_WEIGHT_3607 =", value, "cFreshWaterWeight3607");
            return (Criteria) this;
        }

        public Criteria andCFreshWaterWeight3607NotEqualTo(Double value) {
            addCriterion("C_FRESH_WATER_WEIGHT_3607 <>", value, "cFreshWaterWeight3607");
            return (Criteria) this;
        }

        public Criteria andCFreshWaterWeight3607GreaterThan(Double value) {
            addCriterion("C_FRESH_WATER_WEIGHT_3607 >", value, "cFreshWaterWeight3607");
            return (Criteria) this;
        }

        public Criteria andCFreshWaterWeight3607GreaterThanOrEqualTo(Double value) {
            addCriterion("C_FRESH_WATER_WEIGHT_3607 >=", value, "cFreshWaterWeight3607");
            return (Criteria) this;
        }

        public Criteria andCFreshWaterWeight3607LessThan(Double value) {
            addCriterion("C_FRESH_WATER_WEIGHT_3607 <", value, "cFreshWaterWeight3607");
            return (Criteria) this;
        }

        public Criteria andCFreshWaterWeight3607LessThanOrEqualTo(Double value) {
            addCriterion("C_FRESH_WATER_WEIGHT_3607 <=", value, "cFreshWaterWeight3607");
            return (Criteria) this;
        }

        public Criteria andCFreshWaterWeight3607In(List<Double> values) {
            addCriterion("C_FRESH_WATER_WEIGHT_3607 in", values, "cFreshWaterWeight3607");
            return (Criteria) this;
        }

        public Criteria andCFreshWaterWeight3607NotIn(List<Double> values) {
            addCriterion("C_FRESH_WATER_WEIGHT_3607 not in", values, "cFreshWaterWeight3607");
            return (Criteria) this;
        }

        public Criteria andCFreshWaterWeight3607Between(Double value1, Double value2) {
            addCriterion("C_FRESH_WATER_WEIGHT_3607 between", value1, value2, "cFreshWaterWeight3607");
            return (Criteria) this;
        }

        public Criteria andCFreshWaterWeight3607NotBetween(Double value1, Double value2) {
            addCriterion("C_FRESH_WATER_WEIGHT_3607 not between", value1, value2, "cFreshWaterWeight3607");
            return (Criteria) this;
        }

        public Criteria andCCabinInorout3607IsNull() {
            addCriterion("C_CABIN_INOROUT_3607 is null");
            return (Criteria) this;
        }

        public Criteria andCCabinInorout3607IsNotNull() {
            addCriterion("C_CABIN_INOROUT_3607 is not null");
            return (Criteria) this;
        }

        public Criteria andCCabinInorout3607EqualTo(String value) {
            addCriterion("C_CABIN_INOROUT_3607 =", value, "cCabinInorout3607");
            return (Criteria) this;
        }

        public Criteria andCCabinInorout3607NotEqualTo(String value) {
            addCriterion("C_CABIN_INOROUT_3607 <>", value, "cCabinInorout3607");
            return (Criteria) this;
        }

        public Criteria andCCabinInorout3607GreaterThan(String value) {
            addCriterion("C_CABIN_INOROUT_3607 >", value, "cCabinInorout3607");
            return (Criteria) this;
        }

        public Criteria andCCabinInorout3607GreaterThanOrEqualTo(String value) {
            addCriterion("C_CABIN_INOROUT_3607 >=", value, "cCabinInorout3607");
            return (Criteria) this;
        }

        public Criteria andCCabinInorout3607LessThan(String value) {
            addCriterion("C_CABIN_INOROUT_3607 <", value, "cCabinInorout3607");
            return (Criteria) this;
        }

        public Criteria andCCabinInorout3607LessThanOrEqualTo(String value) {
            addCriterion("C_CABIN_INOROUT_3607 <=", value, "cCabinInorout3607");
            return (Criteria) this;
        }

        public Criteria andCCabinInorout3607Like(String value) {
            addCriterion("C_CABIN_INOROUT_3607 like", value, "cCabinInorout3607");
            return (Criteria) this;
        }

        public Criteria andCCabinInorout3607NotLike(String value) {
            addCriterion("C_CABIN_INOROUT_3607 not like", value, "cCabinInorout3607");
            return (Criteria) this;
        }

        public Criteria andCCabinInorout3607In(List<String> values) {
            addCriterion("C_CABIN_INOROUT_3607 in", values, "cCabinInorout3607");
            return (Criteria) this;
        }

        public Criteria andCCabinInorout3607NotIn(List<String> values) {
            addCriterion("C_CABIN_INOROUT_3607 not in", values, "cCabinInorout3607");
            return (Criteria) this;
        }

        public Criteria andCCabinInorout3607Between(String value1, String value2) {
            addCriterion("C_CABIN_INOROUT_3607 between", value1, value2, "cCabinInorout3607");
            return (Criteria) this;
        }

        public Criteria andCCabinInorout3607NotBetween(String value1, String value2) {
            addCriterion("C_CABIN_INOROUT_3607 not between", value1, value2, "cCabinInorout3607");
            return (Criteria) this;
        }

        public Criteria andCSerialNumber3607IsNull() {
            addCriterion("C_SERIAL_NUMBER_3607 is null");
            return (Criteria) this;
        }

        public Criteria andCSerialNumber3607IsNotNull() {
            addCriterion("C_SERIAL_NUMBER_3607 is not null");
            return (Criteria) this;
        }

        public Criteria andCSerialNumber3607EqualTo(Long value) {
            addCriterion("C_SERIAL_NUMBER_3607 =", value, "cSerialNumber3607");
            return (Criteria) this;
        }

        public Criteria andCSerialNumber3607NotEqualTo(Long value) {
            addCriterion("C_SERIAL_NUMBER_3607 <>", value, "cSerialNumber3607");
            return (Criteria) this;
        }

        public Criteria andCSerialNumber3607GreaterThan(Long value) {
            addCriterion("C_SERIAL_NUMBER_3607 >", value, "cSerialNumber3607");
            return (Criteria) this;
        }

        public Criteria andCSerialNumber3607GreaterThanOrEqualTo(Long value) {
            addCriterion("C_SERIAL_NUMBER_3607 >=", value, "cSerialNumber3607");
            return (Criteria) this;
        }

        public Criteria andCSerialNumber3607LessThan(Long value) {
            addCriterion("C_SERIAL_NUMBER_3607 <", value, "cSerialNumber3607");
            return (Criteria) this;
        }

        public Criteria andCSerialNumber3607LessThanOrEqualTo(Long value) {
            addCriterion("C_SERIAL_NUMBER_3607 <=", value, "cSerialNumber3607");
            return (Criteria) this;
        }

        public Criteria andCSerialNumber3607In(List<Long> values) {
            addCriterion("C_SERIAL_NUMBER_3607 in", values, "cSerialNumber3607");
            return (Criteria) this;
        }

        public Criteria andCSerialNumber3607NotIn(List<Long> values) {
            addCriterion("C_SERIAL_NUMBER_3607 not in", values, "cSerialNumber3607");
            return (Criteria) this;
        }

        public Criteria andCSerialNumber3607Between(Long value1, Long value2) {
            addCriterion("C_SERIAL_NUMBER_3607 between", value1, value2, "cSerialNumber3607");
            return (Criteria) this;
        }

        public Criteria andCSerialNumber3607NotBetween(Long value1, Long value2) {
            addCriterion("C_SERIAL_NUMBER_3607 not between", value1, value2, "cSerialNumber3607");
            return (Criteria) this;
        }

        public Criteria andCConnectWay3607IsNull() {
            addCriterion("C_CONNECT_WAY_3607 is null");
            return (Criteria) this;
        }

        public Criteria andCConnectWay3607IsNotNull() {
            addCriterion("C_CONNECT_WAY_3607 is not null");
            return (Criteria) this;
        }

        public Criteria andCConnectWay3607EqualTo(String value) {
            addCriterion("C_CONNECT_WAY_3607 =", value, "cConnectWay3607");
            return (Criteria) this;
        }

        public Criteria andCConnectWay3607NotEqualTo(String value) {
            addCriterion("C_CONNECT_WAY_3607 <>", value, "cConnectWay3607");
            return (Criteria) this;
        }

        public Criteria andCConnectWay3607GreaterThan(String value) {
            addCriterion("C_CONNECT_WAY_3607 >", value, "cConnectWay3607");
            return (Criteria) this;
        }

        public Criteria andCConnectWay3607GreaterThanOrEqualTo(String value) {
            addCriterion("C_CONNECT_WAY_3607 >=", value, "cConnectWay3607");
            return (Criteria) this;
        }

        public Criteria andCConnectWay3607LessThan(String value) {
            addCriterion("C_CONNECT_WAY_3607 <", value, "cConnectWay3607");
            return (Criteria) this;
        }

        public Criteria andCConnectWay3607LessThanOrEqualTo(String value) {
            addCriterion("C_CONNECT_WAY_3607 <=", value, "cConnectWay3607");
            return (Criteria) this;
        }

        public Criteria andCConnectWay3607Like(String value) {
            addCriterion("C_CONNECT_WAY_3607 like", value, "cConnectWay3607");
            return (Criteria) this;
        }

        public Criteria andCConnectWay3607NotLike(String value) {
            addCriterion("C_CONNECT_WAY_3607 not like", value, "cConnectWay3607");
            return (Criteria) this;
        }

        public Criteria andCConnectWay3607In(List<String> values) {
            addCriterion("C_CONNECT_WAY_3607 in", values, "cConnectWay3607");
            return (Criteria) this;
        }

        public Criteria andCConnectWay3607NotIn(List<String> values) {
            addCriterion("C_CONNECT_WAY_3607 not in", values, "cConnectWay3607");
            return (Criteria) this;
        }

        public Criteria andCConnectWay3607Between(String value1, String value2) {
            addCriterion("C_CONNECT_WAY_3607 between", value1, value2, "cConnectWay3607");
            return (Criteria) this;
        }

        public Criteria andCConnectWay3607NotBetween(String value1, String value2) {
            addCriterion("C_CONNECT_WAY_3607 not between", value1, value2, "cConnectWay3607");
            return (Criteria) this;
        }

        public Criteria andCManager3607IsNull() {
            addCriterion("C_MANAGER_3607 is null");
            return (Criteria) this;
        }

        public Criteria andCManager3607IsNotNull() {
            addCriterion("C_MANAGER_3607 is not null");
            return (Criteria) this;
        }

        public Criteria andCManager3607EqualTo(String value) {
            addCriterion("C_MANAGER_3607 =", value, "cManager3607");
            return (Criteria) this;
        }

        public Criteria andCManager3607NotEqualTo(String value) {
            addCriterion("C_MANAGER_3607 <>", value, "cManager3607");
            return (Criteria) this;
        }

        public Criteria andCManager3607GreaterThan(String value) {
            addCriterion("C_MANAGER_3607 >", value, "cManager3607");
            return (Criteria) this;
        }

        public Criteria andCManager3607GreaterThanOrEqualTo(String value) {
            addCriterion("C_MANAGER_3607 >=", value, "cManager3607");
            return (Criteria) this;
        }

        public Criteria andCManager3607LessThan(String value) {
            addCriterion("C_MANAGER_3607 <", value, "cManager3607");
            return (Criteria) this;
        }

        public Criteria andCManager3607LessThanOrEqualTo(String value) {
            addCriterion("C_MANAGER_3607 <=", value, "cManager3607");
            return (Criteria) this;
        }

        public Criteria andCManager3607Like(String value) {
            addCriterion("C_MANAGER_3607 like", value, "cManager3607");
            return (Criteria) this;
        }

        public Criteria andCManager3607NotLike(String value) {
            addCriterion("C_MANAGER_3607 not like", value, "cManager3607");
            return (Criteria) this;
        }

        public Criteria andCManager3607In(List<String> values) {
            addCriterion("C_MANAGER_3607 in", values, "cManager3607");
            return (Criteria) this;
        }

        public Criteria andCManager3607NotIn(List<String> values) {
            addCriterion("C_MANAGER_3607 not in", values, "cManager3607");
            return (Criteria) this;
        }

        public Criteria andCManager3607Between(String value1, String value2) {
            addCriterion("C_MANAGER_3607 between", value1, value2, "cManager3607");
            return (Criteria) this;
        }

        public Criteria andCManager3607NotBetween(String value1, String value2) {
            addCriterion("C_MANAGER_3607 not between", value1, value2, "cManager3607");
            return (Criteria) this;
        }

        public Criteria andCStorePosition3607IsNull() {
            addCriterion("C_STORE_POSITION_3607 is null");
            return (Criteria) this;
        }

        public Criteria andCStorePosition3607IsNotNull() {
            addCriterion("C_STORE_POSITION_3607 is not null");
            return (Criteria) this;
        }

        public Criteria andCStorePosition3607EqualTo(String value) {
            addCriterion("C_STORE_POSITION_3607 =", value, "cStorePosition3607");
            return (Criteria) this;
        }

        public Criteria andCStorePosition3607NotEqualTo(String value) {
            addCriterion("C_STORE_POSITION_3607 <>", value, "cStorePosition3607");
            return (Criteria) this;
        }

        public Criteria andCStorePosition3607GreaterThan(String value) {
            addCriterion("C_STORE_POSITION_3607 >", value, "cStorePosition3607");
            return (Criteria) this;
        }

        public Criteria andCStorePosition3607GreaterThanOrEqualTo(String value) {
            addCriterion("C_STORE_POSITION_3607 >=", value, "cStorePosition3607");
            return (Criteria) this;
        }

        public Criteria andCStorePosition3607LessThan(String value) {
            addCriterion("C_STORE_POSITION_3607 <", value, "cStorePosition3607");
            return (Criteria) this;
        }

        public Criteria andCStorePosition3607LessThanOrEqualTo(String value) {
            addCriterion("C_STORE_POSITION_3607 <=", value, "cStorePosition3607");
            return (Criteria) this;
        }

        public Criteria andCStorePosition3607Like(String value) {
            addCriterion("C_STORE_POSITION_3607 like", value, "cStorePosition3607");
            return (Criteria) this;
        }

        public Criteria andCStorePosition3607NotLike(String value) {
            addCriterion("C_STORE_POSITION_3607 not like", value, "cStorePosition3607");
            return (Criteria) this;
        }

        public Criteria andCStorePosition3607In(List<String> values) {
            addCriterion("C_STORE_POSITION_3607 in", values, "cStorePosition3607");
            return (Criteria) this;
        }

        public Criteria andCStorePosition3607NotIn(List<String> values) {
            addCriterion("C_STORE_POSITION_3607 not in", values, "cStorePosition3607");
            return (Criteria) this;
        }

        public Criteria andCStorePosition3607Between(String value1, String value2) {
            addCriterion("C_STORE_POSITION_3607 between", value1, value2, "cStorePosition3607");
            return (Criteria) this;
        }

        public Criteria andCStorePosition3607NotBetween(String value1, String value2) {
            addCriterion("C_STORE_POSITION_3607 not between", value1, value2, "cStorePosition3607");
            return (Criteria) this;
        }

        public Criteria andCName3607IsNull() {
            addCriterion("C_NAME_3607 is null");
            return (Criteria) this;
        }

        public Criteria andCName3607IsNotNull() {
            addCriterion("C_NAME_3607 is not null");
            return (Criteria) this;
        }

        public Criteria andCName3607EqualTo(String value) {
            addCriterion("C_NAME_3607 =", value, "cName3607");
            return (Criteria) this;
        }

        public Criteria andCName3607NotEqualTo(String value) {
            addCriterion("C_NAME_3607 <>", value, "cName3607");
            return (Criteria) this;
        }

        public Criteria andCName3607GreaterThan(String value) {
            addCriterion("C_NAME_3607 >", value, "cName3607");
            return (Criteria) this;
        }

        public Criteria andCName3607GreaterThanOrEqualTo(String value) {
            addCriterion("C_NAME_3607 >=", value, "cName3607");
            return (Criteria) this;
        }

        public Criteria andCName3607LessThan(String value) {
            addCriterion("C_NAME_3607 <", value, "cName3607");
            return (Criteria) this;
        }

        public Criteria andCName3607LessThanOrEqualTo(String value) {
            addCriterion("C_NAME_3607 <=", value, "cName3607");
            return (Criteria) this;
        }

        public Criteria andCName3607Like(String value) {
            addCriterion("C_NAME_3607 like", value, "cName3607");
            return (Criteria) this;
        }

        public Criteria andCName3607NotLike(String value) {
            addCriterion("C_NAME_3607 not like", value, "cName3607");
            return (Criteria) this;
        }

        public Criteria andCName3607In(List<String> values) {
            addCriterion("C_NAME_3607 in", values, "cName3607");
            return (Criteria) this;
        }

        public Criteria andCName3607NotIn(List<String> values) {
            addCriterion("C_NAME_3607 not in", values, "cName3607");
            return (Criteria) this;
        }

        public Criteria andCName3607Between(String value1, String value2) {
            addCriterion("C_NAME_3607 between", value1, value2, "cName3607");
            return (Criteria) this;
        }

        public Criteria andCName3607NotBetween(String value1, String value2) {
            addCriterion("C_NAME_3607 not between", value1, value2, "cName3607");
            return (Criteria) this;
        }

        public Criteria andCHeight3607IsNull() {
            addCriterion("C_HEIGHT_3607 is null");
            return (Criteria) this;
        }

        public Criteria andCHeight3607IsNotNull() {
            addCriterion("C_HEIGHT_3607 is not null");
            return (Criteria) this;
        }

        public Criteria andCHeight3607EqualTo(Double value) {
            addCriterion("C_HEIGHT_3607 =", value, "cHeight3607");
            return (Criteria) this;
        }

        public Criteria andCHeight3607NotEqualTo(Double value) {
            addCriterion("C_HEIGHT_3607 <>", value, "cHeight3607");
            return (Criteria) this;
        }

        public Criteria andCHeight3607GreaterThan(Double value) {
            addCriterion("C_HEIGHT_3607 >", value, "cHeight3607");
            return (Criteria) this;
        }

        public Criteria andCHeight3607GreaterThanOrEqualTo(Double value) {
            addCriterion("C_HEIGHT_3607 >=", value, "cHeight3607");
            return (Criteria) this;
        }

        public Criteria andCHeight3607LessThan(Double value) {
            addCriterion("C_HEIGHT_3607 <", value, "cHeight3607");
            return (Criteria) this;
        }

        public Criteria andCHeight3607LessThanOrEqualTo(Double value) {
            addCriterion("C_HEIGHT_3607 <=", value, "cHeight3607");
            return (Criteria) this;
        }

        public Criteria andCHeight3607In(List<Double> values) {
            addCriterion("C_HEIGHT_3607 in", values, "cHeight3607");
            return (Criteria) this;
        }

        public Criteria andCHeight3607NotIn(List<Double> values) {
            addCriterion("C_HEIGHT_3607 not in", values, "cHeight3607");
            return (Criteria) this;
        }

        public Criteria andCHeight3607Between(Double value1, Double value2) {
            addCriterion("C_HEIGHT_3607 between", value1, value2, "cHeight3607");
            return (Criteria) this;
        }

        public Criteria andCHeight3607NotBetween(Double value1, Double value2) {
            addCriterion("C_HEIGHT_3607 not between", value1, value2, "cHeight3607");
            return (Criteria) this;
        }

        public Criteria andCFile3607IsNull() {
            addCriterion("C_FILE_3607 is null");
            return (Criteria) this;
        }

        public Criteria andCFile3607IsNotNull() {
            addCriterion("C_FILE_3607 is not null");
            return (Criteria) this;
        }

        public Criteria andCFile3607EqualTo(String value) {
            addCriterion("C_FILE_3607 =", value, "cFile3607");
            return (Criteria) this;
        }

        public Criteria andCFile3607NotEqualTo(String value) {
            addCriterion("C_FILE_3607 <>", value, "cFile3607");
            return (Criteria) this;
        }

        public Criteria andCFile3607GreaterThan(String value) {
            addCriterion("C_FILE_3607 >", value, "cFile3607");
            return (Criteria) this;
        }

        public Criteria andCFile3607GreaterThanOrEqualTo(String value) {
            addCriterion("C_FILE_3607 >=", value, "cFile3607");
            return (Criteria) this;
        }

        public Criteria andCFile3607LessThan(String value) {
            addCriterion("C_FILE_3607 <", value, "cFile3607");
            return (Criteria) this;
        }

        public Criteria andCFile3607LessThanOrEqualTo(String value) {
            addCriterion("C_FILE_3607 <=", value, "cFile3607");
            return (Criteria) this;
        }

        public Criteria andCFile3607Like(String value) {
            addCriterion("C_FILE_3607 like", value, "cFile3607");
            return (Criteria) this;
        }

        public Criteria andCFile3607NotLike(String value) {
            addCriterion("C_FILE_3607 not like", value, "cFile3607");
            return (Criteria) this;
        }

        public Criteria andCFile3607In(List<String> values) {
            addCriterion("C_FILE_3607 in", values, "cFile3607");
            return (Criteria) this;
        }

        public Criteria andCFile3607NotIn(List<String> values) {
            addCriterion("C_FILE_3607 not in", values, "cFile3607");
            return (Criteria) this;
        }

        public Criteria andCFile3607Between(String value1, String value2) {
            addCriterion("C_FILE_3607 between", value1, value2, "cFile3607");
            return (Criteria) this;
        }

        public Criteria andCFile3607NotBetween(String value1, String value2) {
            addCriterion("C_FILE_3607 not between", value1, value2, "cFile3607");
            return (Criteria) this;
        }

        public Criteria andCWidth3607IsNull() {
            addCriterion("C_WIDTH_3607 is null");
            return (Criteria) this;
        }

        public Criteria andCWidth3607IsNotNull() {
            addCriterion("C_WIDTH_3607 is not null");
            return (Criteria) this;
        }

        public Criteria andCWidth3607EqualTo(Double value) {
            addCriterion("C_WIDTH_3607 =", value, "cWidth3607");
            return (Criteria) this;
        }

        public Criteria andCWidth3607NotEqualTo(Double value) {
            addCriterion("C_WIDTH_3607 <>", value, "cWidth3607");
            return (Criteria) this;
        }

        public Criteria andCWidth3607GreaterThan(Double value) {
            addCriterion("C_WIDTH_3607 >", value, "cWidth3607");
            return (Criteria) this;
        }

        public Criteria andCWidth3607GreaterThanOrEqualTo(Double value) {
            addCriterion("C_WIDTH_3607 >=", value, "cWidth3607");
            return (Criteria) this;
        }

        public Criteria andCWidth3607LessThan(Double value) {
            addCriterion("C_WIDTH_3607 <", value, "cWidth3607");
            return (Criteria) this;
        }

        public Criteria andCWidth3607LessThanOrEqualTo(Double value) {
            addCriterion("C_WIDTH_3607 <=", value, "cWidth3607");
            return (Criteria) this;
        }

        public Criteria andCWidth3607In(List<Double> values) {
            addCriterion("C_WIDTH_3607 in", values, "cWidth3607");
            return (Criteria) this;
        }

        public Criteria andCWidth3607NotIn(List<Double> values) {
            addCriterion("C_WIDTH_3607 not in", values, "cWidth3607");
            return (Criteria) this;
        }

        public Criteria andCWidth3607Between(Double value1, Double value2) {
            addCriterion("C_WIDTH_3607 between", value1, value2, "cWidth3607");
            return (Criteria) this;
        }

        public Criteria andCWidth3607NotBetween(Double value1, Double value2) {
            addCriterion("C_WIDTH_3607 not between", value1, value2, "cWidth3607");
            return (Criteria) this;
        }

        public Criteria andCLength3607IsNull() {
            addCriterion("C_LENGTH_3607 is null");
            return (Criteria) this;
        }

        public Criteria andCLength3607IsNotNull() {
            addCriterion("C_LENGTH_3607 is not null");
            return (Criteria) this;
        }

        public Criteria andCLength3607EqualTo(Double value) {
            addCriterion("C_LENGTH_3607 =", value, "cLength3607");
            return (Criteria) this;
        }

        public Criteria andCLength3607NotEqualTo(Double value) {
            addCriterion("C_LENGTH_3607 <>", value, "cLength3607");
            return (Criteria) this;
        }

        public Criteria andCLength3607GreaterThan(Double value) {
            addCriterion("C_LENGTH_3607 >", value, "cLength3607");
            return (Criteria) this;
        }

        public Criteria andCLength3607GreaterThanOrEqualTo(Double value) {
            addCriterion("C_LENGTH_3607 >=", value, "cLength3607");
            return (Criteria) this;
        }

        public Criteria andCLength3607LessThan(Double value) {
            addCriterion("C_LENGTH_3607 <", value, "cLength3607");
            return (Criteria) this;
        }

        public Criteria andCLength3607LessThanOrEqualTo(Double value) {
            addCriterion("C_LENGTH_3607 <=", value, "cLength3607");
            return (Criteria) this;
        }

        public Criteria andCLength3607In(List<Double> values) {
            addCriterion("C_LENGTH_3607 in", values, "cLength3607");
            return (Criteria) this;
        }

        public Criteria andCLength3607NotIn(List<Double> values) {
            addCriterion("C_LENGTH_3607 not in", values, "cLength3607");
            return (Criteria) this;
        }

        public Criteria andCLength3607Between(Double value1, Double value2) {
            addCriterion("C_LENGTH_3607 between", value1, value2, "cLength3607");
            return (Criteria) this;
        }

        public Criteria andCLength3607NotBetween(Double value1, Double value2) {
            addCriterion("C_LENGTH_3607 not between", value1, value2, "cLength3607");
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