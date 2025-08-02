
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Passwd user = new Passwd();
        if(user.isIsLogin()){
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.print("Seçiminizi giriniz\n Listelemek için ->1 \n Ekleme yapmak için ->2 \n Çıkmak için ->0"
                        + "\n :");
                int secim;
                secim = sc.nextInt();
                sc.nextLine();//hata oluşmaması için
                
                if(secim == 0){
                    break;
                }
                else if(secim==1){
                    user.goster();
                }
                else if(secim==2){
                    user.ekle();
                }
                else{
                    System.out.println("Yanlış bir Seçim Yaptınız");
                    
                }

            }
        }
        else{
            System.out.println("Çok fazla sayıda deneme yaptınız..");
        }
    }
}
