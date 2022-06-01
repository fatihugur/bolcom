package com.bol.base;


import com.bol.pages.*;

public class PageManager {
    public static HomePage homepage;
    public static KlantenservicePage klantenservicepage;

    public static void initialize(){
        homepage = new HomePage();
        klantenservicepage = new KlantenservicePage();

    }
}