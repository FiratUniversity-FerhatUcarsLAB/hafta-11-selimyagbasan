/*
 * Ad Soyad: Selim Yağbasan
 * Numara: 250541111
 * Tarih: 4.12.2025
 */
public class Exercise4_2 {


    public static void main(String[] args){                               //#1,9
        zippo("rattle", 13);
    }
    public static void baffle(String blimp) {                            //7
        System.out.println(blimp);                                       //#4
        zippo("ping", -5);                                       //#5   
    } 
    public static void zippo(String quince, int flag) {             
        if (flag < 0) {                                                 
            System.out.println(quince + " zoop");                       //#6    
        }else {                                                             
            System.out.println("ik");                                //#2
            baffle(quince);                                            //#3    
            System.out.println("boo-wa-ha-ha");                     //#8  
        }
    }
}
