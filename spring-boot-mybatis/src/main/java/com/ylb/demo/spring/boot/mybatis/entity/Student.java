package com.ylb.demo.spring.boot.mybatis.entity;

import javax.persistence.*;

@Table(name = "ylbdb..student")
public class Student {
    @Id
    @Column(name = "stu_id")
    private Integer stuId;

    @Column(name = "stu_name")
    private String stuName;

    @Column(name = "stu_age")
    private String stuAge;

    @Column(name = "class_id")
    private Integer classId;

    /**
     * @return stu_id
     */
    public Integer getStuId() {
        return stuId;
    }

    /**
     * @param stuId
     */
    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    /**
     * @return stu_name
     */
    public String getStuName() {
        return stuName;
    }

    /**
     * @param stuName
     */
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    /**
     * @return stu_age
     */
    public String getStuAge() {
        return stuAge;
    }

    /**
     * @param stuAge
     */
    public void setStuAge(String stuAge) {
        this.stuAge = stuAge;
    }

    /**
     * @return class_id
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * @param classId
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}