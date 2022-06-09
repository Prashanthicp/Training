package com.cashapona.wrapperclass.jun07;

import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
public class LocalDateTimeExample {  
  public static void main(String[] args) {  
    LocalDateTime datetime1 = LocalDateTime.now();  
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    String formatDateTime = datetime1.format(format);   
    System.out.println(formatDateTime);    
  }  
}  