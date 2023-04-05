public class Main {
    public static void main(String[] args) {
        /*
       1. Stwórz interfejs Browser posiadający:
        a)	stątyczną stałą typu String ENGINE z wartością "WebKit"
        b)	domyślną metodę zwracającą ENGINE o nazwie getEngine()
        c)	metody nic nie zwracające gotoPage(String url), refreshPage(), bookmarkPage()
       2. Utwórz klasę Chrome implementującą interfejs Browser posiadającą:
        a)	zmienną protected String url
        b)	implementującą metody interfejsu,
        c)	goToPage(String url) zapisuje url w instancji klasy, wyświetlą
            w konsoli info "Chrome url: " + url
       5. Utwórz klasę Firefox podobnie jak Chrome
       4. W Main dodaj dwie zmienne typu Browser i przypisz do nich nowe instancje
          Chrome i Firefox, wywołaj na nich gotoPage() z dowolną stroną jako argument
         */

        Browser chrome = new Chrome();
        Browser firefox = new Firefox();
        chrome.gotoPage("www.wikann.pl");
        firefox.gotoPage("www.bhpszkolenia24.pl");

    }
}
