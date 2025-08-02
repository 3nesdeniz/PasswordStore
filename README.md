# PasswordStore
Sayaç mantığıyla dinamik şifre kullanan, Java ile yazılmış basit terminal tabanlı parola yöneticisi.

Bu proje, Java ile geliştirilmiş basit bir terminal tabanlı parola yöneticisidir. Kullanıcıdan giriş bilgisi alır ve giriş başarılı olduğunda parola ekleme ve listeleme işlemlerine izin verir.

Giriş Sistemi

Giriş için sabit bir kullanıcı adı ve her girişte değişen dinamik bir şifre kullanılır.
	•	Kullanıcı adı: MasterAccount
	•	Şifre formatı: passwdmasterX

Buradaki X, sayac.txt adlı dosyada tutulan bir sayaçtır. Her girişte:
	1.	Sayaç değeri okunur (X)
	2.	Şifre passwdmasterX olarak beklenir
	3.	Giriş denemesinden sonra sayaç 1 artırılır

Bu sistem sayesinde her giriş için farklı bir şifre gerekir ve şifreler sadece sırasıyla kullanılabilir.

Özellikler
	•	Her girişte değişen şifre ile basit güvenlik mekanizması
	•	Başarılı giriş sonrası parola ekleme ve listeleme
	•	Tüm veriler .txt dosyalarında saklanır
	•	Uygulama tamamen terminal üzerinden çalışır
