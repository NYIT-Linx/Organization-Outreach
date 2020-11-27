package com.example.organizationoutreach;

public class club
{
    int Image1;
    String Name1;
    String Des1;

    public club(int image, String name, String des) {
        Image1 = image;
        Name1 = name;
        Des1 = des;
    }

    public String getDes() {
        return Des1;
    }

    public void setDes(String des) {
        Des1 = des;
    }

    public int getImage() {
        return Image1;
    }

    public void setImage(int image) {
        Image1 = image;
    }

    public String getName() {
        return Name1;
    }

    public void setName(String name) {
        Name1 = name;
    }
}
