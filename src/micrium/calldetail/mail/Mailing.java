/*-*
 *
 * FILENAME  :
 *    Mailing.java
 *
 * STATUS  :	
 *    2013 23:17:57  
 *
 *    
 * Copyright (c) 2012 SystemSoft Ltda. All rights reserved.
 *
 ****************************************************************/

package micrium.calldetail.mail;

import java.util.List;
import micrium.calldetail.result.Result;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.apache.log4j.Logger;

public class Mailing {

	private static Logger log = Logger.getLogger(Mailing.class);

	public synchronized Result sendMail(String subject, String mensaje, Attachment attachment, List<String> lstEmailsTo, List<String> lstEmailsCc,
			List<String> lstEmailsCco) {
		EmailConfig email = null;
		Result result= new Result();
		try {

			// Create the attachment
			EmailAttachment emailAttachment = new EmailAttachment();
			emailAttachment.setPath(attachment.getPath());
			emailAttachment.setDisposition(EmailAttachment.ATTACHMENT);
			emailAttachment.setDescription(attachment.getDescription());
			emailAttachment.setName(attachment.getName());

			// Create the email message
			email = new EmailConfig();
			email.agregarDestinatarios(lstEmailsTo, lstEmailsCc, lstEmailsCco);
			email.setSubject(subject);
			email.setHtmlMsg(mensaje);

			// add the attachment
			email.attach(emailAttachment);

			// send the email
			email.send();

			result.ok("Email enviado From:" + email.getFromAddress() + " To:" + email.getToAddresses() + " adjunto:" + attachment.getName()
					+ " subject:" + subject + ", mensaje:" + mensaje);
			log.info("Email enviado From:" + email.getFromAddress() + " To:" + email.getToAddresses() + " adjunto:" + attachment.getName()
					+ " subject:" + subject + ", mensaje:" + mensaje);
			return result;
		} catch (Exception e) {
			log.error("Email fallido  To:" + lstEmailsTo + " adjunto:" + attachment.getName() + " subject:" + subject + ", mensaje:" + mensaje, e);
			result.error("Email fallido  To:" + lstEmailsTo + " adjunto:" + attachment.getName() + " subject:" + subject + ", mensaje:" + mensaje);
			return result;
		}

		
	}

	// public static void enviarCorreoCuentaErick() {
	// Email email = new SimpleEmail();
	// email.setHostName("73.20.0.80");
	//
	// email.setSmtpPort(25);
	// email.setAuthenticator(new DefaultAuthenticator("hinojosae", "Faber788"));
	//
	// email.setStartTLSEnabled(false);
	// // email.setSSLOnConnect(false);
	// // email.setStartTLSRequired(false);
	// try {
	// email.setFrom("hinojosae@tigo.net.bo");
	// email.setSubject("TestMail");
	// email.setMsg("This is a test mail ... :-)");
	// email.addTo("marioae.inf@gmail.com");
	// email.send();
	//
	// System.out.println("enviado!");
	// } catch (EmailException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// }

