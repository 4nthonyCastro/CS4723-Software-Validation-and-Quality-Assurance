/*
 * Anthony Castro (fje987) - CS4723 - Project 1
 * September 28th 2018
 */
package org.apache.commons.mail;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import javax.mail.internet.InternetAddress;
import javax.naming.NamingException;
import javax.mail.MessagingException;
import javax.mail.Session;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.framework.TestCase;

/*
 * 
 */
public class EmailTest extends TestCase {

	protected SimpleEmail email;
	@Override
	protected void setUp() {
		System.out.println("Testing - setUp");
		email = new SimpleEmail();
	}
	//  Completed.
	
	/**
	 * Email addBcc(String... emails)
	 * @throws Exception   
	 **/
	@Test
	public void testAddBcc() throws Exception {
		System.out.println("Testing - testAddBcc");
		
		List<InternetAddress> aCollection = new ArrayList<InternetAddress>();		
		aCollection.add(new InternetAddress("anthony.castro.tech@gmail.com"));
		aCollection.add(new InternetAddress("maplestory@gmail.com"));
		aCollection.add(new InternetAddress("act7115@sbcglobal.net"));
		
		email.addBcc(new String[] {"anthony.castro.tech@gmail.com","maplestory@gmail.com","act7115@sbcglobal.net"});
		
		assertEquals(aCollection, email.getBccAddresses());
	}
	//	Completed
	
	/**
	 * Email addCc(String... emails)
	 * @throws Exception   
	 **/
	@Test
	public void testAddCc() throws EmailException {
		System.out.println("Testing - testAddCc");
		
		assertEquals(email.addCc("tech.anthony.castro@gmail.com"),email);
	}
	//	Completed
	

	/*
	 * void addHeader(String name, String value)
	 */
	/**
	 * void addHeader(String name, String value)
	 * @throws IllegalArgumentException   
	 **/
	@Test (expected = IllegalArgumentException.class)
	public void testAddHeader1() throws IllegalArgumentException {
		System.out.println("Testing - testAddHeader1");
		
		email.addHeader("Anthony Castro", "Test");
	}
	
	@Rule
	ExpectedException exception = ExpectedException.none();	
	//	Completed
	
	/**
	 * void addHeader(String name, String value)
	 * @throws IllegalArgumentException   
	 **/
	@Test (expected = IllegalArgumentException.class)
	public void testAddHeader2() throws IllegalArgumentException {
		System.out.println("Testing - testAddHeader2");
		
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("name can not be null or empty");
		try {
			email.addHeader(null, "Test");
			fail("Expected an IllegalArgumentException to be thrown");
		}
		catch (IllegalArgumentException argumentException) {
			assertTrue(argumentException.getMessage().equals("name can not be null or empty"));
		}
	}	
	//	Completed
	
	/**
	 * void addHeader(String name, String value)
	 * @throws IllegalArgumentException   
	 **/
	@Test (expected = IllegalArgumentException.class)
	public void testAddHeader3() throws IllegalArgumentException {
		System.out.println("Testing - testAddHeader3");
		
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("name can not be null or empty");
		try {
			email.addHeader("Anthony Castro", null);
			fail("Expected an IllegalArgumentException to be thrown");
		}
		catch (IllegalArgumentException argumentException) {
			assertTrue(argumentException.getMessage().equals("value can not be null or empty"));
		}
	}
	//	Completed
	
	/**
	 * Email addReplyTo(String email, String name)
	 * @throws EmailException   
	 **/
	@Test
	public void testAddReplyTo() throws EmailException {
		System.out.println("Testing - testAddReplyTo");
		
		assertEquals(email.addReplyTo("tech.anthony.castro@gmail.com"), email);
	}
	
	/*
	 * Function void buildMimeMessage()
	 */
	/**
	 * Function void buildMimeMessage()
	 * @throws EmailException   
	 **/
	@Test
	public void testBuildMimeMessage1() throws EmailException{
		System.out.println("Testing - testBuildMimeMessage1");
		
		email.setHostName("Test Host");
		email.setFrom("fje987@utsa.edu");
		email.addTo("maplestory@gmail.com");
		email.addCc("lillyisugly@yahoo.com");
		email.addBcc("lolaisalsougly@yahoo.com");
		email.addReplyTo("tacobell@gmail.com");
		email.addHeader("Test Header", "Test Header Value");email.setSubject("Test Subject");
		email.setCharset("UTF-8");
		try {
			email.buildMimeMessage();
		}
		catch (EmailException emailException) {
			System.out.println(emailException.toString());
		}
		catch (IllegalStateException stateException) {
			System.out.println(stateException);
		}
		}
	
