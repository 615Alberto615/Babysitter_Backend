package com.softbabysi.demo.Dto;

import com.softbabysi.demo.entity.Child;

public class ChildCareFormDto {
    private Integer childCareFormId;
    private Integer childId;
    private String fromField1;
    private String fromField2;
    private String fromField3;
    private String fromField4;
    private String fromField5;
    private String fromField6;
    private String fromField7;
    private String fromField8;
    private String fromField9;
    private String fromField10;
    private String fromField11;

    public ChildCareFormDto(Integer childCareFormId, Child childId, String fromField1, String fromField2, String fromField3, String fromField4, String fromField5, String fromField6, String fromField7, String fromField8, String fromField9, String fromField10, String fromField11) {
    }

    public ChildCareFormDto(Integer childCareFormId, Integer childId, String fromField1, String fromField2, String fromField3, String fromField4, String fromField5, String fromField6, String fromField7, String fromField8, String fromField9, String fromField10, String fromField11) {
        this.childCareFormId = childCareFormId;
        this.childId = childId;
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

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
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
