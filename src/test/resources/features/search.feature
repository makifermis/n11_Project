Feature: n11 search and add to favorites functionality
  User story: -	Iphone kelimesi aranır.
  -	Iphone kelimesi aratıldığı kontrol edilir.
  -	Arama sonuçları sayfasından 2. sayfa açılır.
  -	2. sayfanın açıldığı kontrol edilir.
  -	Sayfadaki 3. ürün favorilere eklenir.
  -	Hesabım -> Favorilerim / Listelerim sayfasına gidilir.
  -	“Favorilerim” sayfası açıldığı kontrol edilir.
  -	Eklenen ürün favorilerden silinir ve silme işlemi kontrol edilir.

  @wip
  Scenario: Search functionality result verification
    Given user should be logged in
    When user types "Iphone" and clicks enter
    Then user sees "Iphone" in the page title

  @wip
  Scenario: Adding/deleting product to favorites and logout verification
    Given user sees "Iphone" in the page title
    When user clicks on second page
    And adds the third product into favorites
    And deletes the product from favorites
    Then user logs out


