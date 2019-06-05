import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.URL;
import java.io.*; 
import java.net.MalformedURLException; 

class PornoScraper implements pornoInterface{

    BufferedInputStream bins;
    InputStream inStr;
    public PornoScraper(){
        this.pornoStart();
        this.pornoRequest();
        this.savePorno();
        this.pornoEnd();
    }

    public void pornoStart(){
        System.out.println("Pornograafia alustab!!!");
    }

    public void pornoRequest(){
        try
        {
            URL tempUrl = new URL("https://www.pornhub.com");
            inStr = tempUrl.openConnection().getInputStream();
            bins = new BufferedInputStream(inStr);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void savePorno(){
        try{
            FileOutputStream fostreame = new FileOutputStream("out.html");
            int c;
            while((c= bins.read())!=-1)
            {
                fostreame.write(c);
            }
            inStr.close();
            bins.close();
            fostreame.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void pornoEnd(){
        System.out.println("Pornograafia lõpetab!!!");
    }

}

interface pornoInterface{
    public void pornoStart();
    public void pornoRequest();
    public void savePorno();
    public void pornoEnd();
}