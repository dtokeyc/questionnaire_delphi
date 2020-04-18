package com.djngroup.questionaire.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Integer lun;
    private Integer xuehao;
    private Double xiaofei_min;
    private Double xiaofei_zuigao;
    private Double xiaofei_zuishi;
    private Double xfzb_sp;
    private Double xfzb_ry;
    private Double xfzb_fs;
    private Double xfzb_tx;
    private Double xfzb_jw;
    private Double xfzb_zw;
    private Double xfzb_yx;

    public Integer getLun() {
        return lun;
    }

    public void setLun(Integer lun) {
        this.lun = lun;
    }

    public Integer getXuehao() {
        return xuehao;
    }

    public void setXuehao(Integer xuehao) {
        this.xuehao = xuehao;
    }

    public Double getXiaofei_min() {
        return xiaofei_min;
    }

    public void setXiaofei_min(Double xiaofei_min) {
        this.xiaofei_min = xiaofei_min;
    }

    public Double getXiaofei_zuigao() {
        return xiaofei_zuigao;
    }

    public void setXiaofei_zuigao(Double xiaofei_zuigao) {
        this.xiaofei_zuigao = xiaofei_zuigao;
    }

    public Double getXiaofei_zuishi() {
        return xiaofei_zuishi;
    }

    public void setXiaofei_zuishi(Double xiaofei_zuishi) {
        this.xiaofei_zuishi = xiaofei_zuishi;
    }

    public Double getXfzb_sp() {
        return xfzb_sp;
    }

    public void setXfzb_sp(Double xfzb_sp) {
        this.xfzb_sp = xfzb_sp;
    }

    public Double getXfzb_ry() {
        return xfzb_ry;
    }

    public void setXfzb_ry(Double xfzb_ry) {
        this.xfzb_ry = xfzb_ry;
    }

    public Double getXfzb_fs() {
        return xfzb_fs;
    }

    public void setXfzb_fs(Double xfzb_fs) {
        this.xfzb_fs = xfzb_fs;
    }

    public Double getXfzb_tx() {
        return xfzb_tx;
    }

    public void setXfzb_tx(Double xfzb_tx) {
        this.xfzb_tx = xfzb_tx;
    }

    public Double getXfzb_jw() {
        return xfzb_jw;
    }

    public void setXfzb_jw(Double xfzb_jw) {
        this.xfzb_jw = xfzb_jw;
    }

    public Double getXfzb_zw() {
        return xfzb_zw;
    }

    public void setXfzb_zw(Double xfzb_zw) {
        this.xfzb_zw = xfzb_zw;
    }

    public Double getXfzb_yx() {
        return xfzb_yx;
    }

    public void setXfzb_yx(Double xfzb_yx) {
        this.xfzb_yx = xfzb_yx;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