	public static void enviarCorreoCuentaCallDetail1() {
		for (int i = 0; i < 10; i++) {

			Email email = new SimpleEmail();
			email.setHostName("73.20.0.206");

			email.setSmtpPort(25);
			email.setAuthenticator(new DefaultAuthenticator("web_detalle", "W3b_d3t4ll3"));

			email.setStartTLSEnabled(false);
			// email.setSSLOnConnect(false);
			email.setStartTLSRequired(false);
			try {
				email.setFrom("web_detalle@tigo.net.bo");
				email.setSubject("TestMail");
				email.setMsg("This is a test mail ... :-)");
				// email.addTo("marioae.inf@gmail.com");
				email.addTo("hinojosae@tigo.net.bo");
				email.send();

				System.out.println("enviado!");
			} catch (EmailException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void enviarCorreoCuentaCallDetail() {
		for (int i = 0; i < 1; i++) {

			Email email = new SimpleEmail();
			email.setHostName("73.20.0.80");

			email.setSmtpPort(25);
			email.setAuthenticator(new DefaultAuthenticator("servicio", "S3rv1c10"));

			email.setStartTLSEnabled(false);
			// email.setSSLOnConnect(false);
			email.setStartTLSRequired(false);
			try {
				email.setFrom("servicio@tigo.net.bo");
				email.setSubject("TestMail");
				email.setMsg("This is a test mail ... :-)");
				// email.addTo("marioae.inf@gmail.com");
				email.addTo("marioae.inf@gmail.com");
				email.send();

				System.out.println("enviado!");
			} catch (EmailException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/*public static void main(String[] args) {

	/*	try {
				ConectionManager conectionManager = ConectionManager.getInstance();
			
			if (!conectionManager.open()) {
				log.info("No se ha podido establecer conexion con la base de datos");
				return;
			}
			Result result = SysParameter.load(conectionManager);
			Attachment attachment = new Attachment();
			 attachment.setPath("C:/Users/pedro/Desktop/Detalles/detalleT123C5L75050000.xls");
			 //attachment.setDisposition(EmailAttachment.ATTACHMENT);
			 attachment.setDescription("Picture of John");
			 attachment.setName("detalleT123C5L75050000.xls");
			List<String> lst = new ArrayList<String>();
			lst.add("p.varper@gmail.com");
			Mailing m = new Mailing();
			boolean sw=m.sendMail("PRUEBA", "HOLA", attachment, lst, null,null);
			if(sw){
				System.out.println("ins");
			}else{
				System.out.println("ins");
				
			}*/
				

		/*	enviarCorreoCuentaCallDetail();
			Attachment a = new Attachment();
			List<String> lst = new ArrayList<String>();
			 lst.add("marioae.inf@hotmail.com");

			 Mailing m = new Mailing();
			 m.sendMail("Pruebita", "Mensaje de Prueba",a, lst, null, null);*/
			 
			//
			 
			// enviarCorreo();

		/*	 for (int i = 0; i < 1; i++) {
			 HtmlEmail email = new HtmlEmail();
			
			// // Create the attachment
			 EmailAttachment attachment = new EmailAttachment();
			 attachment.setPath("C:/Users/pedro/Desktop/Detalles/detalleT123C5L75050000.xls");
			 attachment.setDisposition(EmailAttachment.ATTACHMENT);
			 attachment.setDescription("Picture of John");
			 attachment.setName("detalle-sac.pdf");
			//
			 email.setHostName("smtp.googlemail.com");
			 email.setSmtpPort(465);
			 email.setAuthentication("marioae.inf", "marioaegooglecode*");
			 email.setSSLOnConnect(true);
			 email.setStartTLSEnabled(false);
			 email.setFrom("marioae.inf@gmail.com", "Administrador");
			//
			 email.addTo("p.varper@gmail.com");
			 email.setSubject("TestMail=");
			 email.setHtmlMsg("This is a test mail ... :-)");
			
			 email.attach(attachment);
			
			 String str = email.send();
			 System.out.println("enviado!: " + str);
			 }*/
			// "D:/Dasarrollo/Servidores/EAP-6.0.0.GA/jboss-eap-6.0/standalone/deployments/call-detail-web.war/reports/detalle-sac-{id}.pdf"
			// }

			// **************************************CUENTA DE ERICK ************************************
			// for (int i = 0; i < 15; i++) {
			// Email email = new SimpleEmail();
			// email.setHostName("73.20.0.80");
			//
			// email.setSmtpPort(25);
			// email.setAuthenticator(new DefaultAuthenticator("hinojosae", "Faber788"));
			//
			// email.setStartTLSEnabled(false);
			// // email.setSSLOnConnect(false);
			// // email.setStartTLSRequired(false);
			// email.setFrom("hinojosae@tigo.net.bo");
			// email.setSubject("TestMail");
			// email.setMsg("This is a test mail ... :-)");
			// email.addTo("marioae.inf@gmail.com");
			// email.send();
			//
			// System.out.println("enviado!");
			// }
			// ******************************************************************************************

			// Email email = new SimpleEmail();
			// email.setHostName("73.20.0.205");
			// email.setSmtpPort(25);
			// //email.setAuthentication("sysomos", "Telecel123");
			// email.setAuthenticator(new a)
			// email.setStartTLSEnabled(false);
			// email.setStartTLSRequired(false);
			//
			// email.setFrom("sysomos@tigo.net.bo");
			// email.setSubject("Este correo es de prueba ...");
			// email.setMsg("This is a test mail ...");
			// email.addTo("callisayat@tigo.net.bo");
			// String str = email.send();

			// Email email = new SimpleEmail();
			// email.setHostName("73.20.0.205");
			//
			// email.setSmtpPort(25);
			// email.setAuthenticator(new DefaultAuthenticator("sysomos", "Telecel123"));
			//
			// email.setStartTLSEnabled(false);
			// // email.setSSLOnConnect(false);
			// // email.setStartTLSRequired(false);
			// email.setFrom("sysomos@tigo.net.bo");
			// email.setSubject("TestMail");
			// email.setMsg("This is a test mail ... :-)");
			// email.addTo("marioae.inf@gmail.com");
			// // email.addTo("callisayar@tigo.net.bo");
			// email.send();

			// from = "notificacionsgc@tigo.net.bo";
			// pass = "N0t1f1c140nsgc";
			// Properties props = new Properties();
			// props.setProperty("mail.smtp.host", "73.20.0.80");
			// props.setProperty("mail.smtp.starttls.enable", "false");
			// props.setProperty("mail.smtp.starttls.required", "false");
			// props.setProperty("mail.smtp.port", "25");
			// props.setProperty("mail.smtp.user", from);
			// props.setProperty("mail.smtp.auth", "false");
			// session = Session.getDefaultInstance(props);
			//
			// List<String> ldestino = new ArrayList<String>();
			// List<String> lcopia = new ArrayList<String>();
			// List<String> loculto = new ArrayList<String>();
			// // ldestino.add("marioae.inf@gmail.com");
			// ldestino.add("mario.inf@gmail.com");
			// for (int i = 0; i < 1; i++) {
			// em.enviarMail("Mensaje de Alarma...!!!", "Esto es una prueba de Alarma.", ldestino, lcopia, loculto);
			// }

			// Email email = new SimpleEmail();
			// email.setHostName("73.20.0.80");
			//
			// email.setSmtpPort(25);
			// email.setAuthenticator(new DefaultAuthenticator("notificacionsgc", "Telecel321"));
			//
			// email.setStartTLSEnabled(false);
			// // email.setSSLOnConnect(false);
			// // email.setStartTLSRequired(false);
			// email.setFrom("notificacionsgc@tigo.net.bo");
			// email.setSubject("TestMail");
			// email.setMsg("This is a test mail ... :-)");
			// email.addTo("marioae.inf@gmail.com");
			// email.addTo("hinojosae@tigo.net.bo");
			// email.send();

			// System.out.println("enviado!");

	/*	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}*/

	/*public static boolean openPopConnection() {
		try {

			log.info("Abriendo Bandeja de Entrada de: " + "pizarroc@tigo.net.bo");
			Properties props = System.getProperties();
			props.setProperty("mail.store.protocol", "pop3");
			// props.setProperty("http.proxyHost", "73.24.0.131");
			// props.setProperty("http.proxyPort", "8080");
			// props.setProperty("mail.pop3.starttls.enable", "false");
			// props.setProperty("mail.pop3.port", "25");
			// props.setProperty("mail.pop3.socketFactory.port", "25");

			// sessionPop = Session.getInstance(props, new MailAuthenticator(username, password));
			// System.out.println("SESSION "+sessionPop);
			Session sessionPop = Session.getDefaultInstance(props, null);
			sessionPop.setDebug(true);
			Store store = sessionPop.getStore("pop3");

			sessionPop.setPasswordAuthentication(new URLName("pop3", "73.20.0.80", 110, null, "servicio", null), new PasswordAuthentication(
					"servicio@tigo.net.bo", "S3rv1c10"));

			store.connect("73.20.0.80", "servicio@tigo.net.bo", "S3rv1c10");
			Folder folder = store.getFolder("Inbox");
			folder.open(Folder.READ_WRITE);
			return true;

		} catch (NoSuchProviderException e) {
			log.error("Error al Abrir la Bandeja de Entrada", e);
			return false;

		} catch (MessagingException e) {
			log.error("Error al Abrir la Bandeja de Entrada", e);
			return false;
		}
	}
*/

}