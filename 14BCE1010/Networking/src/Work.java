import java.net.*;
import java.io.*;
public class Work {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL cric = new URL("http://www.espncricinfo.com/west-indies-v-india-2016/engine/match/1022593.html");
		BufferedReader in = new BufferedReader(new InputStreamReader(cric.openStream()));
        String inputLine;
        while((inputLine = in.readLine()) != null) {
        	System.out.println(inputLine);
        }
        in.close();
	}

}
