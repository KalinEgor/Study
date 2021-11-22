package com.company;
import java.lang.*;
public class Ball {
    private int volume;
    private int size;
    public Ball(int v,int s){
        volume = v;
        size = s;
    }
    public void setVolume(int volume){
        this.volume=volume;
    }
    public void setSize(int size){
        this.size=size;
    }
    public int getVolume(int volume){
        return volume;
    }
    public int getSize(int size){
        return size;
    }
    public boolean Deflation(){
        boolean defl;
        if ((size==5)&&(volume>=5572)){
            defl = true;
        }
        else if ((size==4)&&(volume>=3589)){
            defl = true;
        }
        else if ((size==3)&&(volume>=3052)){
            defl = true;
        }
        else if ((size==2)&&(volume>=1766)){
            defl= true;
        }
        else if ((size==1)&&(volume>=1244)){
            defl = true;
        }
        else{
            defl = false;
        }
        return defl;
    }

}