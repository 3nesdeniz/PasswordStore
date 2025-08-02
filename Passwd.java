
import java.io.*;
import java.util.Scanner;


public class Passwd {
    private boolean isLogin = false;
    private String username = "MasterAccount";
    private String passwd = "passwdmaster";

    public boolean isIsLogin() {
        return isLogin;
    }

    public void setIsLogin(boolean isLogin) {
        this.isLogin = isLogin;
    }
     public static int sayac(String dosyaAdi) {
         //sayac fonksiyonu basit de olsa bir güvenlik sağlıyor harici bir kullanıcı şifreyi ele geçirse
         //bile sifre değişken olduğu için giriş yapamama ihtimali bulunuyor
         //her giriş yapıldığında şifre değişiyor kısaca
         //10 a geldiğinde 0lıyoruz ki yüksek sayılara gelmesin
        int sayac = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(dosyaAdi))) {
            sayac = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            sayac = 0;
        }
        int returnsayac = sayac;//arttırılmamış sayacı döndürmek için
        if(sayac>=10)
            sayac = 0;
        sayac++;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(dosyaAdi))) {
            bw.write(String.valueOf(sayac));
        } catch (Exception e) {
            System.out.println("Bir hata oluştu");
        }
        
        return returnsayac;
    }
    public Passwd(){
        String name;
        String pass;
        Scanner sc = new Scanner(System.in);
        int sayac = sayac("sayac.txt");
        for(int i=0;i<3;i++){
            System.out.println("Selam " + sayac + ". Kullanıcı");//kullanıcıya ufak bir ipucu
            System.out.print("Kullanıcı adını giriniz : ");
            name = sc.nextLine();
            System.out.print("Şifrenizi giriniz : ");
            pass = sc.nextLine();
            if(name.equals(username) && pass.equals(passwd+sayac)){
                System.out.println("Giriş Yaptınız...");
                isLogin = true;
                break;
            }else{
                System.out.println("Yanlış kullanıcı adı ya da şifre...");
            }
            

        }
    }
    public void ekle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Uygulama adı: ");
        String app = sc.nextLine();
        System.out.print("Kullanıcı adı: ");
        String user = sc.nextLine();
        System.out.print("Şifre : ");
        String pass = sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("parolalar.txt", true))) {
            bw.write(app + " | " + user + " | " + pass); // \n her sistemde optimize çalışmıyormuş
            bw.newLine();
            System.out.println("Parola başarıyla eklendi..");
        } catch (Exception e) {
            System.out.println("Dosyaya yazarken hata oluştu..");
        }
    }
    public void goster() {
        try (BufferedReader br = new BufferedReader(new FileReader("parolalar.txt"))) {
            String line;
            System.out.println("-> Kayıtlı Parolalar:");
            while ((line = br.readLine()) != null) {
                System.out.println("- " + line);
            }
        } catch (Exception e) {
            System.out.println("Parola dosyası bulunamadı");
        }
    }
}
