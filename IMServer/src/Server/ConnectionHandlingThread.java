package Server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


public class ConnectionHandlingThread extends Thread
{
	private boolean run;
	private Socket socket;
	
	public ConnectionHandlingThread(Socket socket)
	{
		this.socket = socket;
		this.run = true;
	}
	
	public void run()
	{
		InputStream inStr;
		OutputStream outStr;
		
		try
		{
			inStr = socket.getInputStream();
			outStr = socket.getOutputStream();
			
			
			while (run)
			{
				
			}
		}
		catch (Exception e)
		{

		}
	}

}
