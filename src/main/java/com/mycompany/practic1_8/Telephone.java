package com.mycompany.practic1_8;



    class Telephone {
    String model;
    String serialNumber;
    String color;
    boolean isMobile;

    public Telephone(String model, String serialNumber, String color, boolean isMobile) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.color = color;
        this.isMobile = isMobile;
    }

    
    @Override
    public String toString() {
        return "Telephone{" + "model='" + model + '\'' + ", serialNumber='" + serialNumber + '\'' + ", color='" + color + '\'' + ", isMobile= " + isMobile +'}';
    }
}

