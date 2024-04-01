Feature: Navigate to the Olay Yeri Bilgileri and select İlce, Mahalle & Cadde/Sokak

  Scenario Outline: Login to the e-Devlet page, navigate to the link, select ilce, mahalle & cadde/sokak

    Given open the website
    #e-devlet sitesini açıyor.

    And click Giris Yap button
    #sağ üstteki giriş yap butonuna tıklıyor.

    And type tck "<tck>"
    #tc kimlik no girme kısmına tıklıyor ve tc kimlik no'sunu yazdırıyor.

    And type password "<password>"
    #şifre girme kısmına tıklıyor ve şifreyi yazdırıyor.

    And click on giris yap button
    #ikinci kere giriş yap butonuna tıklayarak e-Devlet sistemine giriş yaptırıyor.

    When navigate to the given link "<link>"
    #verilen linke yönlendirir.

    And click on ilce combo box "<box>"
    #ilçe combo box'tan verilen ilçeyi seçiyor.

    And click on mahalle combo box "<box2>"
    #mahalle combo box'tan verilen ilçeyi seçiyor.

    Then click the caddeSokak box "<box3>"
    #cadde/sokak combo box'tan verilen ilçeyi seçiyor.

    Examples:
      | tck | password | link | box | box2 | box3 |