/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaction;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Kaiser
 */
public class Mail {
    public void SendMail(String mailId,String message) throws IOException{
        Socket smtpSocket = null;
        DataOutputStream os = null;
        DataInputStream is = null;
       
        try {
            smtpSocket = new Socket("gmail-smtp-in-v4v6.l.google.com", 25);
            os = new DataOutputStream(smtpSocket.getOutputStream());
            is = new DataInputStream(smtpSocket.getInputStream());
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: " + e.getLocalizedMessage());
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: " + e.getLocalizedMessage());
        }
        // If everything has been initialized then we want to write some data
        // to the socket we have opened a connection to on port 25
        if (smtpSocket != null && os != null && is != null) {
            try {
                // The capital string before each colon has a special meaning to SMTP
                // you may want to read the SMTP specification, RFC1822/3
                checkResponse(is, "220");
                os.writeBytes("HELO mail\r\n");
                checkResponse(is, "250");
                os.writeBytes("MAIL From: <" + mailId + ">\r\n");
                checkResponse(is, "250");
                os.writeBytes("RCPT To: <" + "alam.kaiser20@gmail.com" + ">\r\n");
                checkResponse(is, "250");
                os.writeBytes("DATA\r\n");
                checkResponse(is, "354");
                os.writeBytes("From: " + mailId + "\r\n");
                os.writeBytes("To: " + "alam.kaiser20@gmail.com" + "\r\n");
                os.writeBytes("Subject: " + "important" + "\r\n");
                os.writeBytes("\r\n");
                os.writeBytes(message); // message body
                os.writeBytes("\r\n");
                os.writeBytes("\r\n.\r\n"); // End of mail
                os.flush();
                checkResponse(is, "250");
                os.writeBytes("QUIT\r\n");
                checkResponse(is, "221");
                // clean up:
                // close the output stream
                // close the input stream
                // close the socket
                os.close();
                is.close();
                smtpSocket.close();
            } catch (UnknownHostException e) {
                System.err.println("Trying to connect to unknown host: " + e);
            } catch (IOException e) {
                System.err.println("IOException:  " + e);
            }
        }
        
    }
    private boolean checkResponse(DataInputStream is, String statusCode) throws IOException {
        // keep on reading from/to the socket till we receive the "Ok" from SMTP,
        // once we received that then we want to break.
        String responseLine;
        if ((responseLine = is.readLine()) != null) {
            System.out.println("Server: " + responseLine);
            if (responseLine.indexOf(statusCode) != -1) {
                return true;
            }
        }
        throw new IOException("Unexpected response");
        //return false;
    }
            
}
