package com.program;

public class TipeDataNumber {
    public static void main(String[] args) {
        
          // TIPE DATA NUMBER
        
          // ---> INTEGER NUMBER <---
          byte iniByte = 100;
          // byte = -128 sampai 127 --->(1 byte)
        
          short iniShort = 1000;
          // short = -32.768 sampai 32.767 --->(2 bytes)
        
          int iniInt = 10000000;
          // int = -2.147.483.648 sampai 2.147.483.647 --->(4 bytes)
                
          long iniLong = 1000000000;
          // long = -9.223.372.036.854.775.808 sampai 9.223.372.036.854.775.807 --->(8 bytes)
           
          long iniLong2 = 1000000000L;
          // L diakhir angka menandakan bahwa ini tipe data  number Long
         
        
          // ---> FLOATING POINT NUMBER <---
          float iniFloat = 10.10F;
          // F diakhir angka menandakan bahwa ini tipe data number Float
        
          double iniDouble = 12.2424;
          
        
          // ---> LITERALS <---
          int decimalInt = 34;
          int hexaDecimal = 0xFFFFFF;
          int binaryDecimal = 0b10101010;
          
          
          
          // ---> UNDERSCORE <---
          
          long balance = 1_000_000_000_000L;
          int sum = 60_000_000;
          
          System.out.println(iniByte);
          System.out.println(iniShort);
          System.out.println(iniInt);
          System.out.println(iniLong);
          System.out.println(iniLong2);
          System.out.println(iniFloat);
          System.out.println(iniDouble);
          System.out.println(decimalInt);
          System.out.println(hexaDecimal);
          System.out.println(binaryDecimal);
          System.out.println(balance);
          System.out.println(sum);
        
          
    }
}
