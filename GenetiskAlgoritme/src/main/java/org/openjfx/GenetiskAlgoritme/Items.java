/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx.GenetiskAlgoritme;

/**
 *
 * @author edwardrostomian
 */
public class Items {

    public float price;

    public float weight;

    private int type;

    public String name;

    Items(int t) { // constructor

        type = t;
        
        switch (type) {

            case 1:
                name = "Kort";
                weight = 90;
                price = 150;
                break;
            case 2:
                name = "Kompas";
                weight = 130;
                price = 35;
                break;
            case 3:
                name = "Vand";
                weight = 1530;
                price = 200;
                break;
            case 4:
                name = "Sandwich";
                weight = 500;
                price = 160;
                break;
            case 5:
                name = "Sukker";
                weight = 150;
                price = 60;
                break;
            case 6:
                name = "Dåsemad";
                weight = 680;
                price = 45;
                break;
            case 7:
                name = "Banan";
                weight = 270;
                price = 60;
                break;
            case 8:
                name = "Æble";
                weight = 390;
                price = 40;
                break;
            case 9:
                name = "Ost";
                weight = 230;
                price = 30;
                break;
            case 10:
                name = "Øl";
                weight = 520;
                price = 10;
                break;
            case 11:
                name = "Solcreme";
                weight = 110;
                price = 70;
                break;
            case 12:
                name = "Kamera";
                weight = 320;
                price = 30;
                break;
            case 13:
                name = "T-shirt";
                weight = 240;
                price = 15;
                break;
            case 14:
                name = "Bukser";
                weight = 480;
                price = 10;
                break;
            case 15:
                name = "Paraply";
                weight = 730;
                price = 40;
                break;
            case 16:
                name = "Vandtætte bukser";
                weight = 420;
                price = 70;
                break;
            case 17:
                name = "Vandtæt overtøj";
                weight = 430;
                price = 75;
                break;
            case 18:
                name = "Pung";
                weight = 220;
                price = 80;
                break;
            case 19:
                name = "Solbriller";
                weight = 70;
                price = 20;
                break;
            case 20:
                name = "Håndkælde";
                weight = 180;
                price = 12;
                break;
            case 21:
                name = "Sokker";
                weight = 40;
                price = 50;
                break;
            case 22:
                name = "Bog";
                weight = 300;
                price = 10;
                break;
            case 23:
                name = "Notesbog";
                weight = 900;
                price = 1;
                break;
            case 24:
                name = "Telt";
                weight = 2000;
                price = 150;
                break;

            default:
                name = "No item";
                weight = 0;
                price = 0;
                break;

        }

    }

}
