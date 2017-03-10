package random;
import java.io.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
public class SendEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String to = "siddharthlanka@gmail.com";
		String from = "lsai.siddharth2014@vit.ac.in";
		String host = "localhost";
		Properties properties = System.getProperties();
		properties.setProperty("mailsmtp.host",host);

		

	}

}
