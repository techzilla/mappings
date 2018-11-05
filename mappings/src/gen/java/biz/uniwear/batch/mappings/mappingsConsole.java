/**
 * mappingsConsole.java
 *
 * This file was generated by MapForce 2019.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */


package biz.uniwear.batch.mappings;

import com.altova.types.*;


public class mappingsConsole {

	public static void main(String[] args) {
		System.err.println("mappings Application");


		try { // BatchInventory
			TraceTargetConsole ttc = new TraceTargetConsole();


			BatchInventoryMapToBatch BatchInventoryMapToBatchObject = new BatchInventoryMapToBatch();

			//java.sql.DriverManager.setLogWriter(new java.io.PrintWriter(java.lang.System.err));


			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			BatchInventoryMapToBatchObject.registerTraceTarget(ttc);
	

			// run mapping
			//
			// you have different options to provide mapping input and output:
			//
			// files using file names (available for XML, text, and Excel):
			//   com.altova.io.FileInput(String filename)
			//   com.altova.io.FileOutput(String filename)
			//
			// streams (available for XML, text, and Excel):
			//   com.altova.io.StreamInput(java.io.InputStream stream)
			//   com.altova.io.StreamOutput(java.io.OutputStream stream)
			//
			// strings (available for XML and text):
			//   com.altova.io.StringInput(String xmlcontent)
			//   com.altova.io.StringOutput()	(call getContent() after run() to get StringBuffer with content)
			//
			// Java IO reader/writer (available for XML and text):
			//   com.altova.io.ReaderInput(java.io.Reader reader)
			//   com.altova.io.WriterOutput(java.io.Writer writer)
			//
			// DOM documents (for XML only):
			//   com.altova.io.DocumentInput(org.w3c.dom.Document document)
			//   com.altova.io.DocumentOutput(org.w3c.dom.Document document)
			// 
			// By default, run will close all inputs and outputs. If you do not want this,
			// call the following function:
			// BatchInventoryMapToBatchObject.setCloseObjectsAfterRun(false);

			{

				BatchInventoryMapToBatchObject.run(
						com.altova.db.Dbs.newConnection(
							"jdbc:odbc:MariaDB",
							"batch",
							"batch"),
						com.altova.db.Dbs.newConnection(
							"jdbc:odbc:MariaDB",
							"batch",
							"batch"));


			}



			System.err.println("Finished");
		} 
		catch (com.altova.UserException ue) 
		{
			System.err.print("USER EXCEPTION:");
			System.err.println( ue.getMessage() );
			System.exit(1);
		}
		catch (com.altova.AltovaException e)
		{
			System.err.print("ERROR: ");
			System.err.println( e.getMessage() );
			if (e.getInnerException() != null)
			{
				System.err.print("Inner exception: ");
				System.err.println(e.getInnerException().getMessage());
				if (e.getInnerException().getCause() != null)
				{
					System.err.print("Cause: ");
					System.err.println(e.getInnerException().getCause().getMessage());
				}
			}
			System.err.println("\nStack Trace: ");
			e.printStackTrace();
			System.exit(1);
		}
		
		catch (Exception e) {
			System.err.print("ERROR: ");
			System.err.println( e.getMessage() );
			System.err.println("\nStack Trace: ");
			e.printStackTrace();
			System.exit(1);
		}

		try { // Batch
			TraceTargetConsole ttc = new TraceTargetConsole();


			BatchMapToProductsMagento2 BatchMapToProductsMagento2Object = new BatchMapToProductsMagento2();

			//java.sql.DriverManager.setLogWriter(new java.io.PrintWriter(java.lang.System.err));


			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			BatchMapToProductsMagento2Object.registerTraceTarget(ttc);
	

			// run mapping
			//
			// you have different options to provide mapping input and output:
			//
			// files using file names (available for XML, text, and Excel):
			//   com.altova.io.FileInput(String filename)
			//   com.altova.io.FileOutput(String filename)
			//
			// streams (available for XML, text, and Excel):
			//   com.altova.io.StreamInput(java.io.InputStream stream)
			//   com.altova.io.StreamOutput(java.io.OutputStream stream)
			//
			// strings (available for XML and text):
			//   com.altova.io.StringInput(String xmlcontent)
			//   com.altova.io.StringOutput()	(call getContent() after run() to get StringBuffer with content)
			//
			// Java IO reader/writer (available for XML and text):
			//   com.altova.io.ReaderInput(java.io.Reader reader)
			//   com.altova.io.WriterOutput(java.io.Writer writer)
			//
			// DOM documents (for XML only):
			//   com.altova.io.DocumentInput(org.w3c.dom.Document document)
			//   com.altova.io.DocumentOutput(org.w3c.dom.Document document)
			// 
			// By default, run will close all inputs and outputs. If you do not want this,
			// call the following function:
			// BatchMapToProductsMagento2Object.setCloseObjectsAfterRun(false);

			{
				com.altova.io.Output ProductsMagento22Target = new com.altova.io.FileOutput("tmp/ProductsMagento2.csv");

				BatchMapToProductsMagento2Object.run(
						com.altova.db.Dbs.newConnection(
							"jdbc:odbc:MariaDB",
							"batch",
							"batch"),
						ProductsMagento22Target);


			}



			System.err.println("Finished");
		} 
		catch (com.altova.UserException ue) 
		{
			System.err.print("USER EXCEPTION:");
			System.err.println( ue.getMessage() );
			System.exit(1);
		}
		catch (com.altova.AltovaException e)
		{
			System.err.print("ERROR: ");
			System.err.println( e.getMessage() );
			if (e.getInnerException() != null)
			{
				System.err.print("Inner exception: ");
				System.err.println(e.getInnerException().getMessage());
				if (e.getInnerException().getCause() != null)
				{
					System.err.print("Cause: ");
					System.err.println(e.getInnerException().getCause().getMessage());
				}
			}
			System.err.println("\nStack Trace: ");
			e.printStackTrace();
			System.exit(1);
		}
		
		catch (Exception e) {
			System.err.print("ERROR: ");
			System.err.println( e.getMessage() );
			System.err.println("\nStack Trace: ");
			e.printStackTrace();
			System.exit(1);
		}

		try { // SPI
			TraceTargetConsole ttc = new TraceTargetConsole();


			SPIMapToBatch4 SPIMapToBatch4Object = new SPIMapToBatch4();

			//java.sql.DriverManager.setLogWriter(new java.io.PrintWriter(java.lang.System.err));


			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			SPIMapToBatch4Object.registerTraceTarget(ttc);
	

			// run mapping
			//
			// you have different options to provide mapping input and output:
			//
			// files using file names (available for XML, text, and Excel):
			//   com.altova.io.FileInput(String filename)
			//   com.altova.io.FileOutput(String filename)
			//
			// streams (available for XML, text, and Excel):
			//   com.altova.io.StreamInput(java.io.InputStream stream)
			//   com.altova.io.StreamOutput(java.io.OutputStream stream)
			//
			// strings (available for XML and text):
			//   com.altova.io.StringInput(String xmlcontent)
			//   com.altova.io.StringOutput()	(call getContent() after run() to get StringBuffer with content)
			//
			// Java IO reader/writer (available for XML and text):
			//   com.altova.io.ReaderInput(java.io.Reader reader)
			//   com.altova.io.WriterOutput(java.io.Writer writer)
			//
			// DOM documents (for XML only):
			//   com.altova.io.DocumentInput(org.w3c.dom.Document document)
			//   com.altova.io.DocumentOutput(org.w3c.dom.Document document)
			// 
			// By default, run will close all inputs and outputs. If you do not want this,
			// call the following function:
			// SPIMapToBatch4Object.setCloseObjectsAfterRun(false);

			{
				com.altova.io.Input InventorySPI2Source = com.altova.io.StreamInput.createInput("schema/InventorySPI.csv");

				SPIMapToBatch4Object.run(
						InventorySPI2Source,
						com.altova.db.Dbs.newConnection(
							"jdbc:odbc:MariaDB",
							"batch",
							"batch"));


			}



			System.err.println("Finished");
		} 
		catch (com.altova.UserException ue) 
		{
			System.err.print("USER EXCEPTION:");
			System.err.println( ue.getMessage() );
			System.exit(1);
		}
		catch (com.altova.AltovaException e)
		{
			System.err.print("ERROR: ");
			System.err.println( e.getMessage() );
			if (e.getInnerException() != null)
			{
				System.err.print("Inner exception: ");
				System.err.println(e.getInnerException().getMessage());
				if (e.getInnerException().getCause() != null)
				{
					System.err.print("Cause: ");
					System.err.println(e.getInnerException().getCause().getMessage());
				}
			}
			System.err.println("\nStack Trace: ");
			e.printStackTrace();
			System.exit(1);
		}
		
		catch (Exception e) {
			System.err.print("ERROR: ");
			System.err.println( e.getMessage() );
			System.err.println("\nStack Trace: ");
			e.printStackTrace();
			System.exit(1);
		}

	}
}


class TraceTargetConsole implements com.altova.TraceTarget {
	public void writeTrace(String info) {
		System.err.println(info);
	}
}
