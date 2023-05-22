package com.softbabysi.demo.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "CHILD_CARE_FORM")
public class ChildCareForm implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHILD_CARE_FORM_ID", nullable = false)
    private Integer childCareFormId;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CHILD_ID", nullable = false, unique = true)
    private Child child;

    @Column(name = "FROM_FIELD_1", nullable = false)
    private String fromField1;

    @Column(name = "FROM_FIELD_2", nullable = false)
    private String fromField2;

    @Column(name = "FROM_FIELD_3", nullable = false)
    private String fromField3;

    @Column(name = "FROM_FIELD_4", nullable = false)
    private String fromField4;

    @Column(name = "FROM_FIELD_5", nullable = false)
    private String fromField5;

    @Column(name = "FROM_FIELD_6", nullable = false)
    private String fromField6;

    @Column(name = "FROM_FIELD_7", nullable = false)
    private String fromField7;

    @Column(name = "FROM_FIELD_8", nullable = false)
    private String fromField8;

    @Column(name = "FROM_FIELD_9", nullable = false)
    private String fromField9;

    @Column(name = "FROM_FIELD_10", nullable = false)
    private String fromField10;

    @Column(name = "FROM_FIELD_11", nullable = false)
    private String fromField11;

    // Getters and setters...

    public ChildCareForm() {
    }

    // Constructor con todos los parámetros...

    public ChildCareForm(Integer childCareFormId, Child child, String fromField1, String fromField2, String fromField3, String fromField4, String fromField5, String fromField6, String fromField7, String fromField8, String fromField9, String fromField10, String fromField11) {
        this.childCareFormId = childCareFormId;
        this.child = child;
        this.fromField1 = fromField1;
        this.fromField2 = fromField2;
        this.fromField3 = fromField3;
        this.fromField4 = fromField4;
        this.fromField5 = fromField5;
        this.fromField6 = fromField6;
        this.fromField7 = fromField7;
        this.fromField8 = fromField8;
        this.fromField9 = fromField9;
        this.fromField10 = fromField10;
        this.fromField11 = fromField11;
    }

    public Integer getChildCareFormId() {
        return childCareFormId;
    }

    public void setChildCareFormId(Integer childCareFormId) {
        this.childCareFormId = childCareFormId;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public String getFromField1() {
        return fromField1;
    }

    public void setFromField1(String fromField1) {
        this.fromField1 = fromField1;
    }

    public String getFromField2() {
        return fromField2;
    }

    public void setFromField2(String fromField2) {
        this.fromField2 = fromField2;
    }

    public String getFromField3() {
        return fromField3;
    }

    public void setFromField3(String fromField3) {
        this.fromField3 = fromField3;
    }

    public String getFromField4() {
        return fromField4;
    }

    public void setFromField4(String fromField4) {
        this.fromField4 = fromField4;
    }

    public String getFromField5() {
        return fromField5;
    }

    public void setFromField5(String fromField5) {
        this.fromField5 = fromField5;
    }

    public String getFromField6() {
        return fromField6;
    }

    public void setFromField6(String fromField6) {
        this.fromField6 = fromField6;
    }

    public String getFromField7() {
        return fromField7;
    }

    public void setFromField7(String fromField7) {
        this.fromField7 = fromField7;
    }

    public String getFromField8() {
        return fromField8;
    }

    public void setFromField8(String fromField8) {
        this.fromField8 = fromField8;
    }

    public String getFromField9() {
        return fromField9;
    }

    public void setFromField9(String fromField9) {
        this.fromField9 = fromField9;
    }

    public String getFromField10() {
        return fromField10;
    }

    public void setFromField10(String fromField10) {
        this.fromField10 = fromField10;
    }

    public String getFromField11() {
        return fromField11;
    }

    public void setFromField11(String fromField11) {
        this.fromField11 = fromField11;
    }
}
