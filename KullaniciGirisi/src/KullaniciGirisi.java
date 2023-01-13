import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {

        String userName,password;
        Scanner input=new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        userName=input.nextLine();
        System.out.print("Şifre: ");
        password=input.nextLine();

        if (userName.equals("doganccetin") && password.equals("patikagiris123"))
            {
            System.out.println("Başarılı Giriş.");
            }
        else
            {
                System.out.println("Hatalı Kullanıcı Adı veya Şifre!");
            }
  }
}