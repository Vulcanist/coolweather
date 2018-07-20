package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

import javax.sql.DataSource;

/**
 * 记录国家的名字
 * Created by vulcan on 18-7-20.
 */

public class City extends DataSupport{
    private int id;

    private String cityName;

    private int cityCode;

    private int provinceId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getId() {

        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }
}
