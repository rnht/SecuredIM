package Tests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Test;

public class TestTCP {

	@Test
	public void test() throws UnknownHostException, IOException {
		
		ServerSocket ssk = new ServerSocket(1000);
		Socket sk = new Socket("localhost", 1000);
		
		Socket sk2 = ssk.accept();
		OutputStream skOut = sk.getOutputStream();
		skOut.write(0);
		skOut.write(127);
		skOut.write(0);
		
		InputStream sk2In = sk2.getInputStream();
		byte[] b = new byte[32];
		int r = sk2In.read(b);
		
		assertEquals(3, r);
	}

}
