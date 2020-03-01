import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class dovizKuru {
    public static void main(String[] args) throws Exception {

        URL doviz = new URL("http://finans.mynet.com/doviz/eur-euro/");
        BufferedReader in= new BufferedReader(new InputStreamReader(doviz.openStream()));

        String euro;
        while ((euro=in.readLine()) !=null){
            System.out.println(euro);
        }
        in.close();



        URL doviz1 = new URL("https://kur.doviz.com/serbest-piyasa/amerikan-dolari");
        BufferedReader in1= new BufferedReader(new InputStreamReader(doviz1.openStream()));

        String dolar;
        while ((dolar=in.readLine()) !=null){
            System.out.println(dolar);
        }
        in.close();






        URL doviz2 = new URL("https://kur.doviz.com/serbest-piyasa/sterlin");
        BufferedReader in2= new BufferedReader(new InputStreamReader(doviz2.openStream()));

        String sterlin;
        while ((sterlin=in.readLine()) !=null){
            System.out.println(sterlin);
        }
        in.close();



    }

}
