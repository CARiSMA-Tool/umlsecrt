/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE226_Sensitive_Information_Uncleared_Before_Release__basic_01.java
Label Definition File: CWE226_Sensitive_Information_Uncleared_Before_Release__basic.label.xml
Template File: point-flaw-01.tmpl.java
 */
/*
 * @description
 * CWE: 226 Sensitive Information Uncleared Before Release
 * Sinks:
 *    GoodSink: Sensitive info (password) is stored in a mutable object, but is zeroized after use
 *    BadSink : Sensitive info (password) is stored in a mutable object and is uncleared
 * Flow Variant: 01 Baseline
 *
 * */

package testcases.CWE226_Sensitive_Information_Uncleared_Before_Release;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CWE226_Sensitive_Information_Uncleared_Before_Release__basic_01
{
	private static final Logger logger =  Logger.getLogger(CWE226_Sensitive_Information_Uncleared_Before_Release__basic_01.class.getSimpleName());

	public void bad() throws Throwable
	{

		InputStreamReader readerInputStream = null;
		BufferedReader readerBuffered = null;
		final StringBuffer password = new StringBuffer();
		Connection dBConnection = null;

		/* read user input from console with readLine */
		try
		{
			readerInputStream = new InputStreamReader(System.in, "UTF-8");
			readerBuffered = new BufferedReader(readerInputStream);

			password.append(readerBuffered.readLine());

			dBConnection = DriverManager.getConnection("192.168.105.23", "sa", password.toString());
		}
		catch (final IOException exceptIO)
		{
			logger.log(Level.WARNING, "Error with stream reading", exceptIO);
		}
		catch (final SQLException exceptSql)
		{
			logger.log(Level.WARNING, "Error getting database connection", exceptSql);
		}
		finally
		{
			/* FLAW: the password is stored in a mutable object (StringBuffer) and it is not cleared */

			try
			{
				if (dBConnection != null)
				{
					dBConnection.close();
				}
			}
			catch (final SQLException exceptSql)
			{
				logger.log(Level.WARNING, "Error closing Connection", exceptSql);
			}

			try
			{
				if (readerBuffered != null)
				{
					readerBuffered.close();
				}
			}
			catch (final IOException exceptIO)
			{
				logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
			}

			try
			{
				if (readerInputStream != null)
				{
					readerInputStream.close();
				}
			}
			catch (final IOException exceptIO)
			{
				logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
			}
		}

	}

	public void good() throws Throwable
	{
		good1();
	}

	private void good1() throws Throwable
	{

		InputStreamReader readerInputStream = null;
		BufferedReader readerBuffered = null;
		final StringBuffer password = new StringBuffer();
		Connection dBConnection = null;

		/* read user input from console with readLine */
		try
		{
			readerInputStream = new InputStreamReader(System.in, "UTF-8");
			readerBuffered = new BufferedReader(readerInputStream);

			password.append(readerBuffered.readLine());

			dBConnection = DriverManager.getConnection("192.168.105.23", "sa", password.toString());
		}
		catch (final IOException exceptIO)
		{
			logger.log(Level.WARNING, "Error with stream reading", exceptIO);
		}
		catch (final SQLException exceptSql)
		{
			logger.log(Level.WARNING, "Error getting database connection", exceptSql);
		}
		finally
		{
			/* FIX: Zeroize the password */
			password.delete(0, password.length());

			try
			{
				if (dBConnection != null)
				{
					dBConnection.close();
				}
			}
			catch (final SQLException exceptSql)
			{
				logger.log(Level.WARNING, "Error closing Connection", exceptSql);
			}

			try
			{
				if (readerBuffered != null)
				{
					readerBuffered.close();
				}
			}
			catch (final IOException exceptIO)
			{
				logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
			}

			try
			{
				if (readerInputStream != null)
				{
					readerInputStream.close();
				}
			}
			catch (final IOException exceptIO)
			{
				logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
			}
		}

	}

	/* Below is the main(). It is only used when building this testcase on
	 * its own for testing or for building a binary to use in testing binary
	 * analysis tools. It is not used when compiling all the testcases as one
	 * application, which is how source code analysis tools are tested.
	 */
	public static void main(final String[] args) throws Throwable
	{
		new CWE226_Sensitive_Information_Uncleared_Before_Release__basic_01().good();
		new CWE226_Sensitive_Information_Uncleared_Before_Release__basic_01().bad();
	}
}

