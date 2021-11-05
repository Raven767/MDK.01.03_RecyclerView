package com.example.ex2;

import java.util.ArrayList;

public class Contact {
    private String Name;
    private int foto;
    private int text;
    private int text2;
    private int text3;
    private int text4;

    public Contact(String name, int Foto, int Text,int Text2,int Text3,int Text4) {
        Name = name;
        foto = Foto;
        text = Text;
        text2 = Text2;
        text3 = Text3;
        text4 = Text4;
    }
    public String getName() {return Name;}
    public int getlastName() {return foto;}
    public int getText() {return text;}
    public int getText2() {return text2;}
    public int getText3() {return text3;}
    public int getText4() {return text4;}

    public static ArrayList<Contact> createContactsList(int numContacts) {
        int[] Mas = {R.string.Mat,R.string.Vas,R.string.Maks,R.string.Ivan};
        int[] rat ={R.string.Mat1,R.string.Vas1,R.string.Maks1,R.string.Ivan1};
        int[] Pop ={R.string.Mat2,R.string.Vas2,R.string.Maks2,R.string.Ivan2};
        int[] Hih ={R.string.Mat3,R.string.Vas3,R.string.Maks3,R.string.Ivan3};
        String[] Name={"Спиридонов Матвей","Баринов Василий","Горюнов Максим","Ермаков Иван"};
        int[] photo={R.drawable.img_2,R.drawable.___,R.drawable.photo_2021_01_27_11_09_24__3_,R.drawable.photo_2021_01_27_11_09_24__4_,};
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        for (int i = 1; i <= numContacts; i++) {
            contacts.add(new Contact(Name[i-1], photo[i-1],Mas[i-1],rat[i-1],Pop[i-1],Hih[i-1]));
        }
        return contacts;
    }
}