	/**
	 * Function void buildMimeMessage2()
	 * @throws EmailException   
	 **/
	@Test
	public void testBuildMimeMessage2() throws EmailException{
		System.out.println("Testing - testBuildMimeMessage2");
		
		String string = new String();
		email.setHostName("Test Host");
		email.addTo("maplestory@gmail.com");
		email.setSubject("Test Subject");
		email.setCharset("UTF-8");
		email.setContent(null, null);
		try {
			email.buildMimeMessage();
		}
		catch (EmailException emailException) {
			System.out.println(emailException.toString());
		}
		catch (IllegalStateException stateException) {
			System.out.println(stateException);
		}
		email.setContent(new String(), "String");
		try {
			email.buildMimeMessage();
		}
		catch (EmailException emailException) {
			System.out.println(emailException.toString());
		}
		catch (IllegalStateException stateException) {
			System.out.println(stateException);
		}
	}
	
	/**
	 * Function void buildMimeMessage3()
	 * @throws EmailException   
	 **/
	@Test
	public void testBuildMimeMessage3() throws EmailException{
		System.out.println("Testing - testBuildMimeMessage3");
		
		String string = new String();
		email.setHostName("Test Host");
		email.setFrom("fje987@utsa.edu");
		email.setSubject("Test Subject");
		email.setCharset("UTF-8");
		email.setContent("A Test String", EmailConstants.TEXT_PLAIN);
		try {
			email.buildMimeMessage();
		}
		catch (EmailException emailException) {
			System.out.println(emailException.toString());
		}
		catch (IllegalStateException stateException) {
			System.out.println(stateException);
		}
	}
	//	Completed
	
	/**
	 * Function String getHostName()
	 * 
	 **/
	@Test
	public void testGetHostName() {
		System.out.println("Testing - testGetHostName");
		
		assertEquals(null, email.getHostName());
		email.setHostName("Host name");
		assertEquals("Host name", email.getHostName());
		email.setMailSession(Session.getInstance(System.getProperties()));
		assertEquals(null, email.getHostName());
	}
	//	Completed
	
	/**
	 * Session getMailSession()
	 * @throws EmailException, NamingException   
	 **/
	@Test
	public void testGetMailSession() throws EmailException, NamingException {
		System.out.println("Testing - testGetMailSession");
	
		try {
			email.setHostName("HostName");
			email.getMailSession();
		}
		catch (EmailException emailException) {
			assertTrue(emailException.getMessage().equals("Invalid Hostname for Mail Session"));
		}
	}
	//	Completed
	
	/*
	 * Function Date getSentDate()
	 */
	/**
	 * Function Date getSentDate()
	 *   
	 **/
	@Test
	public void testGetSentDate() {
		System.out.println("Testing - testGetSentDate");
		assertEquals(email.getSentDate(), new Date());
		
		Date date = new Date();
		email.setSentDate(date);
		assertEquals(email.getSentDate(), date);
	}
	//	Completed
	

	/**
	 * Function int getSocketConnectionTimeout()
	 * 
	 **/
	@Test
	public void testGetSocketConnectionTimeout() {
		System.out.println("Testing - testGetSocketConnectionTimeout");
		
		assertEquals(email.getSocketConnectionTimeout(), (int)email.getSocketConnectionTimeout());
	}
	
	
	/**
	 * Function String send()
	 * @throws EmailException.  
	 **/
	@Test
	public void testSend() throws EmailException{
		System.out.println("Testing - testSend");
		
		try
        {
		
		String messageID = email.send();
		email.buildMimeMessage();
		assertEquals(messageID, email.sendMimeMessage());
		
        }
        catch (EmailException e) {
        	System.out.println(e.toString());
        }
	}	
	//	Completed
	/**
	 * Function Email setFrom(String email)
	 * @throws EmailException.  
	 **/
	@Test
	public void testSetFrom() throws EmailException {
		System.out.println("Testing - testSetFrom");
		assertEquals(email.setFrom("tech.anthony.castro@gmail.com"), email);
	}
	//	Completed
	/**
	 * void updateContentType(String aContentType)
	 * 
	 **/
	@Test
	public void testUpdateContentType() {
		System.out.println("Testing - testContentType");
		
		email.updateContentType("Content Type");
		email.updateContentType(null);
		email.updateContentType("Content T; charset=ype");
		email.updateContentType("text/");
	}
	
	/**
	 * Should run after every test. 
	 * @see junit.framework.TestCase#tearDown()
	 **/
	@Override
	protected void tearDown() {
		System.out.println("Testing - tearDown");
		try{
			email = null; 
			assertNull(email);
			
			//assertEquals(aCollection, email.getBccAddresses());
		}catch (NullPointerException npe){
			System.err.println("Failed Test - tearDown");
			System.err.println(npe);
		}
	}
}
