package com.gestion.ProjetGestion.Service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class HomeService {
    public String m1(){
        return "Bonjour tout le monde";
    }
    public LocalDate m2(){
        return LocalDate.now();
    }
    public String m3(){
        return "Bonsoir tout le monde";
    }

}
